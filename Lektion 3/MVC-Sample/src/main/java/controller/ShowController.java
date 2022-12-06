package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ImageHandler;

@WebServlet("/showController")
public class ShowController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String whatToShow = request.getParameter("show");
		//ImageHandler is out model that takes care of the data
		String imageFileName = ImageHandler.getFileName(whatToShow);
		
		String redirectUrl = "views/showImage.jsp?img=" + imageFileName;
		response.sendRedirect(redirectUrl);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
