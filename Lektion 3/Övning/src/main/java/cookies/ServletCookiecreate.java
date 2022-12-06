package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletCookiecreate")
public class ServletCookiecreate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String n = request.getParameter("cookieName");
			out.print("Your cookie via parameter is: " + n);

			Cookie ck = new Cookie("cname", n);// creating cookie object
			
			ck.setMaxAge(10); // set how long the cookie lasts
			response.addCookie(ck);// adding cookie in the response

			// creating submit button
			out.print("<form action='eatCookiewithJS.jsp'>");
			out.print("<input type='submit' value='go'>");
			out.print("</form>");
			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
