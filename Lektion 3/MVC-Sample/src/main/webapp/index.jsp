<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/showController" method="get">
		<select name="show">
			<option disabled selected> -- Select an option --</option>
			<option value="dog">Dog</option>
			<option value="cat">Cat</option>
		</select>
		<input type="submit" value="Submit" />
	</form>
</body>
</html>