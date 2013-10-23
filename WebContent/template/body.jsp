<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!--  CONTAINER BOX(GRAFICOS, INSTRUÇÕES, MAPA) PRINCIPAIS -->
<div class="container container-box">
				<div class="row ">
					<div class="box-link-text">
						
						<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
						<div class="box-gold box1 box-geral">
							<a href="#graficos" onclick="scrollBar()">
								<div class="img-box">
								<img class="img-responsive imgpos" height="120px" width="120px" src="template/images/chart.png">
								</div>
								
								<div class="title-box">
									<h4>Estatísticas</h4>
									<p>Veja as estatísticas do trânsito nas BRs.</p>
								</div>
							</a>
						</div>
						</div>
						
						
						<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
						<div class="box-gold box2 box-geral">
							<a href="ocorrencias.do">
								
								<div class="img-box">
								<img class="img-responsive imgpos" height="120px" width="120px" src="template/images/info.png">
								</div>
								
								<div class="title-box">
									<h4>Curiosidades</h4>
									<p>Veja as curiosidades.</p>
								</div>
							</a>
						</div>
						</div>
						<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
						<div class="box-gold box3 box-geral">
							<a href="javascript:getLocation()"> 
							
								<div class="img-box">
								<img class="img-responsive imgpos"height="120px" width="120px" src="template/images/localizacao.png">
								</div>
								
								
								<div class="title-box">
									<h4>Minha Localização</h4>
									<p>Como esta o trânsito perto de você</p>
								</div>
							</a>
						</div>
						</div>
					</div>
				</div>
</div>
<!--:END:  CONTAINER BOX PRINCIPAIS -->



<!--  CONTAINER DOS GRAFICOS OCORRENCIAS / ESTADO -->
		<div id="graficos" class="panel">
			
	
				<div class="section">
	
					<h3 class="title-chart-principal">Total de Ocorrências por estados</h3>
					<br />
					<br />
					
					
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


