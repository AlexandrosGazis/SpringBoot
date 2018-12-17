

<html>
<head>
    <title>Welcome</title>
</head>
<body>
<#include "menu-admin.ftl">
<h3 style="color: red;">Hello Admin</h3>
</body>
<h2>Repairs:</h2>
<table>
    <tr>
        <th>Repair id</th>
        <th>Ημερομηνία</th>
        <th>Κατάσταση</th>
        <th>Είδος επισκευής</th>
        <th>Κόστος</th>
        <th>Περιγραφή</th>
        <th></th>

    </tr>

    <#list repairs as repair>

        <tr>

        <td>${repair.id}</td>
        <td>${repair.date}</td>
        <td>${repair.katastasi}</td>
        <td>${repair.eidosepiskeuis}</td>
        <td>${repair.kostos}</td>
        <td>${repair.perigrafi}</td>


        <td><a href="showUpdateRepair?id=${repair.id}">Update</a></td>
${msg}

        </tr>
    </#list>






</table>


${msg!"olaaaaaaaaaaaaaaaaaaaaa"}


</html>