package com.Bean;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="Employees")
public class Employees {
	
	private List<Employee> emp;
	
	public List<Employee> getEmployees(){
		
		return emp;
	}
	
	@XmlElement(name="Employee")
	public void setEmployees(List<Employee> employee){
		
		this.emp=employee;
		
		
	}

}
