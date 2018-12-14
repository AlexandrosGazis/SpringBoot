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

    <#list owners as owner>


        <td>${owner.afm}</td>
        <td>${owner.onoma}</td>
        <td>${owner.epitheto}</td>
        <td>${owner.dieuthinsi}</td>
        <td>${owner.email}</td>
        <td>${owner.markaOximatos}</td>
        <td>${owner.pinakidaOximatos}</td>
        <td>${owner.tipoXristi}</td>


    </#list>

</table>


</body>

</html>