<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/bootstrap.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Here</title>
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
<h3>Connexion</h3>


<form class="form-horizontal" method="POST" action="login-client">
<c:if test="${not empty error }">
<div class="alert alert-danger">
<c:out value="${error }"></c:out></div>
</c:if>

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
&nbsp&nbsp&nbsp<input type="submit" class="btn btn-primary" value="Login"/>
</div>



</form>
</div>

<script src="static/js/bootstrap.js"></script>
<script src="static/js/bootstrap.min.js"></script>
</body>
</html>