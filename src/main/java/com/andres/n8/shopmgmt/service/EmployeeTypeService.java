package com.andres.n8.shopmgmt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andres.n8.shopmgmt.model.EmployeeTypeDto;
import com.andres.n8.shopmgmt.repo.EmployeeType;
import com.andres.n8.shopmgmt.repo.EmployeeTypeRepository;

@Component
public class EmployeeTypeService {
	
	@Autowired
	EmployeeTypeRepository repository;
	
	public void add(EmployeeTypeDto dto) {
		repository.save(toEntity(dto));
	}
	
	public void delete(long id) {
		repository.deleteById(id);
	}
	
	public List<EmployeeType> getTypes(){
		return (List<EmployeeType>) repository.findAll();
	}
	
	public EmployeeType getById(long id) {
		Optional<EmployeeType> optionalType = repository.findById(id);
		return optionalType.orElseThrow(()->new EntityNotFoundException("employee_type", id+""));
	}

	private EmployeeType toEntity(EmployeeTypeDto dto) {
		EmployeeType entity = new EmployeeType();
		entity.setName(dto.getName());
		entity.setSalary(dto.getSalary());
		return entity;
	}
}
