package com.andres.n8.shopmgmt.model;

public class EmployeeDto {
	long id;
	String name;
	String telephone;
	String addres;
	long employee_type;
	
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
