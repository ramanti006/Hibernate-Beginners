package OneToManyMapping;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( "OneToMany Mapping" );
        
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
//        
//        MobileInformation m1 = new MobileInformation();
//        MobileInformation m2 = new MobileInformation();
//        MobileInformation m3 = new MobileInformation();
//        
//        Customer c1 = new Customer();
////        Customer c2 = new Customer();
//        
//        m1.setMob_id(001);
//        m1.setMobname("Motorola");
//        m1.setMobModel("mot1235");
//        m1.setMobPrice("50000");
//        m1.setCustomer(c1);
//        
//        m2.setMob_id(002);
//        m2.setMobname("Reliance");
//        m2.setMobModel("rel2524");
//        m2.setMobPrice("48561");
//        m2.setCustomer(c1);
//        
////        m3.setMob_id(003);
////        m3.setMobname("Realme");
////        m3.setMobModel("mel2524");
////        m3.setMobPrice("40123");
//        
//        c1.setCust_id(124);
//        c1.setCustName("Rahul Sameer Arya");
//        c1.setEmail_Id("rahulsameer@gmail.com");
//        c1.setPhoneNo("78956515");
//        c1.setDate(Date.valueOf("2022-05-06"));
//        
//        List<MobileInformation> li = new ArrayList<MobileInformation>();
//        li.add(m1);
//        li.add(m2);
//        c1.setMobile(li);
        
        Session ss = factory.openSession();
        
        Customer cq =  ss.get(Customer.class, 124);
        
        System.out.println(cq);
        
        for( MobileInformation m3 : cq.getMobile())
        {
        	System.out.println(m3);
        }
        Transaction tx = ss.beginTransaction();
//        ss.save(m1);
//        ss.save(m2);
       // ss.save(m3);
        
//        ss.save(c1);
        
        tx.commit();
        
        ss.close();
        
        
        
        

	}

}
