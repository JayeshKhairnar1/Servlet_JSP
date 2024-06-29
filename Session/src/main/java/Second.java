

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Second
 */
public class Second extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		PrintWriter pw=res.getWriter();
		pw.println("i am second");
				
		HttpSession session=req.getSession(false);
		if(session!=null)
		{
			pw.println(session.getAttribute("gender"));
		}
		else
		{
			pw.println("session does not exists");
		}
}

}
