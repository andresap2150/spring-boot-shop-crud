package com.andres.n8.shopmgmt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andres.n8.shopmgmt.model.EmployeeDto;
import com.andres.n8.shopmgmt.repo.Employee;
import com.andres.n8.shopmgmt.repo.EmployeeRepository;
import com.andres.n8.shopmgmt.repo.EmployeeType;
import com.andres.n8.shopmgmt.repo.EmployeeTypeRepository;

@Component
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repo;
	@Autowired
	EmployeeTypeRepository typeRepo;
	
	public void add(EmployeeDto dto) {
		repo.save(toEntity(dto));
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
	
	public List<Employee> getEmployes() {
		return  (List<Employee>) repo.findAll();
	}

	public Employee getEmployeeById(long id) {
		Optional<Employee> optionalEmployee = repo.findById(id);
		return optionalEmployee.orElseThrow(()-> new EntityNotFoundException("employee", id+""));
	}
	
	private Employee toEntity(EmployeeDto dto) {
		EmployeeType type = typeRepo.findById(dto.getEmployee_type()).orElseThrow(()-> new EntityNotFoundException("EmployeeType", dto.getEmployee_type()+""));
		Employee entity = new Employee();
		entity.setName(dto.getName());
		entity.setAddres(dto.getAddres());
		entity.setTelephone(dto.getTelephone());
		entity.setEmployee_type(type); 
		return entity;
	}
}
