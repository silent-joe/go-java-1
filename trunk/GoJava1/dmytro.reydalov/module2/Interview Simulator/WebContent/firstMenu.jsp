<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Menu</title>
	</head>
	<body bgcolor="Azure">
		<% String [] name = (String[])request.getAttribute("name"); 
			for(String n: name){%>
			<p>hello <%= n %> </p>		
			<%}%>
 		<a href="questions and all Answers.jsp">Посмотреть список вопросов и всех ответов</a> <br>
 		<a href="questions and correct Answers.jsp">Посмотреть список вопросов и правильных ответов</a> <br>
 		<a href="compose.jsp">Выбрать темы для собеседования</a> <br>
	</body>
</html>