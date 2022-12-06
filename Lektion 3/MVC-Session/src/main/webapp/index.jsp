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
	// check if there is a session 
	if (session.getAttribute("isLoggedIn") != null) {
		response.sendRedirect("Profile.jsp");
	}
	%>
	<!-- A normal login: GOTO SessionServlet POST -->
	<form action="<%=request.getContextPath()%>/SessionServlet"
		method="POST">
		<input type="submit" value="Create a session" />
	</form>

</body>
</html>