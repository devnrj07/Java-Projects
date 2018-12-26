package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Bean.Employee;
import com.DButil.Dbutil;

public class EmployeeService implements Dbutil {

	Connection conn = Dbutil.super.getDBConnection();
	
	public void Register(Employee frb)
	{
	 try {
		 PreparedStatement ps = conn.prepareStatement("Insert into FormTable values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		 
		 ps.setString(1, frb.getEName());
		 ps.setInt(2,frb.getId());
		 ps.setInt(3,frb.getAge());
		 ps.setInt(4,frb.getSalary());
		 ps.setString(5,frb.getEmail());
		 
		 
        ps.executeUpdate();
	
    
	 }catch(SQLException sql) {sql.printStackTrace();}
	 
}	

		 
}


		
	
	


