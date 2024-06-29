
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		try {
			String name = req.getParameter("nm");
			String age = req.getParameter("ag");
			res.setContentType("text/html");
			PrintWriter pw = res.getWriter();
			pw.println("<br>");
			pw.println("in side login servlet<br>");
			pw.println("<br>" + name + "    " + age);
		} catch (Exception ee) {
			System.out.println("in catch     " + ee);
		}

	}

}
