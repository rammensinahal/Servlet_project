<%@page import="student_management_system.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Student s=(Student)request.getAttribute("student");%>
<form action="edit" method="post" >
Id: <input type="number" name="id" value="<%=s.getId() %>"  readonly="true"><br>
Name : <input type="text" name="name" value="<%=s.getName() %>"><br>
Email : <input type="email" name="email" value="<%=s.getEmail() %>"><br>
Address : <input type="text" name="address" value="<%=s.getAddress() %>"><br>
Password : <input type="password" name="password" value="<%=s.getPassword() %>"><br>
<button value="edit">Update</button>
<button>cancel</button>

</form>
</body>
</html>