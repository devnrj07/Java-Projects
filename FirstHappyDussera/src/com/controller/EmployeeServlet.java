package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.Employee;
import com.service.EmployeeService;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	
	EmployeeService service= new EmployeeService();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" In side server ");
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
          String EName=request.getParameter("empName");
          int ID =Integer.parseInt( request.getParameter("empID"));
          int age =Integer.parseInt( request.getParameter("empAge"));
	      int salary=Integer.parseInt( request.getParameter("empSalary"));
	      String email = request.getParameter("empEmail");
	      Employee emp = new Employee(EName,ID,age,salary,email);
	      service.Register(emp); 
	      //response.sendRedirect(location);
	      response.setContentType("text/html");
	 PrintWriter out=     response.getWriter();
	 
	 out.write("<html> <body> <h1>This is NRJ's Server</h1>");
	 out.write("Employee name :"+EName+ "<br>");
	 out.write("Employee ID :"+ ID+"<br>");
	 out.write("Employee Age :"+age+ "<br>");
	 out.write("Employee Salary :"+salary+ "<br>");
	 out.write("Employee Email :"+email+ "<br>");
	 out.write("</body></html>");
	      
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
