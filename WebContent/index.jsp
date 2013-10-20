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
	<link rel="stylesheet" type="text/css" href="template/css/page_transition.css">
	<link rel="stylesheet" type="text/css" href="template/css/styles_charts.css">
	<link rel="stylesheet" type="text/css" href="template/css/default.css" />
	<link rel="stylesheet" type="text/css" href="template/css/component.css" />
	<script src="template/js/modernizr.custom.js"></script>
 
	<script>window.jQuery || document.write('<script src="template/js/vendor/jquery-1.10.1.js"><\/script>')</script>
	<script src="template/js/vendor/bootstrap.min.js"></script>

</head>

<body>
		<!-- HEADER -->
		<jsp:include page="/template/header.jsp"></jsp:include>
	
		<div id="content" class="content background">
		
			<jsp:include page="${page}" />
							
		</div><!-- content -->

		
		<!--  CONTAINER FOOTER  -->
		<jsp:include page="/template/footer.jsp" />
		

	
</body>

</html>