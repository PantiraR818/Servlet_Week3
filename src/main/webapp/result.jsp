<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result_Week4</title>
</head>
<body>
<%
// 	String id = (String)request.getAttribute("o_id");
// 	String name = (String)request.getAttribute("o_name");
// 	int score = (int)request.getAttribute("o_score");
	String[] names = (String[])request.getAttribute("names");
	String[] methods = (String[])request.getAttribute("o_methods");
%>
	ID : ${o_id}<br>
	Name :${o_name} <br>
	Score :${o_score}<br>
	Payment :${o_payment}<hr>
	Names:
	<p>
	<%
	for(String m : methods){
		out.println(m + "<br>");
	}
	%>
	</p>
</body>
</html>