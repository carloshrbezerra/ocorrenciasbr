<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<title>Ocorrências BR</title>
	
	<meta charset="UTF-8">
	<meta name="description" content="">
	<meta name="viewport" content="width=device-width">
	
	<link rel="stylesheet" type="text/css" href="template/css/ocorrenciasbr.css">
	<link rel="stylesheet" type="text/css" href="template/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="template/css/page_transition.css">
	<link rel="stylesheet" type="text/css" href="template/css/styles_charts.css">
	<link rel="stylesheet" type="text/css" href="template/css/default.css" />
	<link rel="stylesheet" type="text/css" href="template/css/component.css" />
	<link rel="stylesheet" type="text/css" href="template/css/animacao.css">
	<link rel="stylesheet" type="text/css" href="template/css/style_home.css" />
	<link rel="stylesheet" type="text/css" href="template/css/style_maps.css" />
	<script src="js/modernizr.custom.js"></script>

	<script src="https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false"></script>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
	<script>window.jQuery || document.write('<script src="template/js/vendor/jquery-1.10.1.js"><\/script>')</script>
	<script src="template/js/vendor/bootstrap.min.js"></script>
	<script src="template/js/ocorrencias.js"></script>
	
	<script type="text/javascript">

			
		
	</script>

</head>

<body>
		<!-- HEADER -->
		<jsp:include page="/template/header.jsp"></jsp:include>
	
		<div id="content" class="content background">
		
		
			<%if(request.getAttribute("page") == null){%>
				<jsp:include page="/template/body.jsp" />			
			<%}else{%>
				<jsp:include page="${page}" />	
			<%}%>

			
			<script src="js/jquery.fittext.js"></script>
			<script src="js/boxgrid.js"></script>
			<script>
				$(function() {

					Boxgrid.init();
				

				});
			</script>
							
		</div><!-- content -->

		
		<!--  CONTAINER FOOTER  -->
		<jsp:include page="/template/footer.jsp" />
		
		
		
		<div id="mascara">
		
				
  
		</div>
	
</body>

</html>
