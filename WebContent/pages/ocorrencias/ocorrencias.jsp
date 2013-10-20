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
<!-- 	<link rel="stylesheet" type="text/css" href="template/css/styles_charts.css"> -->
	<link rel="stylesheet" type="text/css" href="template/css/charts.css">

	<script>window.jQuery || document.write('<script src="template/js/vendor/jquery-1.10.1.js"><\/script>')</script>
	<script src="template/js/vendor/bootstrap.min.js"></script>
</head>

<body>

	<header>
		<jsp:include page="/template/header.jsp"></jsp:include>
	</header>

	<div id="background">

		<div id="content">

			<div class="section">

				<h4>Total Ocorrencias X Estado</h4>

				<ul class="timeline">
					<c:forEach var="o" items="${listOcorrenciaTotalEstado}">
						<li>
							<a data-toggle="modal" href="pages/ocorrencias/estados.jsp"
							title="${o.totalOcorrencia}"> <span class="label"><c:out
										value="${o.estado}" /></span> <span class="count"
								style="height: ${((o.totalOcorrencia / 150)  >= 100) ? 100 : o.totalOcorrencia / 150}%"><c:out
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