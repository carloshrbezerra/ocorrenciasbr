<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
			
		
		<script type="text/javascript">	
		var geocoder;
		var map;
		var infowindow = new google.maps.InfoWindow();
		var marker;
		
		function initialize() {

		  geocoder = new google.maps.Geocoder();	
			
		  lat= ${lat};
		  lon= ${lon};
		  latlng =new google.maps.LatLng(lat, lon);
			
		  var mapOptions = {
		    zoom: 8,
		    center: latlng,
		    mapTypeId: 'roadmap'
		  }
		  map = new google.maps.Map(document.getElementById('map-canvas'), mapOptions);

		  geocoder.geocode({'latLng': latlng}, function(results, status) {
			    if (status == google.maps.GeocoderStatus.OK) {
			      if (results[1]) {
			        map.setZoom(11);
			        marker = new google.maps.Marker({
			            position: latlng,
			            map: map
			        });
			        infowindow.setContent(results[1].formatted_address);
			        infowindow.open(map, marker);
			      } else {
			        alert('No results found');
			      }
			    } else {
			      alert('Geocoder failed due to: ' + status);
			    }
			  });	

		  
		}

		google.maps.event.addDomListener(window, 'load', initialize);
		</script>	
			
		
			
   
		   	<div class="map-info">
		   	
		   		
		   		<ul id="rb-grid" class="rb-grid clearfix">
					
				
 					
 					<!--  TOTAL OCORRENCIAS COM PESSOAS SEM HABILITACAO -->
					<li class="icon-habilitacao">
						<h3>Sem Habilitação</h3>
						<span class="icon-habilitacao"></span>
						<span class="rb-temp">${listOcorrenciaCarroPessoaSemHabilitacao.size()}</span>
						<div class="rb-overlay">
							<span class="rb-close">close</span>
							<div class="rb-week">
								<div><span class="rb-city">Sem Habilitação</span><span class="icon-habilitacao"></span><span>${listOcorrenciaCarroPessoaSemHabilitacao.size()}</span></div>
								
								<c:forEach var="o" items="${listOcorrenciaCarroPessoaSemHabilitacao}">
						
								<div>
									<span><c:out value="${o.descricaoMes}" /></span>
									<span class="icon-clima-1"></span>
									<span><c:out value="${o.totalOcorrencia}" /></span>
								</div>
								
								</c:forEach>
								
								
							</div>
						</div>
					</li>
					<!--:END:  TOTAL OCORRENCIAS COM PESSOAS SEM HABILITACAO -->
					
					<!--  TOTAL OCORRENCIAS COM PESSOAS SEM CAPACETE -->
					<li class="icon-clima-1">
						<h3>Sem Capacete</h3>
						<span class="icon-capacete"></span>
						<span class="rb-temp">${listOcorrenciaSemCapacete.size()}</span>
						<div class="rb-overlay">
							<span class="rb-close">close</span>
							<div class="rb-week">
									
								<div><span class="rb-city">Sem Capacete</span><span class="icon-capacete"></span><span>${listOcorrenciaSemCapacete.size()}</span></div>
								
								<c:forEach var="o" items="${listOcorrenciaSemCapacete}">
						
								<div>
									<span><c:out value="${o.descricaoMes}" /></span>
									<span class="icon-clima-1"></span>
									<span><c:out value="${o.totalOcorrencia}" /></span>
								</div>
								
								</c:forEach>
						
							</div>
						</div>
					</li>
					<!-- ::END:: TOTAL OCORRENCIAS COM PESSOAS SEM CAPACETE -->
					
					
					<!--  TOTAL OCORRENCIAS COM PESSOAS SEM CINTO -->
					<li class="icon-clima-1">
						<h3>Sem Cinto</h3>
						<span class="icon-cinto"></span>
						<span class="rb-temp">${listOcorrenciaSemCinto.size()}</span>
						<div class="rb-overlay">
							
							<span class="rb-close">close</span>
							<div class="rb-week">
								<div><span class="rb-city">Sem Cinto</span><span class="icon-cinto"></span><span>${listOcorrenciaSemCinto.size()}</span></div>
								
								<c:forEach var="o" items="${listOcorrenciaSemCinto}">
						
								<div>
									<span><c:out value="${o.descricaoMes}" /></span>
									<span class="icon-clima-1"></span>
									<span><c:out value="${o.totalOcorrencia}" /></span>
								</div>
								
								</c:forEach>
							</div>
						</div>
					</li>
					<!--:END:  TOTAL OCORRENCIAS COM PESSOAS SEM CINTO -->
					
					
					<!--  TOTAL OCORRENCIAS COM PESSOAS ALCOOLIZADAS  -->
					<li class="icon-clima-2">
						<h3>Alcoolizados</h3>
						<span class="icon-alcool"></span>
						<span class="rb-temp">${listOcorrenciaAlcool.size()}</span>
						<div class="rb-overlay">
							<span class="rb-close">close</span>
							<div class="rb-week">
								<div><span class="rb-city">Alcoolizados</span><span class="icon-alcool"></span></span><span>${listOcorrenciaAlcool.size()}</span></div>
								
								<c:forEach var="o" items="${listOcorrenciaAlcool}">
						
								<div>
									<span><c:out value="${o.descricaoMes}" /></span>
									<span class="icon-clima-1"></span>
									<span><c:out value="${o.totalOcorrencia}" /></span>
								</div>
								
								</c:forEach>
							</div>
						</div>
					</li>
					<!--:END:  TOTAL OCORRENCIAS COM PESSOAS ALCOOLIZADAS  -->
					
					
					<!--  TOTAL OCORRENCIAS POR TIPO VEICULO/CARRO -->
					<li class="icon-clima-11">
						<h3>Carros</h3>
						<span class="icon-carro"></span>
						<span class="rb-temp">${listOcorrenciaCarro.size()}</span>
						<div class="rb-overlay">
							<span class="rb-close">close</span>
							<div class="rb-week">
								<div><span class="rb-city">Carros</span><span class="icon-carro"></span><span>${listOcorrenciaCarro.size()}</span></div>
								
								<c:forEach var="o" items="${listOcorrenciaCarro}">
						
								<div>
									<span><c:out value="${o.descricaoMes}" /></span>
									<span class="icon-clima-1"></span>
									<span><c:out value="${o.totalOcorrencia}" /></span>
								</div>
								
								</c:forEach>
							</div>
						</div>
					</li>
					<!--:END:  TOTAL OCORRENCIAS POR TIPO VEICULO/CARRO -->
					
					
					
					<!--  TOTAL OCORRENCIAS POR TIPO VEICULO/MOTO -->
					<li class="icon-clima-2 rb-span-2">
						<h3>Moto</h3>
						<span class="icon-moto"></span>
						<span class="rb-temp">${listOcorrenciaMoto.size()}</span>
						<div class="rb-overlay">
							<span class="rb-close">close</span>
							<div class="rb-week">
								<div><span class="rb-city">Moto</span><span class="icon-moto"></span><span>${listOcorrenciaMoto.size()}</span></div>
								<c:forEach var="o" items="${listOcorrenciaMoto}">
						
								<div>
									<span><c:out value="${o.descricaoMes}" /></span>
									<span class="icon-clima-1"></span>
									<span><c:out value="${o.totalOcorrencia}" /></span>
								</div>
								
								</c:forEach>
							</div>
						</div>
					</li>
					<!-- :END: TOTAL OCORRENCIAS POR TIPO VEICULO/MOTO -->
					
					
					
					<!--  TOTAL OCORRENCIAS POR PESSOA SEXO MASCULINO -->
					<li class="icon-clima-2">
						<h3>Homens</h3>
						<span class="icon-homem"></span>
						<span class="rb-temp">${listOcorrenciaSexoMasculino.size()}</span>
						<div class="rb-overlay">
							<span class="rb-close">close</span>
							<div class="rb-week">
								<div><span class="rb-city">Homens</span><span class="icon-homem"></span><span>${listOcorrenciaSexoMasculino.size()}</span></div>
								<c:forEach var="o" items="${listOcorrenciaSexoMasculino}">
						
								<div>
									<span><c:out value="${o.descricaoMes}" /></span>
									<span class="icon-clima-1"></span>
									<span><c:out value="${o.totalOcorrencia}" /></span>
								</div>
								
								</c:forEach>
								
							</div>
						</div>
					</li>
					<!--:END:  TOTAL OCORRENCIAS POR PESSOA SEXO MASCULINO -->
					
					
					
					
					<!--  TOTAL OCORRENCIAS POR PESSOA SEXO FEMININO -->
					<li class="icon-clima-4 rb-span-4">
						<h3>Mulheres</h3>
						<span class="icon-mulher"></span>
						<span class="rb-temp">${listOcorrenciaSexoFeminio.size()}</span>
						<div class="rb-overlay">
							<span class="rb-close">close</span>
							<div class="rb-week">
								<div><span class="rb-city">Mulheres</span><span class="icon-mulher"></span><span>${listOcorrenciaSexoFeminio.size()}</span></div>
								<c:forEach var="o" items="${listOcorrenciaSexoFeminio}">
						
								<div>
									<span><c:out value="${o.descricaoMes}" /></span>
									<span class="icon-clima-1"></span>
									<span><c:out value="${o.totalOcorrencia}" /></span>
								</div>
								
								</c:forEach>
							</div>
						</div>
					</li>
					<!--:END:  TOTAL OCORRENCIAS POR PESSOA SEXO FEMININO -->
		
					
					
				</ul>
		   		
		   				
		   	</div>
		    
		   
		   
		    <div id="map-canvas">
		    	<!-- <img src="http://maps.googleapis.com/maps/api/staticmap?center=${lat},${lon}&zoom=14&size=400x300&sensor=false" /> -->
		    </div>
    
