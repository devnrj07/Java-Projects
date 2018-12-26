package com.ntl.eve.util.impl;

import com.ntl.evs.bean.CredentialsBean;
import com.ntl.evs.bean.ProfileBean;
import com.ntl.evs.dao.impl.CredentialsBeandaoimpl;
import com.ntl.evs.dao.impl.ProfileBeanDaoimpl;
import com.ntl.evs.util.Authentication;
import com.ntl.evs.util.User;

public class Userimpl implements  User {
	Authentication auth = new Authenticationimpl();
	
	@Override
	public String login(CredentialsBean credentialsBean) {
		// TODO Auto-generated method stub
		String type="";
		boolean result=false;
		
		
		//Authentication auth = new Authenticationimpl();
	    result=auth.authenticate(credentialsBean);
	   
	    
	    if(result) {
			type=auth.authorize(credentialsBean.getUserId());
			System.out.println("testing: type  "+type);
			
			if(type.equals("A"))
			{
		    	System.out.println("Type: "+type);
				return"Admin";
			}
			if(type.equals("E"))
			{
				return"EO";
			}
			if(type.equals("V")) {
				//System.out.println("Type: "+type);
				return"Voter";
			}
		
	 }
	    else {type="Fail";
			 
			 System.out.println("User Doesn't Exits\n"+"Please register first"); //debugging
			 return "Fail";
			}
	    return "Invalid";
	}
	
	@Override
	public String register(ProfileBean profileBean) {
		// TODO Auto-generated method stub
       String uid="";
       ProfileBeanDaoimpl pb = new ProfileBeanDaoimpl();
       uid=pb.createprofile(profileBean);
	 	
		return uid;
	}

	@Override
	public boolean logout(String userId) {
		// TODO Auto-generated method stub
		CredentialsBeandaoimpl dbdata = new  CredentialsBeandaoimpl();
		auth.changeLoginStatus(dbdata.findByID(userId), dbdata.findByID(userId).getLoginstatus()); // retriving obj using id and the login status
		//after retrieving changing the status
		
		             //backtomain
		
		return true;
	}

	@Override
	public String changePassword(CredentialsBean cb, String change) {
		// TODO Auto-generated method stub
		CredentialsBeandaoimpl dbdata = new  CredentialsBeandaoimpl();
		boolean flag=true; 
		dbdata.updatePassword(cb, change);
		if(flag) {return "Success";}
		else {return "Failed";}
	}

	

}
