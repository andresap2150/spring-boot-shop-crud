package com.andres.n8.shopmgmt.repo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee",schema="employee_atendance_n8")
public class Employee {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private String name;
	private String telephone;
	private String addres;
	private long employee_type;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public long getEmployee_type() {
		return employee_type;
	}
	public void setEmployee_type(long employee_type) {
		this.employee_type = employee_type;
	}	
}
