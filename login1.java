package loginpage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login1
 */
public class login1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
 
  
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		response.setContentType("login/html");
		PrintWriter out=response.getWriter();
		
		
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String YOP=request.getParameter("YOP");
		
		
		
		out.println("Name" +name);
		out.println("Age" +age);
		out.println("YOP" +YOP);
	}

}
