<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<head>
<title>Sign up</title>
</head>
<body>
	<fieldset style="width:300px; border:2px solid red; margin: 0 40%"><h2 style="margin: 2% 40%;">Signup</h2>
		<form action="signup" method="post">
		<table  style="padding:5px">

			<tr>
				<td>
				<label style="padding:5px">Name :</label>
				</td>
				<td><input style="padding:5px" type="text" name="name" placeholder="Enter name">
				</td>
			</tr>
			<tr>
				<td><label style="padding:5px">Email : </label></td>
				<td><input style="padding:5px" type="email" name="email" placeholder="Enter email">
				</td>
			</tr>
			<tr>
				<td><label style="padding:5px"> Address :</label> </td>
				<td><input style="padding:5px" type="text" name="address" placeholder="Enter address" style=""></td>
			</tr>
			<tr>
				<td><label style="padding:5px"> Password :</label></td> 
				<td><input style="padding:5px" type="password" name="password" placeholder="Enter password"></td>
			</tr>
			<tr >
				<td style="">
					<button style="background-color:skyblue;margin-top:10px; margin-left:30px; width: 100px;height: 30px; border-radius:5px; border: skyblue">submit</button>
				</td>
				<td>	
				<button style=" background-color:skyblue;margin-top:10px; margin-left:30px; width: 100px; height: 30px; border-radius: 5px ;border: skyblue";>cancel</button>
				</td>
			</tr>

		</table>
	</form>
		</fieldset>

</body>
</html>