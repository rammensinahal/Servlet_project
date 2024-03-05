<%@page import="Employ_details.dto.Employ"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>edit</title>
</head>
<body>
	<%
	Employ e = (Employ)request.getAttribute("emp");
	%>

	<form action="edit" method="post">
		<table>
			<tr>
				<td><label> Id: </label></td>
				<td><input type="number" name="id" value="<%=e.getEid()%>"
					readonly="true"></td>
			</tr>
			<tr>
				<td><label> Name : </label></td>
				<td><input type="text" name="ename" value="<%=e.getEname()%>">
				</td>
			</tr>
			<tr>
				<td><label> Email : </label></td>
				<td><input type="email" name="email" value="<%=e.getEmail()%>"></td>
			</tr>
			<tr>
				<td><label> Password : </label></td>
				<td><input type="password" name="password"
					value="<%=e.getPassword()%>"></td>
			</tr>
			<tr>
				<td><label> E_age : </label></td>
				<td><input type="text" name="eage" value="<%=e.getEage()%>">
				</td>
			</tr>
			<tr>
				<td><label> Phone_no : </label></td>
				<td><input type="text" name="phoneno"
					value="<%=e.getPhoneno()%>"></td>
			</tr>
			<tr>
				<td>
					<button value="edit">Update</button>
				</td>
			</tr>
		</table>
	</form>

</body>
</html>