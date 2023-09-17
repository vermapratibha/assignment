package com.pk.repository;

import org.springframework.data.repository.CrudRepository;

import com.pk.model.Employee;

public interface EmpRepo extends CrudRepository<Employee, Integer> {

}
