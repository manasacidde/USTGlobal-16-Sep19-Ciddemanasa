<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>
<body>
<a href="./home">Home</a>
	<a style="float: right" href="./logout">Logout</a>
	<h4><%=msg %></h4>
	<fieldset>
		<legend>Change Password</legend>
		<form action="./changepassword" method="post">
			<table>
				<tr>
					<td>NewPassword:</td>
					<td><input type="password" name="newpassword"></td>
				</tr>
				<tr>
					<td>ConfirmPassword:
					<td>
					<td><input type="password" name="confirmpassword"></td>
				</tr>
				<tr>
					
					<td><input type="submit" value="change password"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>