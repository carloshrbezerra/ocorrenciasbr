<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!--  CONTAINER BOX(GRAFICOS, INSTRUÇÕES, MAPA) PRINCIPAIS -->
<div class="container container-box">
				<div class="row ">
					<div class="box-link-text">
						<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
						<div class="box-first box box-geral">
							<a href="#graficos"> <!-- <img class="img-responsive imgpos"
								height="200px" width="200px" src="template/images/chart.png"> -->
								<h4>Estatísticas</h4>
								<p>Visualize e analise as ocorrencias de trânsito</p>
							</a>
						</div>
						</div>
						<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
						<div class="box-gold box2 box-geral">
							<a href="ocorrencias.do"> <!-- <img class="img-responsive imgpos"
								height="200px" width="200px" src="template/images/chart.png"> -->
								<h4>Curiosidades</h4>
								<p>Veja as curiosidades.</p>
							</a>
						</div>
						</div>
						<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
						<div class="box-gold box3 box-geral">
							<a href="pages/ocorrencias/estados.jsp"> <!-- <img class="img-responsive imgpos"
								height="250px" width="250px" src="template/images/locate.png"> -->
								<h4>Minha Localização</h4>
								<p>Como esta o trânsito perto de você</p>
							</a>
						</div>
						</div>
					</div>
				</div>
</div>
<!--:END:  CONTAINER BOX PRINCIPAIS -->

<div class="container container-contact">

	
	

</div>


<!--  CONTAINER DOS GRAFICOS OCORRENCIAS / ESTADO -->
		<div id="graficos" class="panel">
			
	
				<div class="section">
	
					<h4>Total Ocorrencias X Estado</h4>
	
					<ul class="timeline">
						<c:forEach var="o" items="${listOcorrenciaTotalEstado}">
							<li>
								<span class="name"><c:out value="${o.estado}" /></span>
								<a data-toggle="modal" href="estado.do?tipo=estado&estado=${o.estado}"
								title="${o.totalOcorrencia}">
								<span class="count" style="width: ${((o.totalOcorrencia / 150)  >= 100) ? 100 : o.totalOcorrencia / 150}%"></span>
								</a>
								<span class="value"><c:out value="${o.totalOcorrencia}"/></span>
							</li>
						</c:forEach>
					</ul>
				</div>
			
		</div>
<!--:END:  CONTAINER DOS GRAFICOS OCORRENCIAS / ESTADO -->