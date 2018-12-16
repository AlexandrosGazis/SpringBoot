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

        <th>Επιθετο</th>
        <th>Email</th>

    </tr>

    <#list owners as owner>

        <tr>

        <td>${owner.epitheto}</td>
        <td>${owner.email}</td>

        </tr>
    </#list>

${msg}




</table>
<br>
<a href="index2.html"> Aρχικη σελιδα</a> <br>
<a href="RepairPages"> Repair Page Επιλογες</a><br>
<a href="OwnerPages"> Οwner Page Επιλογες</a><br>
<br><br>
<a href="logout">Logout</a><br>


</body>
</html>