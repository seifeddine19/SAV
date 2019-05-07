<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/bootstrap.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registre here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="/home">Service Apr�s Vente </a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/home">Accueil <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/Registre">Inscription</a>
      </li>
    <li class="nav-item">
        <a class="nav-link" href="/Login">Connexion</a>
      </li><li class="nav-item">
        <a class="nav-link" href="#">Profile</a>
      </li>
     
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>


<div class="container text-center">
<h3>Inscription</h3>
</div>
<hr>
<form class="form-horizontal" method="POST" action="save-client">
<input type="hidden" name="id" value="${Client.id}">
<div class="form-group">

<div class="col-md-7">
<label class="control-labe">Nom</label><input type="text" class="form-control" name ="Nom" value="${Client.Nom}">
</div>
</div>

<div class="form-group">
<label class="control-label col-md-3">Telephone</label>
<div class="col-md-7">
<input type="text" class="form-control" name ="Telephone" value="${Client.Telephone}">
</div>
</div>
<div class="form-group">
<label class="control-label col-md-3">Email</label>
<div class="col-md-7">
<input type="text" class="form-control" name ="Email" value="${Client.Email}">
</div>
</div>
<div class="form-group">
<label class="control-label col-md-3">Username</label>
<div class="col-md-7">
<input type="text" class="form-control" name ="Login" value="${Login.login}">
</div>
</div>
<div class="form-group">
<label class="control-label col-md-3">Mot de Passe</label>
<div class="col-md-7">
<input type="password" class="form-control" name ="mdp" value="${Login.mdp}">
</div>
</div>
<div class="form-group">
&nbsp&nbsp&nbsp<input type="submit" class="btn btn-primary" value="Registre"/>
</div>

</form>






<script src="static/js/bootstrap.js"></script>
<script src="static/js/bootstrap.min.js"></script>
</body>
</html>