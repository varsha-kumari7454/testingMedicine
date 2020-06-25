package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Stock{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
 	private int id;
	@Column(name="medicine_name")
	private String medicine_name;
	@Column(name="medicine_company")
	private String medicine_company;
	@Column(name="quantity")
	private Integer quantity;
	public Stock() {}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMedicineName() {
		return medicine_name;
	}
	public void setMedicineName(String MedicineName) {
		this.medicine_name = MedicineName;
	}
	public String getMedicineCompany() {
		return medicine_company;
	}
	public void setMedicineCompany(String MedicineCompany) {
		this.medicine_company = MedicineCompany;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer Quantity) {
		this.quantity = Quantity;
	}
}
