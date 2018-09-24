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


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
	}

	
	public void destroy() {
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	User user = new User();
	user.name = request.getParameter("txtName");
	user.email = request.getParameter("txtEmail");
	user.password = request.getParameter("txtPassword");
	
	JDBCHelper helper = new JDBCHelper();
	helper.createConnection();
	int i = helper.registerUser(user);
	helper.closeConnection();
	
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	
	out.print("<html><body>");
	if(i>0){
		String dateTime = new Date().toString();
		out.print("<h3>"+user.name+" Registered successfully</h3></br>Registered on " +dateTime);
		
	}else{
		out.print("<h3>"+user.name+" Not Registered Successfully</h3>");
	}
	out.print("</center></body></html>");
	}

}
