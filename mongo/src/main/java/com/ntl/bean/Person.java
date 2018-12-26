 package com.ntl.bean;
 import org.springframework.data.annotation.Id;
public class Person {
	
	@Id
	private String Id;
	private String Name;
	private String Email;
	private int age;
	
	public Person() {}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [Id=" + Id + ", Name=" + Name + ", Email=" + Email + ", age=" + age + "]";
	}

	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param age
	 */
	public Person(String id, String name, String email, int age) {
		super();
		Id = id;
		Name = name;
		Email = email;
		this.age = age;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		Id = id;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
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
	
	

}
