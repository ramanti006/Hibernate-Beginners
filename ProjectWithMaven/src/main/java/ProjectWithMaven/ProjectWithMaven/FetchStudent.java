package ProjectWithMaven.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        Session ss = factory.openSession();
        
        //no student object present with id 5.it will give you null
        Person pr = ss.get(Person.class, 5);
        
        //no student object present with id 5.it will throw  org.hibernate.ObjectNotFoundException:
        Person pr1 = ss.load(Person.class, 5); 
        
        System.out.println(pr);
        System.out.println(pr.getEmail());
        System.out.println(pr1);
        System.out.println(pr1.getEmail());
        
        ss.close();
	}

}
