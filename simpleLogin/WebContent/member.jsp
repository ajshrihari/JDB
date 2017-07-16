<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="content">
			<h2>Home</h2>
			<p>
				Welcome to Book My Show!
			</p>
			<p> 
				Movies:
				1.Batman
				2. Iron Man
				3.Spider man
				 
			</p>
		</div>
	<form method="post" action="DisplayMovie">
		<table>
			<tr>
				<td>Movie Number</td>
				<td><input type="text" name="num"></td>
			</tr>
			
			<tr>
				<td></td>
				<td><input type="submit" value="login"></td>
			</tr>
		</table>
	</form>
</body>
</html>