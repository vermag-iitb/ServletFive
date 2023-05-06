package table;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebServlet;


//@WebServlet("/demo")
public class TableDisplay extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    public TableDisplay() 
    {
        super();
    }

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		try
        {
            PrintWriter pw = response.getWriter();
            
            pw.println("<html><body bgcolor=green text=yellow>");
            pw.println("<h3>Table of FIVE</h3>");
            pw.println("<table border = 20>");
            
            for(int i=1; i<=20; i++)
            {
            	pw.println("<tr><td>5</td>");
            	pw.println("<td>X</td>");
            	pw.println("<td>"+i+"</td>");
            	pw.println("<td>=</td>");
            	pw.println("<td>"+ 5*i +"</td></tr>");
            }
            pw.println("</h1></body></html>");
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
	}
}
