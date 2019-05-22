package com.andres.n8.shopmgmt.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeTypeRepository extends CrudRepository<EmployeeType, Long> {

}
