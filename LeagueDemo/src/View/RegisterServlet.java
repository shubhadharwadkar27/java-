package View;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.pept.transport.Connection;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
			response.setContentType("Register/html");
			PrintWriter out= response.getWriter();
		    String name=request.getParameter("Name");
		    String age=request.getParameter("Age");
		    String League=request.getParameter("League");
		    try
		    {
		    	Class.forName("org.h2.Driver");
		    	Connection con=(Connection) DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		    	PreparedStatement ps=((java.sql.Connection) con).prepareStatement("Register");
		    	ps.setString(1, name);
		    	ps.setString(2, age);
		    	ps.setString(3, League);
		    	int i=ps.executeUpdate();
		    	if(i>0)
		    		out.println("Succesfully Registered");
		    	
		    } catch(Exception e)
		    {
		    	System.out.println(e);
		    }
		    out.close();
		    	
		    	
		    	
		    	
		    }
		}
}


	
	
