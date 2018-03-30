<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here </title>
</head>
<body>
	<h1 align="center">TaxResult</h1>
	<hr />
	<form action="tax">
	<table cellpadding="10" bgcolor="#e3e3e3" style="margin: 0 auto">
		<tr>
			<td>Employee Name</td>
			<td>${param.txtname}</td>
		</tr>
		<tr>
			<td>Annual Income</td>
			<td>${param.txtincome}</td>
		</tr>
		<tr>
			<td>Tax to be paid</td>
			<td>${taxresult}</td>
	</table>
</form>
</body>
</html>