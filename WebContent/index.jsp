<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body>
	<form action="process.do" method="post">
		<p>Question:
			${sessionScope.questions[sessionScope.startIndex].question}</p>
		<p>
			<input type="radio" value='a' name="answer">${sessionScope.questions[sessionScope.startIndex].optionA}</p>
		<p>
			<input type="radio" value='b' name="answer">${sessionScope.questions[sessionScope.startIndex].optionB}</p>
		<p>
			<input type="radio" value='c' name="answer">${sessionScope.questions[sessionScope.startIndex].optionC}</p>
		<p>
			<input type="radio" value='d' name="answer">${sessionScope.questions[sessionScope.startIndex].optionD}</p>
		<p>
			<input type="submit" value="Next" name="btn" />
		</p>
	</form>
</body>
</html>