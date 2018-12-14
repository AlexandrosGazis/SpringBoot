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
        <th>Επιθετο</th>
        <th>Διευθυνση</th>
        <th>Email</th>
        <th>Μαρκα Οχηματος</th>
        <th>Πινακιδα Οχηματος</th>
        <th>Τυπος Χρηστη</th>
        <th></th>

    </tr>

    <#list owners as owner>

      <tr>

        <td>${owner.id}</td>
        <td>${owner.afm}</td>
        <td>${owner.onoma}</td>
        <td>${owner.epitheto}</td>
        <td>${owner.dieuthinsi}</td>
        <td>${owner.email}</td>
        <td>${owner.markaOximatos}</td>
        <td>${owner.pinakidaOximatos}</td>
        <td>${owner.TipoXristi!"User"}</td>

          <td><a href="showUpdate?id=${owner.id}">Update</a></td>


        </tr>
    </#list>






</table>
<br>
<a href="index2.html"> Aρχικη σελιδα</a> <br>
<a href="RepairPages"> Repair Page Επιλογες</a><br>
<a href="OwnerPages"> Οwner Page Επιλογες</a><br>
<br><br>
<a href="logout">Logout</a><br>


</body>
</html>