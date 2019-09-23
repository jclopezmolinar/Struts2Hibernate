package org.websparrow.model;

import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = -6622491173648785509L;
	private Long empId;
	private String empName;
	private String empDept;
	private String empSalary;
	private String empEmail;
	
	public Employee(){
		//TODO Auto-generated constructor stub
		
	}
	
	public Employee(String empName, String empDept, String empSalary, String empEmail){
		this.empName = empName;
		this.empDept = empDept;
		this.empSalary = empSalary;
		this.empEmail = empEmail;
	}
	
	public Long getEmpId(){
		return empId;
	}
	
	public void setEmpId(Long empId){
		this.empId = empId;
	}
	
	public String getEmpName(){
		return empName;
	}
	
	public void setEmpName(String empName){
		this.empName = empName;
	}
	
	public String getEmpDept(){
		return empDept;
	}
	
	public void setEmpDept(String empDept){
		this.empDept = empDept;
	}
	
	public String getEmpSalary(){
		return empSalary;
	}
	
	public void setEmpSalary(String empSalary){
		this.empSalary = empSalary;
	}
	
	public String getEmpEmail(){
		return empEmail;
	}
	
	public void setEmpEmail(String empEmail){
		this.empEmail = empEmail;
	}

}
