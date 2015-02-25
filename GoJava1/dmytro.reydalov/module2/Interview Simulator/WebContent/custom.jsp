<%@page import="ua.com.goit.gojava2.solo307.interview.*"%>
<%@page import="java.io.File"%>
<%@page import="java.util.List"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>custom</title>
	</head>
	<body>
	<%	Interview interview = new Interview();
		String [] categories = (String[])request.getAttribute("category");
		for(String category: categories){
			File file = new File(category);
			interview.createCategory(file);	
		}
		Category composed = interview.getComposedCategory();
		List<Question> questions = composed.getQuestions();
		for(Question question: questions){ %>
			<p><%= question.getText() %></p>
			<%for(Answer answer: question.getAnswers()){
				String text = answer.getText();
				int qId = answer.getId();%>
				<form action="Controller" method="Post">	
				<p><input type="checkbox" name="answer" value="<%= qId%>"> <%= " " + text%></p>
			<% } %>
		<% } %>
		<p><input type="submit" value="Submit"></p>
		</form>
		<a href="index.jsp">Вернуться на главную</a> <br>		
	</body>
</html>