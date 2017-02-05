package View;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.League;

@WebServlet("/ListLeagueServlet")
public class ListLeagueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	List<League> league;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		league=new ArrayList<League>(); // collection
	
		
		league.add(new League("Summer","2016","Summer Soccer League"));
		league.add(new League("Winter","2017","Winter Soccer League"));
		league.add(new League("Rain Fall","2016","RainFall Soccer League"));
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Iterator i=league.iterator();
		out.println("<ul>");
		while(i.hasNext())
		{
			out.println("<li>");
			out.println(i.next());
			out.println("</li>");
		}
		out.println("</ul>");
		
		
		
		
	}


}

