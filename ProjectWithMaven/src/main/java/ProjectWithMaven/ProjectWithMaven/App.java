package ProjectWithMaven.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        
        
        System.out.println("The session facatory Object=>"+factory);
        System.out.println("To check wheather factory is closed or not:"+ factory.isClosed());
        
        Person ob = new Person();
        
        ob.setId(1);
        ob.setName("Ramanti Shaw");
        ob.setEmail("ramanti@gmail.com");
        
        Session ss = factory.openSession();
		Transaction tx = ss.beginTransaction();
		
		ss.save(ob);
		tx.commit();
		ss.close();
        
        
        
        
    }
}
