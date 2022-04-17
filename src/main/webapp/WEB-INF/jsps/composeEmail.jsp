<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Send" method="post">
<pre>
to<input type="text" name="toEmail" value="${email}"/>
subject<input type="text" name="subject"/>
<textarea name="emailBody" rows="10" cols="40">
</textarea>
<input type="submit" value="Send"/>
</pre>
</form>
</body>
</html>