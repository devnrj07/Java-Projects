package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MongoServlet
 */
@WebServlet("/MongoServlet")
public class MongoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MongoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		//String OrderId = service.GenerateId();
		//request.setAttribute("OrderID", OrderId);
		
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
		
		
	}

}
