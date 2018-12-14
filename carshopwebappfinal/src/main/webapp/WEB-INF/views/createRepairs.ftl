<!DOCTYPE html >

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" ; charset=UTF-8">
    <title>Create New Data Entry-User</title>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<form action="saveRepair" method="post">
      <pre>
    Id:   <input type="text" name="id"/>
    Ημερομηνία(YYYY-MM-DD): <input type="text" name="date"/>
    Κατάσταση: <input type="text" name="katastasi"/>
    Είδος επισκευής: Μικρή <input type="radio" name="eidosepiskeuis" value="Μικρη"/>    Μεγάλη <input type="radio" name="eidosepiskeuis" value="Μεγάλη"/>
    Κόστος(dot separated): <input type="text" name="kostos"/>
    Χρηστης: <input type="text" name="owner"/>
    Περιγραφή: <input type="text" name="perigrafi"/>

    <input type="submit" value="Αποθηκευσε τα Δεδομενα"/>
    </pre>
</form>
${msg!"-"}
<br>
<a href="index2.html"> Aρχικη σελιδα</a> <br>
<a href="RepairPages"> Repair Page Επιλογες</a><br>
<a href="OwnerPages"> Οwner Page Επιλογες</a><br>
<a href="logout">Logout</a><br>


<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
</body>
</html>