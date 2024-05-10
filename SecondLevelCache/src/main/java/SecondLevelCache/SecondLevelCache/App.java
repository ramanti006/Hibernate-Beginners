package SecondLevelCache.SecondLevelCache;

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
        System.out.println( "2nd level caching" );
        
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        
        Employee em1 = new Employee();
        Employee em2 = new Employee();
        
        em1.setEmp_Id(1990503);
        em1.setName("Ramanti Shaw");
        
        em2.setEmp_Id(20215);
        em2.setName("Sunny SHekhar");
        
        //FirstSession
        Session ss = factory.openSession();
       // Transaction tx = ss.beginTransaction();
        
//        ss.save(em1);
//        ss.save(em2);
        
        Employee e = ss.get(Employee.class, 1990503);
        
        System.out.println(e);
        ss.close();
        
        //SecondSession
        
        Session ss1 = factory.openSession();
        Employee e1 = ss1.get(Employee.class, 20215);
        
        System.out.println(e1);
        
       // tx.commit();
        
        ss1.close();
        		
    
    }
}
