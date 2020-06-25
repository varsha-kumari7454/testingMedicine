/**
  * Copyright (C) 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Copyright (C) 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;

import ninja.Context;
import ninja.Result;
import ninja.Results;
import ninja.params.Param;
import ninja.session.Session;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import dao.UserDao;
import models.User;

@Singleton
public class LoginLogoutController {
    
    @Inject
    UserDao userDao;
//    @Inject
//    BookDao bookDao;
    public long cuser;
    public static long temp;
    public int flag = 0;
    
    ///////////////////////////////////////////////////////////////////////////
    // Login
    ///////////////////////////////////////////////////////////////////////////
    public Result login(Context context) {
        return Results.html();
    }

    public Result loginPost(@Param("username") String username,
                            @Param("password") String password,
                            Context context) throws InterruptedException {

        boolean isUserNameAndPasswordValid = userDao.isUserAndPasswordValid(username, password);
        if (isUserNameAndPasswordValid) {
//        	User user = bookDao.currentuser(username);
//        	this.cuser = user.id;
//        	temp = this.cuser;
            Session session = context.getSession();
            session.put("username", username);
            
            	session.setExpiryTime(60000L);
            	
            
            context.getFlashScope().success("Login Successfull");
             
//            return Results.redirect("/");
            return Results.html().template("/views/ApplicationController/main.ftl.html");
        } else {
            // something is wrong with the input or password not found.
            context.getFlashScope().put("username", username);
//            context.getFlashScope().put("rememberMe", String.valueOf(rememberMe));
            context.getFlashScope().error("Invalid Credentials");
            return Results.redirect("/login");

        }

    }

    ///////////////////////////////////////////////////////////////////////////
    // Logout
    ///////////////////////////////////////////////////////////////////////////
    public Result logout(Context context) {

        // remove any user dependent information
        context.getSession().clear();
        context.getFlashScope().success("login.logoutSuccessful");
        temp = 0L;
        return Results.redirect("/");

    }

    public long getcuser() {
    	return temp;
    }


}
