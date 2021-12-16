<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%


if (session.getAttribute("username") != null) {
	RequestDispatcher rd = request.getRequestDispatcher("second.jsp");
	rd.forward(request, response);
}

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>
<form action="Controller" method="get">
			Skriv användarnamn: <input name="username" type="text">
			Skriv lösenord: <input name="password" type="password">
			<input type="submit" value="Submit">
</form>
</body>
</html>