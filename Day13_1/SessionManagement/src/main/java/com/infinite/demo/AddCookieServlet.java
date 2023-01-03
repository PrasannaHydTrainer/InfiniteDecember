package com.infinite.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCookieServlet
 */
public class AddCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// import javax.servlet.http.Cookie;
		Cookie ck1 = new Cookie("Mitesh","84");
		ck1.setMaxAge(1000*60*60*24);
		response.addCookie(ck1);
		
		Cookie ck2 = new Cookie("Deepak","87");
		ck2.setMaxAge(1000*60*60*24);
		response.addCookie(ck2);
		
		Cookie ck3 = new Cookie("Rajan","90");
		ck3.setMaxAge(1000*60*60*24);
		response.addCookie(ck3);
		
		PrintWriter out = response.getWriter();
		out.println("Cookies Created Successfully...");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
