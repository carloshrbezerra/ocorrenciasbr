<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Ocorrencias BR</title>
<meta charset="UTF-8">
<meta name="description" content="">
<meta name="viewport" content="width=device-width">

<link rel="stylesheet" type="text/css" href="template/css/ocorrenciasbr.css">
<link rel="stylesheet" type="text/css" href="template/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="template/css/styles_charts.css">

<script>window.jQuery || document.write('<script src="template/js/vendor/jquery-1.10.1.js"><\/script>')</script>
<script src="template/js/vendor/bootstrap.min.js"></script>
</head>

<body>
	<nav class="navbar navbar-default" role="navigation">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div id="logo">
			<a href="index.jsp"> <img class="img-responsive"
				src="template/images/logo.png">
			</a>
		</div>
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-ex1-collapse">
				<span class="sr-only">Ocorrências</span> <span class="icon-bar"></span>
				<span class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
			<!-- 				<a class="navbar-brand" href="#">Brand</a> -->
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse navbar-ex1-collapse">
			<!-- 				<ul class="nav navbar-nav">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Dropdown <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="#">Action</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li><a href="#">Separated link</a></li>
							<li><a href="#">One more separated link</a></li>
						</ul></li>
				</ul>-->
			<!-- 				<form class="navbar-form navbar-left" role="search">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="Search">
					</div>
					<button type="submit" class="btn btn-default">Submit</button>
				</form>
				-->
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#">Contato</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Ocorrências<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#">2007</a></li>
					</ul></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</nav>


	<div id="background">

		<div id="content">

			<div class="section">

				<h4>Total Ocorrencias X Estado</h4>

				<ul class="timeline">
					<c:forEach var="o" items="${listOcorrenciaTotalEstado}">
						<li>
							<a data-toggle="modal" href="pages/ocorrencias/estados.jsp"
							title="${o.totalOcorrencia}"> <span class="lb"><c:out
										value="${o.estado}" /></span> <span class="count"
								style="width: ${((o.totalOcorrencia / 150)  >= 100) ? 100 : o.totalOcorrencia / 150}%"><c:out
										value="${o.totalOcorrencia}" /></span>
						</a>
						</li>
					</c:forEach>
				</ul>
			</div>
		</div>
		<!-- content -->
		<footer>
			<div id="footer">
				<div class="text-center">
					<p>Ocorrências BR &copy;</p>
				</div>
			</div>
		</footer>

	</div><!-- background -->

</body>
</html>