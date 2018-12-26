package com.ntl.nrj.mongo;

import java.net.UnknownHostException;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;


import com.mongodb.MongoClient;
import com.ntl.bean.Person;

/**
 * Hello world!
 *
 */
public class SpringMongo 
{
	public static final String DB_NAME = "dev_NRJ";
	public static final String PERSON_COLLECTION = "Person";
	public static final String MONGO_HOST = "localhost";
	public static final int MONGO_PORT = 27017;
	
    public static void main( String[] args )
    {
           
    	try {
			MongoClient mongo = new MongoClient(MONGO_HOST, MONGO_PORT);
			MongoOperations mongoOps = new MongoTemplate(mongo, DB_NAME);
			Person p = new Person("114", "Rakesh", "Noida", 42);
			mongoOps.insert(p, PERSON_COLLECTION);

			Person p1 = mongoOps.findOne(
					new Query(Criteria.where("Name").is("NRJ")),
					Person.class, PERSON_COLLECTION);

			System.out.println(p1);
			
			mongoOps.dropCollection(PERSON_COLLECTION);
			mongo.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
       
    }
}
