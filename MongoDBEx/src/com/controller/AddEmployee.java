package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mongodb.Dao.EmployeeDao;
import com.mongodb.client.MongoClient;
import com.mongodb.model.Employee;

public class AddEmployee {
	
	public class AddPersonServlet extends HttpServlet {

		private static final long serialVersionUID = -7060758261496829905L;

		protected void doPost(HttpServletRequest request,
				HttpServletResponse response) throws ServletException, IOException {
			String name = request.getParameter("name");
			double salary = Double.parseDouble(request.getParameter("salary"));
			int age  = Integer.parseInt(request.getParameter("age"));
			if ((name == null || name.equals(""))
					|| (salary == 0.0)) {
				request.setAttribute("error", "Mandatory Parameters Missing");
				RequestDispatcher rd = getServletContext().getRequestDispatcher(
						"/employee.jsp");
				rd.forward(request, response);
			} else {
				Employee p = new Employee();
				p.setName(name);
				p.setSalary(salary);
				p.setAge(age);
				
				MongoClient mongo = (MongoClient) request.getServletContext()
						.getAttribute("MONGO_CLIENT");
				
				EmployeeDao employeeDao = new EmployeeDao(mongo);
				
				employeeDao.createEmployee(p);
				
				System.out.println("Employee Added Successfully with id="+p.getId());
				request.setAttribute("success", "Employee Added Successfully");
				List<Employee> employees = employeeDao.readAllEmployee();
				request.setAttribute("employees", employees);

				RequestDispatcher rd = getServletContext().getRequestDispatcher(
						"/persons.jsp");
				rd.forward(request, response);
			}
		}

	}
}	
