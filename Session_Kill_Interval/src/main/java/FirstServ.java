
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class FirstServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int cnt = 0;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			cnt++;
			PrintWriter pw = response.getWriter();
			HttpSession session = request.getSession();
			if (session.isNew()) {
				pw.println("it is new");
			} else {
				pw.println("it is not new");
			}
			if (cnt > 4) {
				session.invalidate();
				cnt = 0;
			}
		} catch (Exception ee) {
			System.out.println(ee);
		}

	}
}
