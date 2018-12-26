package com.xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.Bean.Employee;
import com.Bean.Employees;

public class JAVABXexmple {

	private static final String File_Name="xmlEX.xml";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee emp = new Employee();
		
		 List<Employee> emplist;
		 emplist = new ArrayList<Employee>();
		 emplist.add(new Employee("Nrj",12,124,45754,"ksfd@gmail.com"));
		 emplist.add(new Employee("Nrj1",52,6124,845754,"tsasd@gmail.com"));
		 emplist.add(new Employee("Nrj2",42,7124,745754,"addf@gmail.com"));
		
		//emplist.forEach(System.out::Println);
		 
		javaObjectToXML(emplist);
		
		List<Employee> emplfile =javaXMLToObject();
		
		//emplfile.forEach(System.out::Println);
		
		
	}

	private static List<Employee> javaXMLToObject() {
		// TODO Auto-generated method stub
		
		try {
		JAXBContext context = JAXBContext.newInstance(Employees.class);
		
		Unmarshaller unmash = context.createUnmarshaller();
		
		List<Employee> emp =(List<Employee>)unmash.unmarshal(new File(File_Name));
		
		
		return emp;
		
		}catch(JAXBException e) {e.printStackTrace();}
		
		return null;
	}

	private static void javaObjectToXML(List<Employee> emp) {
		// TODO Auto-generated method stub
		//Employee empref = new Employee();
		
		try {
		JAXBContext context = JAXBContext.newInstance(Employees.class);
		Marshaller mash = context.createMarshaller();
		mash.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	
		//for debugging
		mash.marshal(emp, System.out);
		
		mash.marshal(emp,new File(File_Name));
		}
		catch(JAXBException e) {e.printStackTrace();}
	}

}
