<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Ocorrencias BR</title>

<meta name="description" content="">
<meta name="viewport" content="width=device-width">

<link rel="stylesheet" href="template/css/ocorrenciasbr.css">
<link rel="stylesheet" href="template/css/united_bootstrap.css">
<link rel="stylesheet" href="template/css/styles_charts.css">
<script src="template/Chart/Chart.js"></script>
<script src="template/js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>


<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.js"></script>
<script>
	window.jQuery
			|| document
					.write('<script src="template/js/vendor/jquery-1.10.1.js"><\/script>')
</script>
<script src="template/js/vendor/bootstrap.min.js"></script>
<script src="template/js/main.js"></script>
<script type="text/javascript">
	function mostra(id) {
		alert(id)
		//var frm = document.getElementById(id);
		//if(frm.style.visibility == 'hidden')
		//	frm.style.visibility = 'visible';
		//else
		//	frm.style.visibility = 'hidden';
	}
</script>
</head>

<body>

	<div class="container">
		<header>
			<jsp:include page="/template/header-dropdown.jsp"></jsp:include>
		</header>
		<div id="content">
			<div id="background">
				<div class="section">

					<h4>Total Ocorrencias X Estado</h4>

					<ul class="timeline">
						<c:forEach var="o" items="${listOcorrenciaTotalEstado}">
							<li>
								<!-- <a href="pages/ocorrencias/estados.jsp?estado=${o.estado}" title="${o.totalOcorrencia}"> -->
								<a data-toggle="modal" href="#estado${o.estado}"
								title="${o.totalOcorrencia}"> <span class="lb"><c:out
											value="${o.estado}" /></span> <span class="count"
									style="width: ${((o.totalOcorrencia / 150)  >= 100) ? 100 : o.totalOcorrencia / 150}%"><c:out
											value="${o.totalOcorrencia}" /></span>
							</a>

								<div class="modal fade" id="estado${o.estado}" tabindex="-1"
									role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
									<div class="modal-dialog">
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal"
													aria-hidden="true">&times;</button>
												<h4 class="modal-title">${o.estado}</h4>
											</div>
											<div class="modal-body">
												<!-- GRAFICOS AQUI -->
												<div class="position col-lg-4 col-md-4 col-sm-6 col-xs-12">
													<div id="grafico1${o.estado}" class="position grafico">
														<h2>TITULO</h2>
														<h3>${o.totalOcorrencia}</h3>
													</div>
													<!-- height: 200px; -->
												</div>
												<div class="position col-lg-4 col-md-4 col-sm-6 col-xs-12">
													<div id="grafico2${o.estado}" class="position grafico">
														<h2>TITULO</h2>
														<h3>${o.totalOcorrencia}</h3>
													</div>
													<!-- height: 200px; -->
												</div>
												<div class="position col-lg-4 col-md-4 col-sm-6 col-xs-12">
													<div id="grafico3${o.estado}" class="position grafico">
														<h2>TITULO</h2>
														<h3>${o.totalOcorrencia}</h3>
													</div>
													<!-- height: 200px; -->
												</div>
												<div class="position col-lg-4 col-md-4 col-sm-6 col-xs-12">
													<div id="grafico4${o.estado}" class="position grafico">
														<h2>TITULO</h2>
														<h3>${o.totalOcorrencia}</h3>
													</div>
													<!-- height: 200px; -->
												</div>
												<div class="position col-lg-4 col-md-4 col-sm-6 col-xs-12">
													<div id="grafico5${o.estado}" class="position grafico">
														<h2>TITULO</h2>
														<h3>${o.totalOcorrencia}</h3>
													</div>
													<!-- height: 200px; -->
												</div>
												<div class="position col-lg-4 col-md-4 col-sm-6 col-xs-12">
													<div id="grafico6${o.estado}" class="position grafico">
														<h2>TITULO</h2>
														<h3>${o.totalOcorrencia}</h3>
													</div>
													<!-- height: 200px; -->
												</div>

											</div>
											<div class="modal-footer">
												<button type="button" class="btn btn-default"
													data-dismiss="modal">Fechar</button>
											</div>
										</div>
										<!-- /.modal-content -->
									</div>
									<!-- /.modal-dialog -->
								</div> <!-- /.modal -->

							</li>
						</c:forEach>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<!-- GRAFICOS DE EXEMPLO BARRA 
<div class="section">

	 <h4>Total Ocorrencias X Estado</h4>
	
	<ul class="timeline">
	
				
		<c:forEach var="o" items="${listOcorrenciaTotalEstado}">
				
		
	      <li>
	        <a href="http://www.example.com/2007/dec/1/" title="${o.totalOcorrencia}">
	          <span class="label"><c:out value="${o.estado}" /></span>
	          <span class="count" style="height: ${((o.totalOcorrencia / 150)  >= 100) ? 100 : o.totalOcorrencia / 150}%"><c:out value="${o.totalOcorrencia}" /></span>
	        </a>
	      </li>
				
				
		</c:forEach>
	
	</ul>

</div>


<div class="section">

	 <h4>Total Ocorrencias X Pessoas Alcoolizadas</h4>
	
	<c:forEach var="p" items="${listOcorrenciaTotalPessoalAcool}">
	
	<ul class="chartlist">
      <li>
        <a href="http://www.example.com/fruits/apples/"><c:out value="${p.estado}" /></a> 
        <span class="count"><c:out value="${p.totalOcorrencia}" /></span>
        <span class="index" style="width: ${p.totalOcorrencia}%">(<c:out value="${p.totalOcorrencia}" />)</span>
      </li>
    </ul>
    
    </c:forEach>
    
</div>
-->


</body>
</html>