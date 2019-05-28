package com.andres.n8.shopmgmt.repo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@ManyToOne
	@JoinColumn(name="employee_type")
	private EmployeeType employee_type;
	@OneToMany(mappedBy="employee", cascade=CascadeType.ALL)
	private Set<Atendance> atendances;
	
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
	public EmployeeType getEmployee_type() {
		return employee_type;
	}
	public void setEmployee_type(EmployeeType employee_type) {
		this.employee_type = employee_type;
	}

}
