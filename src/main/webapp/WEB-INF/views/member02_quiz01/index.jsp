<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mvc/member02_quiz01/index.jsp</title>
</head>
<body>

<h3>기본 페이지 : index.jsp</h3>
<h4>request : <%= request.getAttribute("basic") %> </h4>

<a href="login">로그인페이지</a> &ensp;
<a href="logout">로그아웃페이지</a>

</body>
</html>