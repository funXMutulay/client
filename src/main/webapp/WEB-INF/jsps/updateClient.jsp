<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MISE A JOUR CLIENT </title>
</head>
<body>

<form action="updateClient" method="post" >
<table>

<tr> <td> CLIENT ID: </td> <td><input type="text" name="id" value="${client.clientId}" readonly/> </td>    </tr>

<tr> <td> NOM: </td> <td> <input type="text" name="name" value="${client.nom}"/></td>   </tr>

<tr> <td> PRENOM: </td> <td> <input type="text" name="description" value="${client.prenom}"/></td>    </tr>

<tr> <td> EMAIL: </td> <td><input type="text" name="quantit" value="${client.email}"/> </td>    </tr>

<tr> <td> ADDRESSE:  </td> <td><input type="text" name="price" value="${client.addresse}"/> </td>    </tr>

<tr> <td> TELEPHONE: </td> <td><input type="text" name="prixTotal" value="${cmmande.phone}"/> </td> </tr> 

<input type="submit" value="save"/>
</table>
</form>

</body>
</html>