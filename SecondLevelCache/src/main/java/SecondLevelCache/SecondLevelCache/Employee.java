package SecondLevelCache.SecondLevelCache;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;



@Entity
@Table(name = "employee")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Employee {
	
	@Id
	private int emp_Id;
	
	@Column(name="EmployeeName")
	private String name;
	
	
	

	public Employee() {
		super();
	}



	public Employee(int emp_Id, String name) {
		super();
		this.emp_Id = emp_Id;
		this.name = name;
		
	}



	public int getEmp_Id() {
		return emp_Id;
	}



	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}






	@Override
	public String toString() {
		return "Employee [emp_Id=" + emp_Id + ", name=" + name + "]";
	}
	
	
	
	
	
	

}
