
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Records</title>
</head>
<body>
<h2>Lead</h2>
<form  action ="saveLead" method="post">
<table>
<tr>
<td>FirstName</td>
<td><input type="text" name="firstName"></td>
</tr>
<tr>
<td>LastName</td>
<td><input type="text" name="lastName"></td>
</tr>
<tr>
<td>Email</td>
<td><input type="text" name="email"></td>
</tr>
<tr>
<td>Mobile</td>
<td><input type="text" name="mobile"></td>
</tr>
<tr>
<th><input type="Submit" name ="save">
</tr>
</table>
  </form>   
${msg}                                                                                                                           
</body>
</html>