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
        
        Person ob1 = new Person();
        Person ob2 = new Person();
        Person ob3 = new Person();
        
//        ob1.setId(1);
//        ob1.setName("Ramanti Shaw");
//        ob1.setEmail("ramanti@gmail.com");
//        
//        ob1.setId(2);
//        ob1.setName("Sunny Shekhar");
//        ob1.setEmail("sunny@gmail.com");
//        
        //to understand the logic of get() and load()
        ob3.setId(3);
        ob3.setName("Manti Debi");
        ob3.setEmail(null);
       
        
        Session ss = factory.openSession();
		Transaction tx = ss.beginTransaction();
		
//		ss.save(ob1);
//		ss.save(ob2);
		ss.save(ob3);
		tx.commit();
		ss.close();
        
        
        
        
    }
}
