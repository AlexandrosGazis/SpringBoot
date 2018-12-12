<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html >

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" ; charset=UTF-8">
    <title>Create New Data Entry-User</title>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<form action="saveInfo" method="post">
      <pre>
    Δωσε μου ΑΦΜ: <input type="text" name="afm" value="${item.value}/>
    <input type="submit" value="Αποθηκευσε τα Δεδομενα"/>

          <button class="favorite styled"  type="button">
<a href="deleteOwner?id=${owner.id}">ΔΙΑΓΡΑΦΗ ΠΑΡΟΥΣΑΣ ΚΑΤΑΧΩΡΗΣΗΣ</a>
</button>

    </pre>
</form>
${msg}
<br>
<a href="index2.html"> Aρχικη σελιδα</a> <br>
<a href="RepairPages"> Repair Page Επιλογες</a><br>
<a href="OwnerPages"> Οwner Page Επιλογες</a><br>



<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
</body>
</html>