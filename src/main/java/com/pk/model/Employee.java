package com.pk.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Table(name = "employee")
@Entity
public class Employee {
	
	@Id
	public int ENO;
	
	public String ENAME;
	
	public int SALARY;
	
	public int FK_DNO;
	
	@Transient
	public String DNO_SALARY;

	public int getENO() {
		return ENO;
	}

	public void setENO(int eNO) {
		ENO = eNO;
	}

	public String getENAME() {
		return ENAME;
	}

	public void setENAME(String eNAME) {
		ENAME = eNAME;
	}

	public String getDNO_SALARY() {
		return this.FK_DNO+" "+this.getSALARY();
	}

	public void setDNO_SALARY(String dNO_SALARY) {
		DNO_SALARY = dNO_SALARY;
	}

	public int getSALARY() {
		return SALARY;
	}

	public void setSALARY(int sALARY) {
		SALARY = sALARY;
	}

	public int getFK_DNO() {
		return FK_DNO;
	}

	public void setFK_DNO(int fK_DNO) {
		FK_DNO = fK_DNO;
	}

	public Employee(int eNO, String eNAME, int sALARY, int fK_DNO) {
		super();
		ENO = eNO;
		ENAME = eNAME;
		SALARY = sALARY;
		FK_DNO = fK_DNO;
	}

	public Employee() {
		super();
	}
	
	
	
	

}
