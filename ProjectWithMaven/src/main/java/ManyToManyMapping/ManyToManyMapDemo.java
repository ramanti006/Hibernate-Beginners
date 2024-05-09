package ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		
		System.out.println( "ManyToMany Mapping" );
        
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        
        Employee em1 = new Employee();
        Employee em2 = new Employee();
        Employee em3 = new Employee();
        
        
        Project pr1 = new Project();
        Project pr2  = new Project();
        
        pr1.setProject_Id(01245);
        pr1.setProject_name("Citi Bank");
        
        pr2.setProject_Id(01255);
        pr2.setProject_name("SBI Bank");
        
        em1.setEmp_Id(19051);
        em1.setName("Ramanti Shaw");
        
        em2.setEmp_Id(20153);
        em2.setName("Thameem Ansari");
        
//        em3.setEmp_Id(19586);
//        em3.setName("Thenambigai Sabam");
//        em3.se
        
        List<Project> li1 = new ArrayList<Project>();
        li1.add(pr1);
        li1.add(pr2);
        
        List<Employee> li2 = new ArrayList<Employee>();
        li2.add(em1);
        li2.add(em2);
        
        em1.setEmp_Project(li1);
        em2.setEmp_Project(li1);
        
        pr1.setEmpList(li2);
        pr2.setEmpList(li2);
        
        Session ss = factory.openSession();
        Transaction tx = ss.beginTransaction();
        
        ss.save(em1);
        ss.save(em2);
        ss.save(pr1);
        ss.save(pr2);
        
        tx.commit();
        
        ss.close();
        
        
        
        
	}

}
