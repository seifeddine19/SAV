<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/bootstrap.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reclamation</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="/home">Service Aprés Vente </a>
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
        <a class="nav-link" href="#">ahmed</a>
      </li>
     
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input id="myInput" class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" >
      <button class="btn btn-outline-success my-2 my-sm-0" onclick="myFunction()" type="button">Search</button>
    </form>
      </div>
 </nav>  
    <div class="container text-center">
<h3>Remplire Ce Formulaire </h3>
</div>
<hr>
<form class="form-horizontal" method="POST" action="save-Reclamation">

<input type="hidden" name="id" value="${Reclamation.id}">
<input type="hidden" name="Facture_id" value="${Facture.getId()}">
<div class="form-group">

<div class="col-md-7">
<label class="control-labe">Id_Facture</label><input type="text" class="form-control" name ="" disabled="disabled" value="${Facture.getId()}">
</div>
</div>

<div class="col-md-7">
<label class="control-labe">Desciption</label><textarea class="form-control" rows="5" name="Description" ></textarea>
</div>
</div>

<div class="form-group">
<label class="control-label col-md-3">Date</label>
<div class="col-md-7">
<input type="text" class="form-control" name ="Date" value="${Reclamation.Date}">
</div>
</div>

<div class="form-group">
&nbsp&nbsp&nbsp<input type="submit" class="btn btn-primary" value="Envoyer"/>
</div>

</form>



    






</body>
</html>