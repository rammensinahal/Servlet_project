<%@page import="Employ_details.dto.Employ"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
<%String e=(String)request.getAttribute("emp");%>
<%if(e!=null){ %>
<h1><%=e %></h1>
<%} %>
<form action="login" method="post">
<table border="2px">
<tr>
<td>
<label>
Email :
</label>
</td>
<td>
<input type="email" name="email" placeholder="enter your email">
</td>
</tr>
<tr>
<td>
<label>
Password :
</label>
</td>
<td>
<input type="password" name="password" placeholder="enter your password">
</td>
</tr>
<tr>
<td>
<button>login</button>
</td>
</tr>
</table>
</form>

</body>
</html>