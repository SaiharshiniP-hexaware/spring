<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<head>

<title>Student details</title>
</head>
<body>
	<h1 align="center">View Student by Dept</h1>
	<hr />
	<div style="width:200px;margin: 0 auto"> 
	<form action="students">
		Choose Department 
		<select name="cbodept">
			<option value="ece">ece </option>
			<option value="eee">eee </option>
		</select> <input type="submit" value="search" />
	</form>
</div>
</body>
</html>