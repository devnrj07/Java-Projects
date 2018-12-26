package com.mongodb.converter;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import com.mongodb.model.Employee;

public class EmployeeConverter {
	
	// convert Person Object to MongoDB DBObject
	// take special note of converting id String to ObjectId
  
	public static DBObject toDBObject(Employee p) {

		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start()
				.append("name", p.getName()).append("Salary", p.getSalary()).append("age", p.getAge());
		if (p.getId() != null)
			builder = builder.append("_id", new ObjectId(p.getId()));
		return builder.get();
	}

	// convert DBObject Object to Person
	// take special note of converting ObjectId to String
	public static Employee toEmployee(DBObject doc) {
		Employee p = new Employee();
		p.setName((String) doc.get("name"));
		p.setSalary((double) doc.get("salary"));
		p.setAge((int) doc.get("age"));
		ObjectId id = (ObjectId) doc.get("_id");
		
		p.setId(id.toString());
		return p;

	}
	 


}
