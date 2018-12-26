package com.mongodb.Dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.converter.EmployeeConverter;
import com.mongodb.model.Employee;

public class EmployeeDao {
	
	private DBCollection col;

	public EmployeeDao(com.mongodb.client.MongoClient mongo) {
		this.col = ((Mongo) mongo).getDB("NewDB").getCollection("Employees");
	}

	public Employee createEmployee(Employee p) {
		DBObject doc = EmployeeConverter.toDBObject(p);
		this.col.insert(doc);
		ObjectId id = (ObjectId) doc.get("_id");
		p.setId(id.toString());
		return p;
	}

	public void updateEmployee(Employee p) {
		DBObject query = BasicDBObjectBuilder.start()
				.append("_id", new ObjectId(p.getId())).get();
		this.col.update(query, EmployeeConverter.toDBObject(p));
	}

	public List<Employee> readAllEmployee() {
		List<Employee> data = new ArrayList<Employee>();
		DBCursor cursor = col.find();
		while (cursor.hasNext()) {
			DBObject doc = cursor.next();
			Employee p = EmployeeConverter.toEmployee(doc);
			data.add(p);
		}
		return data;
	}

	public void deleteEmployee(Employee p) {
		DBObject query = BasicDBObjectBuilder.start()
				.append("_id", new ObjectId(p.getId())).get();
		this.col.remove(query);
	}

	public Employee readEmployee(Employee p) {
		DBObject query = BasicDBObjectBuilder.start()
				.append("_id", new ObjectId(p.getId())).get();
		DBObject data = this.col.findOne(query);
		return EmployeeConverter.toEmployee(data);
	}

}
