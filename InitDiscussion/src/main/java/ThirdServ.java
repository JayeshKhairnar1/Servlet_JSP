

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ThirdServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("inside child init(ServletConfig conf) method storing parameters");
			
		super.init(config);
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		try
		{
		PrintWriter pw=response.getWriter();
		//pw.println("Overriding init(ServletConfig conf)");
		/* NullPointerException for following 2 statements*/
		pw.println("Config parameter value  "+getServletConfig().getInitParameter("user"));
		pw.println("Context parameter value   "+getServletContext().getInitParameter("database"));
}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}

		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
