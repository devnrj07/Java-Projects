package com.niit.nrj.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niit.model.Employee;
import com.niit.model.EmployeeConfig;
import com.niit.model.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello to Spring " );
        
   /*    AbstractApplicationContext ctx; // to call registerShutdownHook
        ctx= new ClassPathXmlApplicationContext("employee.xml");
       
        Employee emp=ctx.getBean("emp1", Employee.class);
       // Employee emp1=ctx.getBean("emp1", Employee.class);
        
       // emp=new Emplyee();
        //System.out.println(emp);
        
       emp.display();
        
       // ctx.registerShutdownHook(); // to call destroy method
        //System.out.println("OBJECT 2");
        
       
        AbstractApplicationContext ctx;
        ctx = new AnnotationConfigApplicationContext(EmployeeConfig.class);
       // Employee emp = ctx.getBean(Employee.class);// for single Bean(byType)
        Employee emp = (Employee)ctx.getBean("getEmployee1"); //byName
        
        System.out.println(emp);
        */
        
        
        ApplicationContext context = new ClassPathXmlApplicationContext("Employee.xml");
        
        Employee employee = (Employee) context.getBean("employee");
        employee.getEmpId();
        employee.getEmpname();
        
        
        System.out.println(employee.getSalary());
        
    }
}
