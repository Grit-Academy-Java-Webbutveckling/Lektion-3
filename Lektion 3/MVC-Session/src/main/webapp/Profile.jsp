<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	//check if there is a session 
	if (session.getAttribute("isLoggedIn") != null) {
		// if there is a session , then all is well
		out.print("<h1>Welcome to your profile!</h1>");
		//Goto the SessionRemoveServlet 
		out.print("<form action=\"" + request.getContextPath() + "/RemoveSessionServlet\" method=\"POST\">");
		out.print("<input type=\"submit\" value=\"Remove Session\" />");
		out.print("</form>");
	} else {
		out.print("<h1>Error</h1>");
		response.sendRedirect("index.jsp");
	}
	%>
</body>
</html>