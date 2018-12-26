package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.Form;
import com.service.FormService;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    FormService service = new FormService();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String OrderId = service.GenerateId();
		request.setAttribute("OrderID", OrderId);
		
		String Fname = request.getParameter("FirstName");
		request.setAttribute("FirstName", Fname);
	
		String Lname = request.getParameter("LastName");
	    request.setAttribute("LastName", Lname);
		
		String Email = request.getParameter("Email");
		String Type = request.getParameter("Type");
		request.setAttribute("Type", Type);
		
		
		String Size = request.getParameter("Size");
		request.setAttribute("Size", Size);
		
		String Quantity = request.getParameter("Quantity");
		request.setAttribute("Quantity", Quantity);
		
		//LocalDate date = (LocalDate)request.getParameter("date");
		
		String Address1 = request.getParameter("Address1");
		request.setAttribute("Address1", Address1);
		
		String Address2 = request.getParameter("Address2");
        request.setAttribute("Address2", Address2);
		
		String City = request.getParameter("City");
		String State = request.getParameter("State");
		String Zipcode = request.getParameter("Zipcode");
		String Country = request.getParameter("Country");
		
		 int total = (Integer.parseInt(Quantity) * 1000);
		 
		 request.setAttribute("Total", total);
		
		 
		//Date dob = new Date(date);
		service.Pushdata(new Form(OrderId,Fname,Lname,Email,Type,Size,Quantity,LocalDate.parse("2018-10-21"),Address1,Address2,City,State,Zipcode,Country));
		//service.javaObjectToXML(new Form(OrderId,Fname,Lname,Email,Type,Size,Quantity,LocalDate.parse("2018-10-21"),Address1,Address2,City,State,Zipcode,Country));
		/* response.setContentType("text/html");
		 PrintWriter out=     response.getWriter();
		 
		 out.write("<html> <body> <h1>This is NRJ's Server</h1>");
		 out.write("Order name :"+OrderId+ "<br>");
		 out.write("Employee name :"+Fname+ "<br>");
		 out.write("Employee ID :"+ Lname+"<br>");
		 out.write("Employee Age :"+Email+ "<br>");
		 out.write("Employee Salary :"+Type+ "<br>");
		 out.write("Employee Email :"+Size+ "<br>");
		 out.write("</body></html>");
		 
		 */
		//response.sendRedirect("Success.html");
	     request.getRequestDispatcher("Success.jsp").forward(request, response);
	}

}
