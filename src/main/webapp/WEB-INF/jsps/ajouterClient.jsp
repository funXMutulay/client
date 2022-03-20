<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>
    
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CREER CLIENT</title>
</head>
<body>

<form:form action="saveClient" method="post" modelAttribute="client">
<table>

<tr><td>Id client:</td> <td><form:input type="text" path="clientId"/></td></tr> 

<tr><td>NOM: </td> <td> <form:input type="text" path="firstName"/></td></tr>

<tr><td>PRENOM: </td> <td><form:input type="text" path="lastName"/></td></tr>

<tr><td>EMAIL: </td> <td><form:input type="number" path="email"/></td></tr>

<tr><td>ADDRESSE : </td> <td><form:input type="number" path="addresse"/></td></tr>

<tr><td>TELEPHONE: </td> <td><form:input type="number" path="phone"/></td></tr>

<tr><td></td> <td><input type="submit" value="save"/></td></tr>

</table>
</form:form>
${msg}

<a href="displayClients">AFFICHER LES CLIENTS</a>

</body>
</html>