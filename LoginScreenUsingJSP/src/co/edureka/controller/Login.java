package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.db.JDBCHelper;
import co.edureka.model.User;
@WebServlet({ "/Login" })
public class Login extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		User user = new User();
		
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		System.out.println("User Details: "+user);
		
		// Saving the Object into Table
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		boolean flag  = helper.loginUser(user);
		helper.closeConnection();
		
		// Writing the Response back to the client
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); // PrintWriter API is used to write back the response !!
		
		out.print("<html><body><center>");
		if(flag){
			String dateTime = new Date().toString();
			out.print("<h3>"+user.email+"  Logged In Succesfully</h3><br/>Logged on: "+dateTime);
			
			Cookie ck1 = new Cookie("keyEmail", user.email);
			Cookie ck2 = new Cookie("keyName", user.name);
			
			response.addCookie(ck1);
			response.addCookie(ck2);
			
		}else{
			out.print("<h3>"+user.email+" Incorrect Username or password</h3>");
		}
out.print("</center></body></html>");
	}
}
