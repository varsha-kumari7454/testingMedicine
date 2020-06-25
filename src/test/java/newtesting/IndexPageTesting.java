package newtesting;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import ninja.NinjaFluentLeniumTest;

public class IndexPageTesting extends NinjaFluentLeniumTest{
	 @Test
	    public void testThatHomepageWorks()   {
	        
	        goTo("/");
	        
	        System.out.println("title: " + window().title());
	        
	        assertTrue(window().title().contains("Index"));
	        
//	        $("#login").click();
	        
//	        assertTrue(url().contains("login"));
	 }
}
