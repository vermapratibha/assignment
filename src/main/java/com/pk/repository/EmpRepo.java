package com.pk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pk.model.Employee;

public interface EmpRepo extends CrudRepository<Employee, Integer> {

	@Query("select e from Employee e where e.FK_DNO=?1")
	public List<Employee> empByDname(int DName);
}
