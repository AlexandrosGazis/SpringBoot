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
    <title>View all Owner records</title>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<h2>Users:</h2>
<table>
    <tr>
        <th>User id</th>
        <th>ΑΦΜ</th>
        <th>Ονομα</th>
        <th>Eπιθετο</th>
        <th>Διευθυνση</th>
        <th>Email</th>
        <th>Μαρκα Οχηματος</th>
        <th>Πινακιδα Οχηματος</th>
        <th>Τυπος Χρηστη</th>
        <th></th>

    </tr>

    <c:forEach items="${owners}" var="owner">

      <tr>

        <td>${owner.id}</td>
        <td>${owner.afm}</td>
        <td>${owner.onoma}</td>
        <td>${owner.epitheto}</td>
        <td>${owner.dieuthinsi}</td>
        <td>${owner.email}</td>
        <td>${owner.markaOximatos}</td>
        <td>${owner.pinakidaOximatos}</td>
        <td>${owner.tipoXristi}</td>

          <td><a href="deleteOwner?id=${owner.id}">Delete</a></td>
          <td><a href="showUpdate?id=${owner.id}">Update</a></td>

      </tr>
    </c:forEach>






</table>
<br>
<a href="index.html"> Πισω στην αρχικη σελιδα</a> <br>
<a href="showCreateRepair"> Εισαγωγή Νέων Δεδομενων-Repair</a><br>
<a href="showCreate"> Εισαγωγή Νέων Δεδομενων-Owners</a><br>
<a href="displayOwners">View All Data!-Owners</a><br>
<a href="displayRepairs"> View All Data!-Owners-Repairs</a><br>



</body>
</html>