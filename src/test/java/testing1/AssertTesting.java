package testing1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Test;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;
public class AssertTesting {
	@Inject
	static
	Provider<EntityManager> entityManagerProvider;
	static String q6;
	@Transactional
	public static void method1()
	{
		
		
		EntityManager em=entityManagerProvider.get();
		Query q5=em.createQuery("select medicine_name from Stock u where u.id=:medicine");
		q6=(String) q5.setParameter("medicine", 2).getSingleResult();
		System.out.println(q6);
	}
	   @Test
	   public void StockTesting() {
	      assertNull(q6);
	   }
	 public static void main(String args[])
	 {
		 method1();
	 }
	 }


