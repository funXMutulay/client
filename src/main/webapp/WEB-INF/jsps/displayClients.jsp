<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CLIENTS</title>
</head>
<body>

<h2>Clients:</h2>
<table>
<tr>
<th>Client Id</th>
<th>NOM</th>
<th>PRENOM</th>
<th>EMAIL</th>
<th>ADDRESSE</th>
<th>TELEPHONE</th>
</tr>

<c:forEach items="${clients}" var="client">
<tr>
<td>${client.clientId}</td>
<td>${client.nom}</td>
<td>${client.prenom}</td>
<td>${client.email}</td>
<td>${client.addresse}</td>
<td>${client.phone}</td>
<td><a href="deleteClient?id=${client.clientId}">SUPPRIMER</a></td>
<td><a href="showUpdate?id=${client.clientId}">EDITER</a></td>
</tr>
</c:forEach>
</table>
<a href="creerClient">AJOUTER CLIENT</a>
</body>
</html>