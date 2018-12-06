<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html >


<html>
<head>
    <style>
        table, th, td {
            border: 3px solid black;
        }


    </style>
    <meta http-equiv="Content-Type" content="text/html" ; charset=UTF-8">
    <title>View all records</title>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<h2>Users:</h2>
<table>
    <tr>
        <th>id</th>
        <th>ΑΦΜ</th>
        <th>Ονομα</th>
        <th>Eπιθετο</th>
        <th>Διευθυνση</th>
        <th>Email</th>
        <th>Μαρκα Οχηματος</th>
        <th>Πινακιδα Οχηματος</th>
        <th>Τυπος Χρηστη</th>
        <th>aaa</th>
    </tr>


    <c:forEach items="${owners}" var="owner">
      <td>
        <td>${owner.id}</td>
        <td>${owner.afm}</td>
        <td>${owner.onoma}</td>
        <td>${owner.epitheto}</td>
        <td>${owner.dieuthinsi}</td>
        <td>${owner.email}</td>
        <td>${owner.markaOximatos}</td>
        <td>${owner.pinakidaOximatos}</td>
        <td>${owner.tipoXristi}</td>
        <td><a href="deleteOwner?id=${owner.id}">delete</a></td>
      </tr>
    </c:forEach>




</table>
<br>
<a href="showCreate"> Εισαγωγή Νέων Δεδομενων</a>


</body>
</html>