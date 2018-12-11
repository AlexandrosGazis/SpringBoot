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
    <title>Update a record(Repairs)</title>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<form action="updateRepair" method="post">
      <pre>
     Id:   <input type="text" name="id" value="${repair.id}" readonly="true"/>
    Ημερομηνία(YYYY-MM-DD): <input type="text" name="date" value="${repair.date}"/>
    Κατάσταση: <input type="text" name="katastasi" value="${repair.katastasi}"/>
    Είδος επισκευής: Μικρή <input type="radio" name="eidosepiskeuis" value="Μικρη"${repair.perigrafi=='Μικρη'?'checked':'' }/>    Μεγάλη <input type="radio" name="eidosepiskeuis" value="Μεγάλη"${repair.perigrafi=='Μεγάλη'?'checked':'' }/>
    Κόστος(dot separated): <input type="text" name="kostos" value="${repair.kostos}"/>
    Χρηστης: <input type="text" name="owner" value="${repair.owner}"/>
    Περιγραφή: <input type="text" name="perigrafi" value="${repair.perigrafi}"/>

     <br>
    <input type="submit" value="Αποθηκευσε τα Δεδομενα"/>
    </pre>
</form>
<br>
<a href="index.html"> Πισω στην αρχικη σελιδα</a> <br>
<a href="showCreateRepair"> Εισαγωγή Νέων Δεδομενων-Repair</a><br>
<a href="showCreate"> Εισαγωγή Νέων Δεδομενων-Owners</a><br>
<a href="displayOwners">View All Data!-Owners</a><br>
<a href="displayRepairs"> View All Data!-Owners-Repairs</a><br>

</body>
</html>