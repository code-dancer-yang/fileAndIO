<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录成功</title>
</head>
<body>
<h1>欢迎您:<%=request.getSession().getAttribute("username") %></h1>
</body>
</html>