package com.ntl.eve.util.impl;

import com.ntl.evs.bean.CredentialsBean;
import com.ntl.evs.dao.CredentialsBeanDao;
import com.ntl.evs.dao.impl.CredentialsBeandaoimpl;
import com.ntl.evs.util.Authentication;

public class Authenticationimpl implements Authentication {

	
	CredentialsBeandaoimpl dbdata = new  CredentialsBeandaoimpl(); // from database
	CredentialsBeanDao cbdimpl = new CredentialsBeandaoimpl();  // from login user
	@Override
	public boolean authenticate(CredentialsBean user) {
		
	    //cbdata;  // from login page
        //datafromdb ; // from database
		//System.out.println("testing userinput id:"+cbdimpl.findByID(user.getUserId())+" testing database id:"+dbdata.findByID(user.getUserId()));
		
		if(cbdimpl.findByID(user.getUserId()).getUserId().equals(dbdata.findByID(user.getUserId()).getUserId())) {
			 System.out.println("User ID exists");
				 return true; //user exits
			 }	
			 
		
		return false;
		}
		
		
		

	@Override
	public String authorize(String userId) {
		
		
		// System.out.println("pass from user"+cbdimpl.findByID(userId).getPassword()+"pass from db"+dbdata.findByID(userId).getPassword());
		if(cbdimpl.findByID(userId).getPassword().equals(dbdata.findByID(userId).getPassword())) { // checking just the password based on userId
			 changeLoginStatus(cbdimpl.findByID(userId),cbdimpl.findByID(userId).getLoginstatus());
			 System.out.println("Login succesful!");
			      return dbdata.findByID(userId).getUsertype();
		}
		
		return "Unknown type";
	}

	@Override
	public boolean changeLoginStatus(CredentialsBean user, int loginStatus) {
		// TODO Auto-generated method stub
		if(user!=null)
		{   user.setLoginstatus(loginStatus^1);  //if 0 then 1, if 1 then 0
		     dbdata.updateUser(user); // loginstatus updated at database
		 return true;
		}else {
		return false;
		}
	}

}
