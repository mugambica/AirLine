package com.currency;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class CurrencyConverterServlet
 */
public class CurrencyConverterServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public CurrencyConverterServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("constructor...");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("started  ..init");//load the driver connection
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destorying servlet");
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service started the servlet...remote host:"+request.getRemoteHost());
		
		PrintWriter pw=response.getWriter();
		pw.println("<h3> welcome to dynamic Web page</h3>");
		
		pw.println("<a href='http://localhost:8080/CurrencyConversionProject/'>home</a>");
	}

}
