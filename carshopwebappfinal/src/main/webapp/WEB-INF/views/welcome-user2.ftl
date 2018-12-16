<html>
<head>
<title>Welcome</title>
	<style>
		table, th, td {
			border: 3px solid black;
		}


	</style>
	<meta http-equiv="Content-Type" content="text/html" ; charset=UTF-8">
	<title>View all Repair records</title>
	<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<#include "menu-user.ftl">
	<h3 style="color: red;">Hello User</h3>


	<h2>Repairs:</h2>
	<table>
		<tr>
			<th>Ημερομηνία</th>
			<th>Κατάσταση</th>
			<th>Είδος επισκευής</th>
			<th>Κόστος</th>
			<th>Owner(service)</th>
			<th>Περιγραφή</th>
			<th></th>

		</tr>

		<#list repairs as repair>

			<tr>


			<td>${repair.date}</td>
			<td>${repair.katastasi}</td>
			<td>${repair.eidosepiskeuis}</td>
			<td>${repair.kostos}</td>
			<td>${repair.owner}</td>
			<td>${repair.perigrafi}</td>


			<td><a href="showUpdateRepair?id=${repair.id}">Update</a></td>

			</tr>
		</#list>

</body>
</html>