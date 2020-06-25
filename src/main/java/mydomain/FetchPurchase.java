package mydomain;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;

public class FetchPurchase throws Exception {
	@Inject
	Provider<EntityManager> entityManagerProvider;
	 @Transactional
	public String FetchValue()
	{
		 EntityManager em=entityManagerProvider.get();
		 String q6="";
		 Query q5=em.createQuery("select medicine_name from Purchase u where u.id=:medicine");
			q6=(String) q5.setParameter("medicine", 1).getSingleResult();
			return q6;
	}
	
public static void main(String args[])
{
	FetchPurchase obj=new FetchPurchase();
	System.out.println(obj.FetchValue());
	
}
}


