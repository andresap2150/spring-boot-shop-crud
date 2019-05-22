package com.andres.n8.shopmgmt.repo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="atendance",schema="employee_atendance_n8")
public class Atendance {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private long employee_id;
	private long shop_id;
	private Date start_date;
	private Date end_date;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(long employee_id) {
		this.employee_id = employee_id;
	}
	public long getShop_id() {
		return shop_id;
	}
	public void setShop_id(long shop_id) {
		this.shop_id = shop_id;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
}
