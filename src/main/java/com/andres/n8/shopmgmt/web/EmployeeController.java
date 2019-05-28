package com.andres.n8.shopmgmt.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.andres.n8.shopmgmt.model.EmployeeDto;
import com.andres.n8.shopmgmt.repo.Employee;
import com.andres.n8.shopmgmt.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return service.getEmployes();
	}
	
	@PostMapping
	public void createEmployee(@RequestBody EmployeeDto dto) {
		service.add(dto);
	}
	
	@DeleteMapping("/{id}")
	public Employee deleteEmployee(@PathVariable(required=true) long id) {
		Employee deleted = service.getEmployeeById(id);
		service.delete(id);
		return deleted;
	}
}
