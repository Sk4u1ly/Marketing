<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Data</title>
</head>
<body>
<h2>All Leads</h2>
<table border ='1'>
<tr>
<td>FristName</td>
<td>LastName</td>
<td>Email</td>
<td>Mobile</td>
<td>Update</td>
<td>Delete</td>
</tr>

<c:forEach var= "lead" items="${leads }">

<tr>
<td>${lead.firstName}</td>
<td>${lead.lastName}</td>
<td>${lead.email}</td>
<td>${lead.mobile}</td>
<td><a href="Delete?id=${lead.id }">Delete</a></td>
<td><a href="Update?id=${lead.id }">Update</a></td>
</c:forEach>


</table>
</body>
</html>


