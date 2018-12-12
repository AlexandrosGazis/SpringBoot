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
        .styled {
            border: 0;
            line-height: 2.5;
            padding: 0 20px;
            font-size: 1rem;
            text-align: center;
            color: #fff;
            text-shadow: 1px 1px 1px #000;
            border-radius: 10px;
            background-color: rgb(126, 220, 102);
            background-image: linear-gradient(to top left,
            rgba(0, 0, 0, .2),
            rgba(0, 0, 0, .2) 30%,
            rgba(0, 0, 0, 0));
            box-shadow: inset 2px 2px 3px rgba(255, 255, 255, .6),
            inset -2px -2px 3px rgba(0, 0, 0, .6);
        }

        .styled:hover {
            background-color: rgba(255, 0, 0, 1);
        }

        .styled:active {
            box-shadow: inset -2px -2px 3px rgba(255, 255, 255, .6),
            inset 2px 2px 3px rgba(0, 0, 0, .6);
        }
    </style>
    <meta http-equiv="Content-Type" content="text/html" ; charset=UTF-8">
    <title>Update a record(Owners)</title>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<form action="updateOwn" method="post">
      <pre>
    Id:   <input type="text" name="id" value="${owner.id}" readonly="true"/>
    ΑΦΜ: <input type="text" name="afm"value=${owner.afm}/>
    Ονομα: <input type="text" name="onoma" value=${owner.onoma}/>
    Επίθετο: <input type="text" name="epitheto" value=${owner.epitheto}/>
    Διεύθυνση: <input type="text" name="dieuthinsi"value=${owner.dieuthinsi}/>
    Email: <input type="text" name="email"value=${owner.email}/>
    Κωδικος: <input type="text" name="kwdikoXristi"value=${owner.kwdikoXristi}/>
    Μαρκα: <input type="text" name="markaOximatos"value=${owner.markaOximatos}/>
    Πινακιδα: <input type="text" name="pinakidaOximatos"value=${owner.pinakidaOximatos}/>
    Χρηστης: Admin <input type="radio" name="tipoXristi" value="Administrator"${owner.tipoXristi=='Administrator'?'checked':'' }/>    User <input type="radio" name="tipoXristi" value="User"${owner.tipoXristi=='User'?'checked':'' }/>

          <br>
    <input type="submit" value="Αποθηκευσε τα Δεδομενα"/>
    </pre>
</form>

<button class="favorite styled"  type="button">
<a href="deleteOwner?id=${owner.id}">ΔΙΑΓΡΑΦΗ ΠΑΡΟΥΣΑΣ ΚΑΤΑΧΩΡΗΣΗΣ</a><
</button>

<br>
<a href="index2.html"> Aρχικη σελιδα</a> <br>
<a href="RepairPages"> Repair Page Επιλογες</a><br>
<a href="OwnerPages"> Οwner Page Επιλογες</a><br>

</body>
</html>