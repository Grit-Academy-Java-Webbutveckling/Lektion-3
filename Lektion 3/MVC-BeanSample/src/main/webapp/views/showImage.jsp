<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="model.ImageBean"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	//We call the sent object with request.getAttribute method and then we have access to all the methods under that object
	ImageBean imageBean = (ImageBean) request.getAttribute("ImageBean");
	out.println("<h1>" + imageBean.getWhatToShow() + "</h1>");
	out.print("<img style=\"width:200px;\" src=\" " + imageBean.getFileName() + "\"/>");
	%>
	<!-- The below syntax is to read the cookie -->
	<h1>${cookie["schoolName"].getValue()}</h1>

</body>
</html>