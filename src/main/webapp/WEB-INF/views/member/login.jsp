<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mvc/member/login.jsp</title>
</head>
<body>
	<h2> login.jsp 페이지 입니다 </h2>
	<b>request_Attribute</b> : <%= request.getAttribute("login") %> <br>
	<b>request_Parameter</b> : <%= request.getParameter("login") %> <br>
	<b>requestScope</b> : ${requestScope.login } <br>
	<b>request(el)</b> : ${login }
</body>
</html>