package com.pk;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import com.pk.model.Department;
import com.pk.model.Employee;
import com.pk.repository.DeptRepo;
import com.pk.repository.EmpRepo;


@SpringBootApplication
public class AssignmentApplication {
	
	 @Autowired
	 private EmpRepo repo;
	 
	 @Autowired
	 private DeptRepo deptrepo;

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
	}
	@PostConstruct
    private void initDb() {
        System.out.println(String.format("****** Creating table: %s, and Inserting test data ******", "Employees"));

        Employee sqlStatements[] = {
            new Employee(1,"Amal",30000,10),
            new Employee(2,"Shyamal",50000,30),  
            new Employee(3,"Kamal",10000,40),
            new Employee(4,"Nirmal",60000,50),
            new Employee(5,"Bimal",40000,20),
            new Employee(6,"Parimal",20000,10)};
        Department sqlStatement[] = {
            new Department(10, "Admin"), 
            new Department(20, "Accounts"),   
            new Department(30, "Sales"),
            new Department(40, "Marketing"), 
            new Department(50, "Purchasing")
        };

        Arrays.asList(sqlStatements).stream().forEach(sql -> {
            System.out.println(sql);
            repo.save(sql);
        });
        Arrays.asList(sqlStatement).stream().forEach(sql -> {
            System.out.println(sql);
            deptrepo.save(sql);
        });

    }

}
