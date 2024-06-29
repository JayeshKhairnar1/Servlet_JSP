

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HiddenServ1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pw=response.getWriter();
		String str1=request.getParameter("name");
		String str2=request.getParameter("age");
		pw.println("<html><body><form action=HiddenServ2 method=post>");
		pw.println("<input type=hidden name=a1 value="+str1+">");
pw.println("<input type=hidden name=a2 value="+str2+">");
		pw.println("<input type=submit value=done>");
		pw.println("</form></body></html>");
	}

}
