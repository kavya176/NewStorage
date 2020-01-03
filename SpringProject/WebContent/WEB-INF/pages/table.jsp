

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="f"%><!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>welcome to view Page</h1>
	<TABLE>
		<tr>
			<th>sno</th>
			<th>name</th>
			<th>password</th>
			<th>mail</th>
			<th>mobile</th>
		</tr>
		<f:forEach var="data" items="${data}" varStatus="status">
			<tr>
				<td><f:out value="${data.id}"></f:out></td>
				<td><f:out value="${data.name}"></f:out></td>
				<td><f:out value="${data.pass}"></f:out></td>
				<td><f:out value="${data.mail}"></f:out></td>
				<td><f:out value="${data.mobile}"></f:out></td>
		</f:forEach>
		</tr>
	</table>
</body>
</html>