<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Lead Information</h2>
	First Name:${lead.firstName}<br/>
	Last Name:${lead.lastName }<br/>
	Company:${lead.company}<br/>
	email:${lead.email}<br/>
	mobile:${lead.mobile }<br/>
	lead source:${lead.leadsource}<br/>
	
	<form action="sendEmail" method="post">
		<input type="hidden" name="email" value="lead.email"/>
		<input type="Submit" value="send email">
	</form>
	
	
	<form action="Contacts" method="post">
	<input type="hidden" name="firstName" value="${lead.firstname}"/>
	<input type="hidden" name="lastName" value="${lead.lastname}"/>
	<input type="hidden" name="company" value="${lead.company}"/>
	<input type="hidden" name="email" value="${lead.email}"/>
	<input type="hidden" name="leadsource" value="${lead.leadsource}"/>
	<input type="submit" value="convert to sales"/>
	</form>

</body>
</html>