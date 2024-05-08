package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( "Hello World!" );
        
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        
        Question q1 = new Question();
        Question q2 = new Question();

        
        Answer a1 = new Answer();
        a1.setAns_id(244);
        a1.setAns("Java is a programming language");
        
        Answer a2 = new Answer();
        a2.setAns_id(104);
        a2.setAns("Java Framework");
        
        q1.setQus_id(1);
        q1.setQuestion("Whar is JAVA?");
        q1.setAns(a1);
        
        a1.setQus(q1);
        
        q2.setQus_id(2);
        q2.setQuestion("Whar is Spring_Boot?");
        q2.setAns(a2);
        
        a2.setQus(q2);
        
        Session ss = factory.openSession();
        Transaction tx = ss.beginTransaction();
        
        ss.save(q1);
        ss.save(a1);
        ss.save(q2);
        ss.save(a2);
        tx.commit();
        ss.close();
        

	}

}
