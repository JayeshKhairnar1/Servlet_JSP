

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pw=response.getWriter();
		pw.println("Without overriding init");
		pw.println("Config parameter value  "+getServletConfig().getInitParameter("user"));
		pw.println("<br>");
		pw.println("Context parameter value   "+getServletContext().getInitParameter("database"));
	
	}

}
