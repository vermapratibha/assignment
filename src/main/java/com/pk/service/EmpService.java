package com.pk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.model.Department;
import com.pk.model.Employee;
import com.pk.repository.DeptRepo;
import com.pk.repository.EmpRepo;

@Service
public class EmpService {

	@Autowired
	EmpRepo empRepo;
	
	@Autowired
	DeptRepo deptRepo;
	
	public Employee getEmpByENO(int ENO) {
		return empRepo.findById(ENO).get();
	}

	public Department getDeptByDname(int dName) {
		return deptRepo.findById(dName).get();
	}
}
