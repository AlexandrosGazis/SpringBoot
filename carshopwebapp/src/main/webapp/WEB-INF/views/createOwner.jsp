<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html >

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" ; charset=UTF-8">
    <title>Create New Data Entry</title>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<form action="saveOwn" method="post">
      <pre>
    Id:   <input type="text" name="id"/>
    ΑΦΜ: <input type="text" name="afm"/>
    Ονομα: <input type="text" name="onoma"/>
    Επίθετο: <input type="text" name="epitheto"/>
    Διεύθυνση: <input type="text" name="dieuthinsi"/>
    Email: <input type="text" name="email"/>
    Κωδικος: <input type="text" name="kwdikoXristi"/>
    Μαρκα: <input type="text" name="markaOximatos"/>
    Πινακιδα: <input type="text" name="pinakidaOximatos"/>
    Χρηστης: Admin <input type="radio" name="tipoXristi" value="Administrator"/>    User <input type="radio" name="tipoXristi" value="User"/>
    <input type="submit" value="Αποθηκευσε τα Δεδομενα"/>
    </pre>
</form>
${msg}
<br>
<a href="displayOwners">View All Data!</a>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
</body>
</html>