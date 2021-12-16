<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inlogg</title>
</head>
<body>

<% 


	out.print("<h1>välkommen</h1>");
	
	String contentSession = (String) session.getAttribute("username");
	out.print("du är inloggad" + " " + contentSession);
	session.setMaxInactiveInterval(30);
%>







</body>
</html>