package com.pk.repository;

import org.springframework.data.repository.CrudRepository;

import com.pk.model.Department;

public interface DeptRepo extends CrudRepository<Department, Integer> {

}
