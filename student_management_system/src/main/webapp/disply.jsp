<%@page import="java.util.List"%>
<%@page import="student_management_system.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Disply result</title>
</head>
<body>
<%String s=(String)request.getAttribute("message"); %>
<%if(s!=null){ %>
<h1><%= s %></h1>
<%}%>


<table border="6px" style="padding: 10px">
<%List<Student> list=(List)request.getAttribute("list"); %>

<tr style="width:280px; heigt:200px;  margin: 0 40%;background-color: gray ;color: white;padding: 10px">
<th style="padding: 10px" >Id</td>
<th style="padding: 10px">Name</td>
<th style="padding: 10px">Email</td>
<th style="padding: 10px">Password</td>
<th style="padding: 10px" >Address</td>
<th style="padding: 10px">Delete</td>
<th style="padding: 10px">Update</td>
</tr>
<%for(Student student : list){%>
<tr style="padding: 10px">
<td style="padding: 10px"><%=student.getId() %></td>
<td style="padding: 10px"><%=student.getName() %></td>
<td style="padding: 10px"><%=student.getEmail() %></td>
<td style="padding: 10px"><%=student.getPassword() %></td>
<td style="padding: 10px"><%=student.getAddress()%></td>
<td style="background-color: skyblue;padding: 10px; "><a href="delete?id=<%=student.getId()%>" style="color: black">Delete</a></td>
<td style="background-color: skyblue;padding: 10px"><a href="update?id=<%=student.getId()%>" style="color: black">Update</a></td>


</tr>
<%} %>


</table>

</body>
</html>