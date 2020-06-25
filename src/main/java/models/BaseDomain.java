package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseDomain{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
 	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
//	
}
