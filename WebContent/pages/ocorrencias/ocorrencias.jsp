<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!--  CONTAINER DOS GRAFICOS OCORRENCIAS / ESTADO -->
		<div class="container container-ocorrencias">	
			
	
				<div class="section">
	
				
					<ul class="timeline">
						<c:forEach var="o" items="${listOcorrenciaTotalEstado}">
							<li>
								<span class="name"><c:out value="${o.estado}" /></span>
								<a data-toggle="modal" href="estado.do?tipo=estado&estado=${o.estado}&ano=${ano}"
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