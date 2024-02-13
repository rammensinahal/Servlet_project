<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>


</head>
<body>
	<%
	String message = (String) request.getAttribute("message");
	%>
	<%
	if (message != null) {
	%>
	<h1><%=message%></h1>
	<%
	}
	%>
<fieldset style="width:280px; heigt:200px; border:2px solid red; margin: 0 40%"><h2 style="margin:2% 40%">Login</h2>
		<form action="login" method="post">
	<table>
	<tr >
	<td>
	<label style="padding:5px">Email :</label>
	</td>
		<td>
		<input style="padding:5px" type="email" name="email"  height="5px" placeholder="enter email">
		</td>
		</tr>
		<tr>
		<td><label style="padding:5px" > Password :</label></td>
		<td>
		<input style="padding:5px" type="password" name="password"
			placeholder="enter password"><br>
			</td>
			</tr>
		<tr>
		<td >
		<button style="background-color:skyblue;border:2px solid skyblue; border-radius: 5px; margin: 2% 100%;width: 100px;height: 30px" >log in</button>
		</td>
		<tr>
</table>
	</form>
	</fieldset>
</body>
</html>