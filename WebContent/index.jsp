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
<!-- <script src="template/Chart/Chart.js"></script> 

<script src="template/js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.js"></script> -->

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
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
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

			<div class="container">
				<div class="row ">
					<div class="box-link-text">
					<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
						<a href="ocorrencias.do"> <img class="img-responsive imgpos"
							height="200px" width="200px" src="template/images/chart.png">
							<h4>Graficos por Região</h4>
							<p>Visualize e analise as estatisticas por região.</p>
						</a>
					</div>
					<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
						<a href="pages/ocorrencias/estados.jsp"> <img class="img-responsive imgpos"
							height="250px" width="250px" src="template/images/locate.png">
							<h4>Meu Local</h4>
							<p>Veja as estatiticas com base no local onde se encontra.</p>
						</a>
					</div>
					</div>
				</div>
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


	</div>
	<!-- background -->
</body>

</html>