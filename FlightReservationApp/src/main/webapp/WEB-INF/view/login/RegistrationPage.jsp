<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
  <h2> New Registration</h2>
    <form action="saveReg" method="post">
	    <pre>
	         First Name : <input type="text" name="firstName"/><br>
		     Last Name : <input type="text"  name="lastName"/><br>
		     email : <input type="text" name="email"/><br>
		     password :<input type="text" name="password"/><br>
		     <input type="submit" value="save"/>
	    </pre>
    </form>
</body>
</html>