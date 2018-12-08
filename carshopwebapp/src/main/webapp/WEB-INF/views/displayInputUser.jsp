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
<h2>${message}</h2>
<form action="/kwstas">
    <table>
        <caption>
            <h3>Enter Your Login Credentials</h3>
        </caption>
        <tr>
            <td>User Name</td>
            <td><input type="text" id="userName"></input></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" id="password"></input></td>
        </tr>
        <tr rowspan="2">
            <td><input type="submit"></input></td>
        </tr>
    </table>
</form>

<br>
<a href="displayOwners">View All Data!-users data-</a>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
</body>
</html>