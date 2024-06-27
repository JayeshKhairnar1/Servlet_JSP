

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class TryHtml
 */
public class TryHtml extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TryHtml() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.println("<h1><em>Welcome<em></h1>");
		pw.println("<marquee>Jayesh Khairnar</marquee>");
		pw.println("<marquee>Jayesh Khairnar</marquee>");
		pw.println("<marquee>Jayesh Khairnar</marquee>");
		pw.println("<marquee>Jayesh Khairnar</marquee>");
		pw.println("<img src='https://picsum.photos/200/300'>");
		pw.println("<marquee>Jayesh Khairnar</marquee>");
		pw.println("<h1><em>Bye!!<em></h1>");
	}

}
