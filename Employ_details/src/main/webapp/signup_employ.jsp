<%@page import="Employ_details.dto.Employ"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign up</title>
</head>
<body>

<form action="signup" method="post">
<table>
<tr>
<td>
<label>
Name :
</label>
</td>
<td>
<input type="text" name="ename" placeholder="enter ename">
</td>
</tr>
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
<label>
E_age :
</label>
</td>
<td>
<input type="text" name="eage" placeholder="enter your eage">
</td>
</tr>
<tr>
<td>
<label>
Phone_no :
</label>
</td>
<td>
<input type="text" name="phoneno" placeholder="enter your Phoneno">
</td>
</tr>
<tr>
<td>
<button>submit</button>
</td>
</tr>
</table>
</form>

</body>
</html>