package br.edu.univas.si8.ta.shopping.ejb.entities;




import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "shopping")
@Table(name="shopping_order")
@SequenceGenerator(name = "seq_shopping_order",
					sequenceName = "seq_shopping_order",
					allocationSize = 1)
public class Shopping {
	@Id
	@GeneratedValue(generator = "seq_shopping_order", strategy = GenerationType.SEQUENCE)
	
	private Integer id;
@Column(name="description")
	private String desc;
@Column(name="order_time")
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
	public Shopping Desc(String desc) {
		this.desc = desc;
		return this;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public Shopping Time(Timestamp time) {
		this.time = time;
		return this;
}
	
	

}
