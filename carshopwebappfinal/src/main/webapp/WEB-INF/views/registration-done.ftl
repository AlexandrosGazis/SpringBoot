<#setting number_format="computer">
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Team 2 Project Future, Spring MVC project</title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/round-about.css" rel="stylesheet">

</head>

<body>

<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
        <a class="navbar-brand" href="https://www.codehub.gr/product/java_spring/"><img src="https://www.codehub.gr/wp-content/uploads/2018/01/cropped-CodeHub-logo_320x132.png"
                                                                                        class="responsive-img" style='max-height:33px;' alt="face"></a>
        <a class="navbar-brand" href="https://www.projectfuture.gr/java-spring.html"><img src="http://www.greenbanking.gr/~/media/Images/GreenBusiness/logonew.ashx"
                                                                                          class="responsive-img" style='max-height:33px;' alt="face"></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="http://localhost:8000/carshopwebapp/">Home
                        <span class="sr-only">(current)</span>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="http://localhost:8000/carshopwebapp/sintelestes.html">About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="https://github.com/AlexandreLeFou/SpringBoot">GitHub</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="https://gitlab.com/AlexandreLeFou">GitLab</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="logout">Logout</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- Page Content -->
<div class="container" style="padding-bottom: 300px;padding-top: 50px;">
    <div class="col-lg-12">
        <center> <h2 class="my-4">Owners</h2> </center>
    </div>
    <#if owners?size != 0>
        <table class ="table table-striped">
        <tr>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
            <th></th>

        </tr>

        <#list owners as owner>

            <tr>
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
    <#else>
        <center> <h5 class="my-4">There are no owners to display!</h5> </center>
        <div class="col-lg-12">
              <img class="rounded-circle img-fluid d-block mx-auto"style="width:50%" src="https://img.icons8.com/material/1600/nothing-found.png" alt="">
            <p></p>
        </div>
    </#if>
    <br>
</div>


<!-- /.container -->

<!-- Footer -->
<footer class="py-5 bg-dark">
    <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; Team 2 Project Future - Java | Spring 2018</p>
    </div>
    <!-- /.container -->
</footer>

<!-- Bootstrap core JavaScript -->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>