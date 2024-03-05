<%@page import="Employ_details.dto.Employ"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employ Disply</title>
</head>
<body>
<%String s=(String)request.getAttribute("message"); %>
<%if(s!=null){%>
<%= s %>
<%} %>
<h1 style="text-align: center; text-decoration: underline;">Result</h1>
<table border=" 4px solid red", style=" background-color:white; padding: 10px ;text-align: center;margin: 0 auto">
<%List<Employ> list=(List)request.getAttribute("list");%>
<tr style="background-color:gray ; color: white; width: 20px">
<th style="padding: 10px ; ">Id</th>
<th>E_name</th>
<th>Email</th>
<th>Password</th>
<th>E_age</th>
<th>Phone no</th>
<th>Delete</th>
<th>Update</th>
</tr>
<%for(Employ emp:list) {%>
<tr >
<td style="padding: 10px "><%=emp.getEid() %></td>
<td><%=emp.getEname() %></td>
<td><%=emp.getEmail()%></td>
<td><%=emp.getPassword()%></td>
<td><%=emp.getEage()%></td>
<td><%=emp.getPhoneno() %></td>
<td style="background-color:#ff7f7f ; border: none"><a href="delete?id=<%=emp.getEid()%>" style="color:black;padding: 10px;">Delete</a></td>
<td style="background-color: #5890ff ; border: none; "><a href="update?id=<%=emp.getEid()%>" style="color:black;padding: 10px;">update</a></td>
</tr>
<%} %>
</table>
</body>
</html>