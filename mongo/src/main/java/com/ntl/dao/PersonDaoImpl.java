package com.ntl.dao;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.mongodb.WriteResult;
import com.ntl.bean.Person;

public class PersonDaoImpl implements PersonDao {

	private MongoOperations mongoOps;
	private final String col_name ="Person";
	
	
	public PersonDaoImpl(MongoOperations mongoOps) {
		this.mongoOps=mongoOps;
	}
	
	
	
	public void create(Person p) {
		// TODO Auto-generated method stub
		this.mongoOps.insert(p, col_name);
		
	}

	public Person readById(String id) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("_id").is(id));
		
		return this.mongoOps.findOne(query, Person.class, col_name);
	}

	public void update(Person p) {
		// TODO Auto-generated method stub
		this.mongoOps.save(p,col_name);
		
	}

	public int deleteById(String id) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("_id").is(id));
		WriteResult wr = this.mongoOps.remove(query,Person.class,col_name);
		return wr.getN();
	}

}
