<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="https://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>search results</title>
</head>
<body>
	<p><a href="leads">New Lead</a>
	<h2>All Leads</h2>
	<table>
	<tr>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Company</th>
	<th>email</th>
	<th>mobile</th>
	<th>Leads Source</th>
	</tr>
	
	<c:forEach  items="${leads}" var="lead">
	
	<tr>
	<td><a href="getLeadInfo?id=${lead.id}">${lead.firstName}</a></td>
	<td>${lead.lastName}</td>
	<td>${lead.company}</td>
	<td>${lead.email}</td>
	<td>${lead.mobile}</td>
	<td>${lead.leadSource}</td>
	</tr>
	  </c:forEach>
	</table>

</body>
</html>