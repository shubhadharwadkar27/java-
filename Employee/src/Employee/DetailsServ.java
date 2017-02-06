package Employee;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DetailsServ")
public class DetailsServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			response.setContentType("NewFile/html");
			PrintWriter out=response.getWriter();
			PrintWriter pw = null;
			try
			{
				Class.forName("");
				Connection con=DriverManager.getConnection("");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("Select Employee_name,Employee_ID,Age,City,Salary,Department,Joining_Date,DOB,Marital_Status");
				String tr="";
				while(rs.next()){
					tr=tr+"<tr>";
					tr=tr+"<td>"+rs.getString(1)+"</td>";
					  tr=tr+"<td>"+rs.getString(2)+"</td>";
					  tr=tr+"<td>"+rs.getString(3)+"</td>";
					  tr=tr+"<td>"+rs.getString(4)+"</td>";
					  tr=tr+"<td>"+rs.getString(5)+"</td>";
					  tr=tr+"<td>"+rs.getString(6)+"</td>";
					  tr=tr+"<td>"+rs.getString(7)+"</td>";
					  tr=tr+"<td>"+rs.getString(8)+"</td>";
					  tr=tr+"<td>"+rs.getString(9)+"</td>";
					  tr=tr+"<td>"+rs.getString(10)+"</td>";
					  tr=tr+"</tr>";
				  }
				  String table="<table border='1'>"+tr+"</table>";
				  pw.write(table);
				  pw.close();
				  con.close();
				  }catch(Exception e)
				  {
				  pw.write(""+e); 
				  }
				  }
				  
				

					
				
			
	}


