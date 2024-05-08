package OneToManyMapping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "mobileInformation")
public class MobileInformation {
	
	@Id
	private int mob_id;
	
	@Column(name = "Mobile_Name")
	private String mobname;
	
	@Column(name = "Mobile_Model")
	private String mobModel;
	
	@Column(name = "Mobile_Price")
	private String mobPrice;
	
	@ManyToOne
	private Customer customer;

	public MobileInformation() {
		super();
	}

	

	public MobileInformation(int mob_id, String mobname, String mobModel, String mobPrice, Customer customer) {
		super();
		this.mob_id = mob_id;
		this.mobname = mobname;
		this.mobModel = mobModel;
		this.mobPrice = mobPrice;
		this.customer = customer;
	}



	public int getMob_id() {
		return mob_id;
	}

	public void setMob_id(int mob_id) {
		this.mob_id = mob_id;
	}

	public String getMobname() {
		return mobname;
	}

	public void setMobname(String mobname) {
		this.mobname = mobname;
	}

	public String getMobModel() {
		return mobModel;
	}

	public void setMobModel(String mobModel) {
		this.mobModel = mobModel;
	}

	public String getMobPrice() {
		return mobPrice;
	}

	public void setMobPrice(String mobPrice) {
		this.mobPrice = mobPrice;
	}
	
	

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "MobileInformation [mob_id=" + mob_id + ", mobname=" + mobname + ", mobModel=" + mobModel + ", mobPrice="
				+ mobPrice + "]";
	}
	
	
	
	

}
