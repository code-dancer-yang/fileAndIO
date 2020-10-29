<%@page import="logindemo.ismart.domain.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"  isELIgnored="false" import="java.util.*"
	pageEncoding="UTF-8"%>
	<%@ include file="el2.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el1.jsp</title>
<%

   User user=new User();
   user.setAge(27);
   user.setName("杨增辉");
   user.setBirthday(new Date());
   request.setAttribute("u", user);

%>
</head>
<body>
<h1>${u.name}</h1><br>
<h1>${u.age}</h1><br>
<h1>${u.birthday}</h1><br>
<h1>${u.birthdayStr}</h1><br>
</body>
</html>