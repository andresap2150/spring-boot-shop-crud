package com.andres.n8.shopmgmt.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andres.n8.shopmgmt.model.EmployeeTypeDto;
import com.andres.n8.shopmgmt.repo.EmployeeType;
import com.andres.n8.shopmgmt.service.EmployeeTypeService;

@RestController
@RequestMapping("employeeTypes")
public class EmployeeTypeController {
	
	@Autowired
	EmployeeTypeService service;
	
	@GetMapping
	public List<EmployeeType> getTypes(){
		return service.getTypes();
	}

	@PostMapping
	public void createType(@RequestBody EmployeeTypeDto dto) {
		service.add(dto);
	}
	
	@GetMapping("/{id}")
	public EmployeeType getById(@PathVariable(required=true) long id) {		
		return service.getById(id);		
	}
	
	@DeleteMapping("/{id}")
	public void deleteType(@PathVariable(required=true) long id) {
		service.delete(id);
	}
}
