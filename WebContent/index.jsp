<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<title>Ocorrencias BR</title>
		
		<meta name="description" content="">
        <meta name="viewport" content="width=device-width">

        <link rel="stylesheet" href="template/css/ocorrenciasbr.css">
        <link rel="stylesheet" href="template/css/bootstrap.css">
		<link rel="stylesheet" href="template/css/styles_charts.css">
        <script src="template/Chart/Chart.js"></script>
        <script src="template/js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>
        
        
       	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.js"></script>
       	<script>window.jQuery || document.write('<script src="template/js/vendor/jquery-1.10.1.js"><\/script>')</script>
       	<script src="template/js/vendor/bootstrap.min.js"></script>
       	<script src="template/js/main.js"></script>
		
	</head>

	<body>
		
		<div class="container">
		
			<header>
				<jsp:include page="/template/header.jsp"></jsp:include>
			</header>
				
			<div id="content">
				
				<div id="background">
		
					<div class="container">
						<div class="row ">
					    	<div class="position col-lg-6 col-md-6 col-sm-6 col-xs-6">
								<a href="ocorrencias.do" >
									<img class="img-responsive imgpos" src="template/images/chart.png">
									<h4>Graficos por Região</h4>
									<p>Visualize e analise as estatisticas por região.</p>
								</a>
					        </div>                    
							<div class="position col-lg-6 col-md-6 col-sm-6 col-xs-6">
								<a href="locate.jsp" >
									<img class="img-responsive imgpos" src="template/images/locate.png">
									<h4>Meu Local</h4>
									<p>Veja as estatiticas com base no local onde se encontra.</p>
								</a>
					       	</div>                                
					    </div>
					</div>
					
				</div><!-- background -->
				
			</div><!-- content -->
				
			<footer>
				<jsp:include page="/template/footer.jsp"></jsp:include>
			</footer>
		
		</div><!-- container -->

	</body>

</html>