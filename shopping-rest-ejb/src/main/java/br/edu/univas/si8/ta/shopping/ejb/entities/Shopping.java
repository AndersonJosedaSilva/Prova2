package br.edu.univas.si8.ta.shopping.ejb.entities;

import java.security.Timestamp;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "shopping")
@SequenceGenerator(name = "seq_shopping_order",
					sequenceName = "seq_shopping_order",
					allocationSize = 1)
public class Shopping {
	@Id
	@GeneratedValue(generator = "seq_shopping_order", strategy = GenerationType.SEQUENCE)
	private Integer id;

	private String desc;
	private Timestamp time;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public Shopping time(Timestamp time) {
		this.time = time;
		return this;
}
	
	

}
