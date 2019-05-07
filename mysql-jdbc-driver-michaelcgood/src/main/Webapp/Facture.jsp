<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">


<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/bootstrap.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Facturation</title>
</head>
<body>
<script>
function myFunction() {
	  // Declare variables
	  var input, filter, table, tr, td, i;
	  input = document.getElementById("myInput");
	  filter = input.value.toUpperCase();
	  table = document.getElementById("myTable");
	  tr = table.getElementsByTagName("tr");

	  // Loop through all table rows, and hide those who don't match the search query
	  for (i = 0; i < tr.length; i++) {
		td = tr[i].getElementsByTagName("td")[0];
		if (td) {
		  if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
			tr[i].style.display = "";
		  } else {
			tr[i].style.display = "none";
		  }
		}
	  }
	}
</script>
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
 <th>Date</th>
 <th>Détail</th>
<th>Réclamation</th>
 </tr>
 </thead>
 
 <tbody>
 <c:forEach var="Facture" items="${factures}">
 <tr>
 <td>${Facture.id}</td>
 <td>${Facture.aujourdhui}</td>
<td> <button class='btn btn-lg ' style='background-color:transparent;' onclick="window.location.href = '/showfacture?id=${Facture.id}';">
 <i class="fas fa-microscope"></i>
 
</button></td>
<td> <button class='btn btn-lg ' style='background-color:transparent;' onclick="window.location.href = '/formulaire?id=${Facture.id}';"><i class="fas fa-exclamation-triangle" ></i></button></td>
 
 </tr>
 
 </c:forEach>
 </tbody>
 </table>


</div>



<script src="static/js/bootstrap.js"></script>
<script src="static/js/bootstrap.min.js"></script>
</body>
</html>