<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmts" %>
<!DOCTYPE html>
<html>
<head>

<title>Details!!</title>
</head>
<body>
	<h1 align="center">Student Details For The Dept ${param.cbodept}</h1>
	<hr />
	<table cellpadding="10" bgcolor="wheat" style="margin: 0 auto">
		<tr>
			<td><spring:message code="stuid" /></td>
			<td><spring:message code="stuname" /></td>
			<td><spring:message code="marks" /></td>
			<td><spring:message code="dept" /></td>
			<td><spring:message code="dob" /></td>

		</tr>
		<c:forEach items="${slist}" var="s">
			<!-- slist is internally requestScope.getAttribute("slist") -->
			<tr>
				<td>${s.stuId}</td>
				<!-- s.getSid() uses getters instead of the field sid at run time-->
				<td>${s.stuName}</td>
				<td>${s.marks}</td>
				<td>${s.dept}</td>
				<td><fmts:formatDate value="${s.dob}" pattern="dd/MM/yyyy"/></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>