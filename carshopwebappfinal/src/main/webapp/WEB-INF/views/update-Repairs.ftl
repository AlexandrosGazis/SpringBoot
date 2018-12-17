<#setting number_format="computer">

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
    <title>Update a record(Repairs)</title>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<form action="updateRepair" method="post">
      <pre>
     Id:   <input type="text" name="id" value="${repair.id}" readonly="true"/>
    Ημερομηνία(YYYY-MM-DD): <input type="text" name="date" value="${repair.date}"/>
    Κατάσταση: <input type="text" name="katastasi" value="${repair.katastasi}"/>
    Είδος επισκευής: <input type="text" name="eidosepiskeuis" value="${repair.eidosepiskeuis}"/>
    Κόστος(dot separated): <input type="text" name="kostos" value="${repair.kostos}"/>
    Χρηστης: <input type="text" name="owner" value="${repair.owner}"/>
    Περιγραφή: <input type="text" name="perigrafi" value="${repair.perigrafi}"/>

     <br>
    <input type="submit" value="Αποθηκευσε τα Δεδομενα"/>
    </pre>
</form>

<button class="favorite styled"  type="button">
    <a href="deleteRepair?id=${repair.id}">ΔΙΑΓΡΑΦΗ ΠΑΡΟΥΣΑΣ ΚΑΤΑΧΩΡΗΣΗΣ</a>
</button>



<br>
<a href="index2.html"> Aρχικη σελιδα</a> <br>
<a href="RepairPages"> Repair Page Επιλογες</a><br>
<a href="OwnerPages"> Οwner Page Επιλογες</a><br>
<br><br>
<a href="logout">Logout</a><br>
</body>
</html>