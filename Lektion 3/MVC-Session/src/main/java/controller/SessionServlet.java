package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Session is a part of the request
		// Session is created when the user visits the website
		HttpSession httpSession = request.getSession();
		// session.setMaxInactiveInterval(600); // session timeout in sec
		// name add data into the session
		httpSession.setAttribute("isLoggedIn", "Here is my session");
		RequestDispatcher rd = request.getRequestDispatcher("Profile.jsp");
		rd.forward(request, response);
	}
}