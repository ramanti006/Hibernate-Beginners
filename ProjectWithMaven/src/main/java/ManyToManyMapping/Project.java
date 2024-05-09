package ManyToManyMapping;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "project")
public class Project {
	
	@Id
	private int project_Id;
	
	@Column(name = "ProjectName")
	private String project_name;
	
	@ManyToMany
	private List<Employee> empList;

	public Project(int project_Id, String project_name, List<Employee> empList) {
		super();
		this.project_Id = project_Id;
		this.project_name = project_name;
		this.empList = empList;
	}

	public Project() {
		super();
	}

	public int getProject_Id() {
		return project_Id;
	}

	public void setProject_Id(int project_Id) {
		this.project_Id = project_Id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	@Override
	public String toString() {
		return "Project [project_Id=" + project_Id + ", project_name=" + project_name + ", empList=" + empList + "]";
	}
	
	
	
	

}
