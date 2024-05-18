package com.map.ObjectState;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HouseWifeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println( "ObjectState..." );
        
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        
        //Transient State => where we only set value of the object
        HouseWife ob = new HouseWife();
        
        ob.setId(100);
        ob.setName("Manisha Sha");
        ob.setPhoneNo("984626556");
        
        Session ss = factory.openSession();
        Transaction tx = ss.beginTransaction();
        
        //Persisent State => When we save() .it will goto session and database  means your object present in database
        ss.save(ob);
        
        System.out.println(ob);
        ob.setName("Manti Devi"); // it will still reflect coz after this step only we are commiting
        tx.commit();
        ss.close();
        
        
        //Detached State =>object remove from session but it is present in database 
        ob.setName("Manti Shaw"); 
        
        System.out.println(ob);
        
        
        //Removed state => When we can delete() it will remove object from database but it will associate with session
	}

}
