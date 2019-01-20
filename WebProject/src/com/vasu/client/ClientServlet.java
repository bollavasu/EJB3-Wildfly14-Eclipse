package com.vasu.client;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vasu.ejb.CustomerBean;

/**
 * Servlet implementation class ClientServlet
 */
@WebServlet("/ClientServlet")
public class ClientServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	CustomerBean customerBean;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("FROM ClientServlet doGet()");
		PrintWriter out = response.getWriter();
		out.println(customerBean.sayHello("VASU"));
	}

}
