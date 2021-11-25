<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.AllFunction1" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Week 4 Servlet</title>
</head>
<body>
<h1>Welcome Eclipse World</h1><hr>
	<form action="Save" method="post">
		Student ID: <input type="text" name="id"><br>
		Name: <input type="text" name="name"><br>
		Course: <select name="listCourse">
		<option value="Java">Java</option>
		<option value="Servlet">Servlet</option>
		<option value="JSP">JSP</option>
		</select>
		Score: <input type="text" name="score"><br>
		<button>Submit</button><br>
		Payment :<br>
		<input type="radio" name="payment" value="Cash">Cash<br>
		<input type="radio" name="payment" value="Credit">Credit<br>
		Student Method :<br>
		<input type="checkbox" name="method" value="Onsite">On-site<br>
		<input type="checkbox" name="method" value="Online">On-line<br>
		<input type="checkbox" name="method" value="Ondemand">On-demand<br>
		
	</form>
</body>
</html>