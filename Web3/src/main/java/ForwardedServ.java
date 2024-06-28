

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForwardedServ
 */
public class ForwardedServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			

		try
		{
			
			PrintWriter pw=response.getWriter();
			pw.println("In ForwardedServlet");
		}
		catch(Exception ee)
		{
			System.out.println("in forwarding"+ee);
		}
}

}
