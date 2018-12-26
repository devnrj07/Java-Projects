package com.ntl.dao;

import com.ntl.bean.Person;

public interface PersonDao {

public void create(Person p);
	
	public Person readById(String id);
	
	public void update(Person p);
	
	public int deleteById(String id);
	
}
