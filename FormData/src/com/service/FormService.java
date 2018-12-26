package com.service;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.Bean.Form;
import com.impl.FormImpl;
import com.util.Dbutil;

public class FormService implements Dbutil {
	
	private static final String File_Name="Order.xml";
	public void Pushdata(Form frb) {
		// TODO Auto-generated method stub
		FormImpl form = new FormImpl();
		form.Register(frb);
		
	}
		public String GenerateId() {
			String id="";
			int rand = (int) Math.round( Math.random()*999); 
			
			id="ORD"+rand;
			
			
			return id;
		}
		
	/*	public void javaObjectToXML(Form form) {
			
			try {
			JAXBContext context = JAXBContext.newInstance(Form.class);
			Marshaller mashobj = context.createMarshaller();
			mashobj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			mashobj.marshal(form,new File(File_Name));
			}catch(JAXBException ex) {
				ex.printStackTrace();
			}
			*/
			
		}
	

