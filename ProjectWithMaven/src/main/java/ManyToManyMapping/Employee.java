package ManyToManyMapping;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	private int emp_Id;
	
	@Column(name="EmployeeName")
	private String name;
	
	@ManyToMany
	@JoinTable(name = "empProjects",   
    joinColumns = { @JoinColumn(name = "emp_Project") },   
    inverseJoinColumns = { @JoinColumn(name = "empList") })  
	private List<Project> emp_Project;
	
	

	public Employee() {
		super();
	}



	public Employee(int emp_Id, String name, List<Project> emp_Project) {
		super();
		this.emp_Id = emp_Id;
		this.name = name;
		this.emp_Project = emp_Project;
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



	public List<Project> getEmp_Project() {
		return emp_Project;
	}



	public void setEmp_Project(List<Project> emp_Project) {
		this.emp_Project = emp_Project;
	}



	@Override
	public String toString() {
		return "Employee [emp_Id=" + emp_Id + ", name=" + name + ", emp_Project=" + emp_Project + "]";
	}
	
	
	
	
	
	

}
