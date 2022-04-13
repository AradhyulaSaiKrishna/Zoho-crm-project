<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="https://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create</title>
</head>
<body>
<h2>Enter customer info</h2>

<form action="saveLead" method="post">
<pre>
		FirstName<input type="text" name="firstName"/>
		LastName<input type="text" name="lastName"/>
		company<input type="text" name="company"/>
		Email<input type="text" name="email"/>
		Mobile<input type ="text" name="mobile"/>
		
	<label for="leadSource">Choose Leads Source:</label>

<select name="leadSource" id="leads">
  <option value="paper Ads">paper Ads</option>
  <option value="TV ads">TV Ads</option>
  <option value="online">Online</option>
  <option value="radio">RAdio</option>
</select>

	<input type="submit" value="save lead"/>
</pre>	
</form>
${msg}
</body>
</html>