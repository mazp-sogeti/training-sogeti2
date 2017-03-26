<%@ page language="java" contentType="text/html; charset=UTF-8" import="test.spring.sogeti.models.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% user u = new user(); 
		u = (user)request.getAttribute("dato");
	%>
	<%=u.getPassword()%>
</body>
</html> 