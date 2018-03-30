<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC >
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Calculate Interest Result</h1>
	</hr>
	<table cellpadding="10" bgcolor="#e3e3e3" style="margin: 0 auto">
		<tr>
			<td>Principle Amount</td>
			<td>${ibean.amt}</td>
		</tr>
		<tr>
			<td>Years</td>
			<td>${ibean.years}</td>
		</tr>
		<tr>
			<td>Rate</td>
			<td>${ibean.rate}</td>
		</tr>
		<td>Compound Interest</td>
		<td><fmt:formatNumber value="${ci}" minFractionDigits="2" maxFractionDigits="2"/></td>
		</tr>
	</table>
</body>
</html>