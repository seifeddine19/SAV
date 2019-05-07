<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/bootstrap.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Detail Facture</title>
</head>
<body>
<style>
@media print {
  #printPageButton {
    display: none;
  }
}
</style>
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
        <a class="nav-link" href="#">${Login.getNom()}</a>
      </li>
     
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input id="myInput" class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" >
      <button class="btn btn-outline-success my-2 my-sm-0" onclick="myFunction()" type="button">Search</button>
    </form>
  </div>
</nav>
<div class="table-responsive">
<table class="table table-striped table-bordered" id="myTable">
<thead>
<tr>
<th>Id_Facture</th>
<th>${Facture.id}</th>
<tr>
</thead>

<tbody>
<tr>
<td>Date De Facturation</td>
<td>${Facture.aujourdhui}</td>
</tr>

<tr>
<td>Id_Produit</td>
<td>${Produit.getId()}</td>
</tr>
<tr>
<td>Nom de Produit</td>
<td>${Produit.getNom()}</td>
</tr>
<tr>
<td>Quantit�</td>
<td>${Produit.getQte()}</td>
</tr>

<tbody>
</table>
</div>
<button id="printPageButton" type="button" class="btn btn-success" onclick="window.print()">Imprimer</button>






</body>
</html>