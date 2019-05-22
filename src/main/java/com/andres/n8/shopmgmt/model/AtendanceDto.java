package com.andres.n8.shopmgmt.model;

import java.sql.Date;

public class AtendanceDto {
	long id;
	long employeeId;
	long shopId;
	Date startDate;
	Date endDate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public long getShopId() {
		return shopId;
	}
	public void setShopId(long shopId) {
		this.shopId = shopId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
