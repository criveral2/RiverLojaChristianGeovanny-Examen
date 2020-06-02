<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
	
<link rel="stylesheet"
	href="/Agenda_Virtual_JPA/CSS/estilos-agenda.css">
	 
	
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  
  
  <script src='https://kit.fontawesome.com/a076d05399.js'></script>
  
  
  
<title>Agenda Telefonica</title>
</head>
<body>
<c:set var = "usuario" value = "${requestScope['usuario']}" />

	<div class="container">
	
		
		
		<div class="page-header p-3 text-center">
			<nav class="navbar navbar-expand-sm bg-dark navbar-dark justify-content-center">
				<!-- Brand/logo -->
				<a class="navbar-brand"  href="#"> <img class="rounded" src="/Agenda_Virtual_JPA/img/logo.png" alt="logo"
					style="width: 60px;">
				</a>
				
	
	  				 <button class="btn btn-white" type="button" ><a class="nav-link text-light"  href="/RiveraLojaChristianGeovanny-Examen/AgregarLibro.jsp"  ><i class='fas fa-plus-circle' style='font-size:48px;color:white'></i></a></button>

			</nav>
		</div>
		
	</div>
	
	<!-- ------------------------------------------------------------------------------------------------- -->
	<div>





<c:choose>
<c:when test="${usuario.telefono.size() > 0 }">
<!-- <p> ${usuario}</p> -->
<div>
<h3 class="ui top attached header">
  Numeros Personales
</h3>
<div class="ui attached segment">
  
<table class="table table-striped table-responsive-md btn-table">

<thead>
  <tr>
    <th> </th>
    <th>Numero</th>
    <th>Tipo</th>
    <th>Operadora</th>
    <th> </th>
    <th> </th>
  </tr>
</thead>

<tbody>

<c:set var = "i" value = "${0}" />

<c:forEach var="telefono" items="${usuario.telefono}">
<c:set var = "i" value = "${i+1}" />


  <tr>
    <th scope="row">${i}</th>
   
    <td>${telefono.numero}</td>
    <td>${telefono.tipo}</td>
    <td>${telefono.operadora}</td>
    <td>
    <button class="btn btn-dark" type="button"><a class="nav-link"  href="/Agenda_Virtual_JPA/Crud?EditTel=${telefono.codigo}"  >Editar</a></button>
     </th> 
     <th>
      <button class="btn btn-dark" type="button"><a class="nav-link"  href="/Agenda_Virtual_JPA/Crud?ElimTel=${telefono.codigo}" >Eliminar</a></button>
    </td>
    
  </tr>
 
  
</c:forEach>
  
</tbody>



</table>
</div>

</div>

</c:when>
</c:choose>

</div>
	
	<!-- -------------------------------------------------------------------------------------------------- -->
	




























	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script>


</body>
</html>