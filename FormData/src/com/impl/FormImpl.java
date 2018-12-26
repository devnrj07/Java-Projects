package com.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Bean.Form;
import com.dao.FormDao;
import com.util.Dbutil;

public class FormImpl implements Dbutil {

	Connection conn = Dbutil.super.getDBConnection();
	public void Register(Form frb) {
		// TODO Auto-generated method stub
		
		
		 try {
			 PreparedStatement ps = conn.prepareStatement("Insert into FormTable values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			 
			 ps.setString(1, frb.getOrderId());
			 ps.setString(2,frb.getFirstName());
			 ps.setString(3,frb.getLastName());
			 ps.setString(4,frb.getEmail());
			 ps.setString(5,frb.getT_Model());
			 ps.setString(6,frb.getSize());
			 ps.setString(7, frb.getQuantity());
			 ps.setObject(8,frb.getDeliveryDate());
			 ps.setString(9,frb.getAddress1());
			 ps.setString(10,frb.getAddress2());
             ps.setString(11,frb.getCity());
             ps.setString(12,frb.getState());
             ps.setString(13,frb.getZipcode());
             ps.setString(14,frb.getCountry());
			 
             ps.executeUpdate();
			 
         
		 }catch(SQLException sql) {sql.printStackTrace();}
		 
	}	
	
	
}
