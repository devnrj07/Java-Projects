package com.niit.model;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;


public class Employee {

	private int empId;
	private String empname;
	private double salary;
	
	private Project proj;
	
	
	
	
	public Employee() {}
	
	/**
	 * @param empId
	 * @param empname
	 * @param salary
	 * @param proj
	 * @param p1
	 */
	
	
	
	
	
	
	@Autowired
	public Employee(int empId, String empname, double salary, Project proj) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.salary = salary;
		this.proj = proj;
		
	}
	/**
	 * @return the proj2
	 */
	
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the empname
	 */
	public String getEmpname() {
		return empname;
	}
	/**
	 * @param empname the empname to set
	 */
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", salary=" + salary + "]";
	}
	
	
	public void display() {
		System.out.println(" EmpId "+ empId);
		System.out.println("Employee Name "+empname);
		System.out.println(" Salary "+salary);
		proj.display();
		
		
	}
	/**
	 * @return the proj
	 */
	public Project getProj() {
		return proj;
	}
	/**
	 * @param proj the proj to set
	 */
	public void setProj(Project proj) {
		this.proj = proj;
	}
	
	public void init() {System.out.println("This is init method");}
	
	public void destroy() {System.out.println("This is destroy method");}
	
}
