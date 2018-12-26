package com.niit.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
	 @Bean
	  public Employee getEmployee()
	  {
		  
		  Employee emp2 = new Employee();
		  emp2.setEmpId(122);
		  emp2.setEmpname("NEWNRJ");
	      emp2.setSalary(333.33);
	   return emp2;
	  }
	 
	 @Bean
	  public Employee getEmployee1()
	  {
		  
		  Employee emp2 = new Employee();
		  emp2.setEmpId(123);
		  emp2.setEmpname("NEWNRJ1");
	      emp2.setSalary(444.44);
	   return emp2;
	  }
}
