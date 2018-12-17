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
<div class="container">

    <#--<!-- Introduction Row &ndash;&gt;-->
    <#--<h1 class="my-4">Welcome-->
    <#--<small> to Team's 2 Project Future assignment!</small>-->
    <#--</h1>-->
    <#--<p>The aim of this site is to present a CRUD application developed using Java Spring.-->
    <#--The aim of this project was to deeply understand concers regarding the 3-tier Architecture used by this MVC framework.</p>-->

    <!-- Team Members Row -->
    <div class="row">
        <div class="col-lg-12">
            <center> <h2 class="my-4">Repairs</h2> </center>
        </div>

        <div class="col-lg-6 col-sm-6 text-center mb-4">
            <a href="showCreateRepair">  <img class="rounded-circle img-fluid d-block mx-auto"style="width:50%" src="https://vignette.wikia.nocookie.net/swordartonlineroleplay/images/f/fb/Il_fullxfull.341200860.jpg/revision/latest?cb=20121211040152" alt=""></a>
            <h3>Add new repairs
                <small></small>
            </h3>
            <p></p>
        </div>

        <div class="col-lg-6 col-sm-6 text-center mb-4">
            <a href="RepairUpdatePage">  <img class="img-thumbnail" style="width:50%" src="https://upload.wikimedia.org/wikipedia/en/f/fb/Blacksmith_icon_symbol_-_hammer_and_anvil.jpg" alt=""></a>
            <h3>Update repairs
                <small></small>
            </h3>
            <p></p>
        </div>

    </div>


</div>
<!-- Team Members Row -->
<div class="row">
    <div class="col-lg-12">
        <center> <h2 class="my-4">Search Functions</h2> </center>
    </div>

    <div class="col-lg-4 col-sm-6 text-center mb-4">
        <a href="http://localhost:8000/carshopwebapp/search-afm">  <img class="rounded-circle img-fluid d-block mx-auto" src="https://findicons.com/files/icons/2781/google_jfk_icons/128/search.png" alt=""></a>
        <h3>Search AFM
            <small></small>
        </h3>
        <p>Js dummy to search AFM</p>
    </div>

    <div class="col-lg-4 col-sm-6 text-center mb-4">
        <a href="http://localhost:8000/carshopwebapp/search-email">  <img class="rounded-circle img-fluid d-block mx-auto" src="https://findicons.com/files/icons/2781/google_jfk_icons/128/search.png" alt=""></a>
        <h3>Search Εμαιλ
            <small></small>
        </h3>
        <p>Js dummy to search Εμαιλ</p>
    </div>

    <div class="col-lg-4 col-sm-6 text-center mb-4">
        <a href="http://localhost:8000/carshopwebapp/search-epitheto">  <img class="rounded-circle img-fluid d-block mx-auto" src="https://findicons.com/files/icons/2781/google_jfk_icons/128/search.png" alt=""></a>
        <h3>Search Επιθετο
            <small></small>
        </h3>
        <p>Js dummy to search Εμαιλ</p>
    </div>

</div>
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
