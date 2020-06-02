<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Importamos las diferentes librerias y herramientas que nos serviran para dar un respectivo diseño a nuestra
pagina, para ello utilizamos el editos de bosstrap -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet" href="/Agenda_Virtual_JPA/CSS/estilos.css">
<title>Crear Telefono</title>
</head>
<body>
<!-- Recuperamos los satos enviados por el servlet mediante  jspl -->
<c:set var = "cedula" value = "${requestScope['cedula']}" />
<!-- <p> ingreso a la pagina recibiendo la cedula: ${cedula}</p> -->

	<div class="container">
		<div class="row justify-content-center pt-3 mt-3 mr-1">
			<div class="col-md-6 formulario">
			
			<!-- Creamos un folmulario con un metodo post y le dirigimos a nuestro servlet el cual  se encargara del
registro del nuevo usuario  -->

				<form method="POST" action="/Agenda_Virtual_JPA/CrearT?cedula=${cedula}">

					<div class="form-group text-center pt-3">
						<h1 class="text-light">CREAR UN LIBRO</h1>
					</div>
					<div class="form-group mx-sm-4 pt-1 ">
						<H6>Ingrese el Titulo:</H6>
						<input type="text" class="form-control"
							placeholder="Ingrese su tipo aqui" name="tipo" required>
					</div>
					<div class="form-group mx-sm-4 pt-1">
						<H6>Ingrese su Autor :</H6>
						<input type="text" class="form-control"
							placeholder="Ingrese su Numero aqui" name="numero" required>
					</div>
					<div class="form-group mx-sm-4 pt-1">
						<H6>Ingrese el numero de paginas :</H6>
						<input type="text" class="form-control"
							placeholder="Ingrese su Operadora aqui" name="operadora" required>
					</div>
					
					<div class="form-group mx-sm-4 pb-2">
						<input type="submit" class=" btn  btn-block ingresar"
							value="REGISTRAR">
					</div>
					
					<div class="form-group mx-sm-4 pb-2">
							<a class="nav-link " href="/Agenda_Virtual_JPA/Listar">CANCELAR</a>
					</div>
				
					
				</form>
				
				
			</div>
		</div>


	</div>


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