package OneToManyMapping;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="customer")
public class Customer {
	
	@Id
	private int cust_id;
	
	@Column(name="CustomerName")
	private String custName;
	
	@Column(name="PhoneNumber")
	private String phoneNo;
	
	@Column(name="EmailAddess")
	private String email_Id;
	
	@Column(name = "DateOfPurchase")
	private Date date;
	
	@OneToMany(mappedBy = "customer")
	private List<MobileInformation> mobile;

	public Customer(int cust_id, String custName, String phoneNo, String email_Id, Date date,
			List<MobileInformation> mobile) {
		super();
		this.cust_id = cust_id;
		this.custName = custName;
		this.phoneNo = phoneNo;
		this.email_Id = email_Id;
		this.date = date;
		this.mobile = mobile;
	}

	public Customer() {
		super();
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail_Id() {
		return email_Id;
	}

	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<MobileInformation> getMobile() {
		return mobile;
	}

	public void setMobile(List<MobileInformation> mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", custName=" + custName + ", phoneNo=" + phoneNo + ", email_Id="
				+ email_Id + ", date=" + date + ", mobile=" + mobile + "]";
	}
	
	
	
	
	
	

}
