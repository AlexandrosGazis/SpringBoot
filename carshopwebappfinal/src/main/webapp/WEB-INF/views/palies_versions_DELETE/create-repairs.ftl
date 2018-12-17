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
    <div class="col-lg-12">
        <center> <h2 class="my-4">Create a new repair</h2> </center>
    </div>
    <form action ="saveRepair" method="post" class="form-horizontal">
        <fieldset>

            <!-- Form Name -->

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="textinput">ID</label>
                <div class="col-md-4">
                    <input id="textinput" name="id" type="text" placeholder="Enter a valid id" class="form-control input-md">

                </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="textinput">Date (YYYY-MM-DD)</label>
                <div class="col-md-4">
                    <input id="textinput" name="date" type="text" placeholder="Enter a date" class="form-control input-md">

                </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="textinput">Status</label>
                <div class="col-md-4">
                    <input id="textinput" name="katastasi" type="text" placeholder="Enter the vehicle's current state" class="form-control input-md">

                </div>
            </div>

            <!-- Multiple Radios (inline) -->
            <div class="form-group">
                <label class="col-md-4 control-label" for="usertype">Repair Type</label>
                <div class="col-md-4">
                    <label class="radio-inline" for="usertype-0">
                        <input type="radio" name="eidosepiskeuis" id="usertype-0" value="Μικρη" checked="checked">
                        Minor
                    </label>
                    <label class="radio-inline" for="usertype-1">
                        <input type="radio" name="eidosepiskeuis" id="usertype-1" value="Mεγαλη">
                        Major
                    </label>
                </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="lastname">Cost</label>
                <div class="col-md-4">
                    <input id="lastname" name="kostos" type="text" placeholder="Enter the cost (dot separated)" class="form-control input-md">

                </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="email">Owner</label>
                <div class="col-md-4">
                    <input id="email" name="owner" type="text" placeholder="Enter the owner's name" class="form-control input-md">

                </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="brand">Details</label>
                <div class="col-md-4">
                    <input id="brand" name="perigrafi" type="text" placeholder="Enter the details of the repair" class="form-control input-md">

                </div>
            </div>

            <input type="submit" value="Create new Repair"/>

        </fieldset>
    </form>

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
