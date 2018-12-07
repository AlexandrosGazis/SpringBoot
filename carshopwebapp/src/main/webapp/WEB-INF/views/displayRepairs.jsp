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
    <title>View all Repair records</title>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<h2>Repairs:</h2>
<table>
    <tr>
        <th>Repair id</th>
        <th>Ημερομηνία</th>
        <th>Κατάσταση</th>
        <th>Είδος επισκευής</th>
        <th>Κόστος</th>
        <th>Owner(service)</th>
        <th>Περιγραφή</th>
        <th></th>

    </tr>

    <c:forEach items="${repairs}" var="repair">

      <tr>

        <td>${repair.id}</td>
        <td>${repair.date}</td>
        <td>${repair.katastasi}</td>
        <td>${repair.eidosepiskeuis}</td>
        <td>${repair.kostos}</td>
        <td>${repair.owner}</td>
        <td>${repair.perigrafi}</td>

          
          <td><a href="deleteRepair?id=${repair.id}">Delete</a></td>
          <td><a href="showRepair?id=${repair.id}">Update</a></td>

      </tr>
    </c:forEach>






</table>
<br>
<a href="showCreateRepair"> Εισαγωγή Νέων Δεδομενων</a>


</body>
</html>