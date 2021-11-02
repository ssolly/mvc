<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mvc/member/logout.jsp</title>
</head>
<body>
	<h2> logout.jsp 페이지 입니다</h2>
	<b>request</b> : <%= request.getAttribute("key") %> <br>
	<b>requestScope</b> : ${requestScope.key } <br>
	<b>request(el)</b> : ${key }
</body>
</html>