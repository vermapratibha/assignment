package com.pk.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "department")
@Entity
public class Department {

	@Id
	public int DNO;
	
	public String DNAME;
	
	public int getDNO() {
		return DNO;
	}
	public void setDNO(int dNO) {
		DNO = dNO;
	}
	public String getDNAME() {
		return DNAME;
	}
	public void setDNAME(String dNAME) {
		DNAME = dNAME;
	}
	public Department(int dNO, String dNAME) {
		super();
		DNO = dNO;
		DNAME = dNAME;
	}
	public Department() {
		super();
	}
	 
}
