package com.Bean;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Employee")
//@XmlType(propOrder = {"EName", "id", "age", "salary","Email"})

public class Employee {

	String EName;
	int id;
	int age;
	int salary;
	String Email;
	
	
	public Employee() {}
	
	
	
	/**
	 * @param eName
	 * @param id
	 * @param age
	 * @param salary
	 * @param email
	 */
	public Employee(String eName, int id, int age, int salary, String email) {
		super();
		EName = eName;
		this.id = id;
		this.age = age;
		this.salary = salary;
		Email = email;
	}
	
	public String toString() {
		return "EName: "+ this.EName+" ID :"+this.id+" Age:"+this.age+" Salary :"+this.salary+" Email :"+this.Email;
	}
	/**
	 * @return the eName
	 */
	
	@XmlAttribute
	public String getEName() {
		return EName;
	}
	/**
	 * @param eName the eName to set
	 */
	public void setEName(String eName) {
		EName = eName;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the salary
	 */
	@XmlElement(name = "sal")
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/**
	 * @return the email
	 */
	
	@XmlTransient
	public String getEmail() {
		return Email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}
}
