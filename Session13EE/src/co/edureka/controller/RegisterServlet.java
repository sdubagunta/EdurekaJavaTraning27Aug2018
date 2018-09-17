package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.db.JDBCHelper;
import co.edureka.model.User;

@WebServlet({ "/RegisterServlet", "/Register", "/Awesome" })
public class RegisterServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;

	// init is executed when object of RegisterServlet will be created by Server (Apache Tomcat)
	// executed only once
	public void init(ServletConfig config) throws ServletException {
		System.out.println("==init Executed==");
	}

	// destroy is executed when object of RegisterServlet is no longer required
	// executed only once
	public void destroy() {
		System.out.println("==destroy Executed==");
	}

	// service is executed when client sends a request
	// executed for n number of requests by n number of clients
	// takes care of get as well as post request
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("==service Executed==");
		
		User user = new User();
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		System.out.println("User Details: "+user);
		
		// Saving the Object into Table
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		int i = helper.registerUser(user);
		helper.closeConnection();
		
		// Writing the Response back to the client
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); // PrintWriter API is used to write back the response !!
		
		out.print("<html><body><center>");
		if(i>0){
			String dateTime = new Date().toString();
			out.print("<h3>"+user.name+" Registered Succesfully</h3><br/>Registered on: "+dateTime);
			
		}else{
			out.print("<h3>"+user.name+" Not Registered Succesfully</h3>");
		}
		out.print("</center></body></html>");
		
	}

}