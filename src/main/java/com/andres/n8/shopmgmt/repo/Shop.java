package com.andres.n8.shopmgmt.repo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shop",schema="employee_atendance_n8")
public class Shop {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private String name;
	private String addres;
	private String telephone;
	
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
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
