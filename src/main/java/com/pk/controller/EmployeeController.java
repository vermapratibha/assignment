package com.pk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pk.model.Employee;
import com.pk.service.EmpService;
import java.util.List;

@RestController
public class EmployeeController {
	
	@Autowired
	EmpService empService;
	
	@GetMapping("/api")
	public ResponseEntity<Employee> getEmp(@RequestParam int ENO){
		return ResponseEntity.ok(empService.getEmpByENO(ENO));
	}
	
	@PostMapping("/api")
	public ResponseEntity<List<Employee>> getEmp2(@RequestParam int DName){
		return ResponseEntity.ok(empService.getEmpByDname(DName));
	}

}
