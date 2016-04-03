package controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ServletContext context = request.getServletContext();
		String user = request.getParameter("un");
		String password = request.getParameter("pw");		
        context.setAttribute("user",user); //attribute set for the whole context
        
        boolean isadmin = false;
        String message;
		
        isadmin = control(user, password);
        if (isadmin)
        		message = "Welcome, ";
        else	
        		message = "You do not have permission to enter, ";
    		response.getWriter().append(message + user);
		
		response.getWriter().append("/nControl executed by: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	boolean control(String a, String b)
	{	
		boolean c = false;
		if (a.equals("admin") && b.equals("1234"))
				c = true;		
		return c;
	}

}
