<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<html>
<style>
    table, th, td {
        border: 3px solid black;
    }


</style>
<body>
<h3> User Input Στοιχεια επιτυχης :) </h3>

<table>
    <tr>

        <th>ΑΦΜ</th>
        <th>Ονομα</th>
        <th>Επιθετο</th>
        <th>Διευθυνση</th>
        <th>Email</th>
        <th>Μαρκα Οχηματος</th>
        <th>pinakidaOximatos</th>
        <th>Τυπος Οχηματος</th>

    </tr>

    <c:forEach items="${owners}" var="owners">


        <td>${owners.afm}</td>
        <td>${owners.onoma}</td>
        <td>${owners.epitheto}</td>
        <td>${owners.dieuthinsi}</td>
        <td>${owners.email}</td>
        <td>${owners.markaOximatos}</td>
        <td>${owners.pinakidaOximatos}</td>
        <td>${owners.tipoXristi}</td>


    </c:forEach>

</table>


</body>

</html>