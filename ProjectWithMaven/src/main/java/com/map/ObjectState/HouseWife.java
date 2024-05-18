package com.map.ObjectState;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "housewife")
public class HouseWife {
	
	@Id
	private int id;
	private String name;
	private String phoneNo;
	
	
	
	
	public HouseWife() {
		super();
	}

	public HouseWife(int id, String name, String phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "HouseWife [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + "]";
	}
	
	
	
	

}
