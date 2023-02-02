package com.java.infinite;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.ejb.CalculationBeanRemote;

/**
 * Servlet implementation class CalculationServlet
 */
public class CalculationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CalculationServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Properties p = new Properties();
		p.put("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
		p.put("java.naming.factory.url.pkgs", "org.jboss.naming:org.jnp.interfaces");
		p.put("java.naming.provider.url", "localhost:1099");
		try {
			CalculationBeanRemote service = 
					(CalculationBeanRemote) new InitialContext(p).lookup("CalculationBean/remote");
			PrintWriter out = response.getWriter();
			out.println(service.sum(12, 5));
	//		System.out.println(service.sayHello());
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
