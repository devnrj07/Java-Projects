package com.ntl.nrj.mongo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ntl.bean.Person;
import com.ntl.dao.PersonDao;
import com.ntl.dao.PersonDaoImpl;

public class SpringXMLMongo {

   public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("SpringMongo.xml");
	
	PersonDao persondao = ctx.getBean("personDao", PersonDao.class);
	//PersonDaoImpl personimpl = ctx
	Person p = new Person(null, "NRJ", "Bangalore", 22);
	
	//create
	persondao.create(p);
	
	System.out.println("Generated ID="+p.getId());
	
	//read
	Person p1 = persondao.readById(p.getId());
	System.out.println("Retrieved by Id"+p1.getId());
	
	//update
	p1.setName("LORD VALDOMORT");p1.setEmail("nrj@gmail.com");
	persondao.update(p1);
	Person temp = persondao.readById(p1.getId());
	System.out.println("Retrieved Person after update="+temp);
	
	//delete
	//int count = persondao.deleteById(p1.getId());
	//System.out.println("Number of records deleted="+count);
	
	ctx.close();

}
}

