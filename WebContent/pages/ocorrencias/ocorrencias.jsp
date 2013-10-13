<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
    

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<div class="section">

	 <h4>Total Ocorrencias X Estado</h4>
	
	<ul class="timeline">
		<c:forEach var="o" items="${listOcorrenciaTotalEstado}">
	     <li>
	        <a href="estadoOcorrencias.do?estado=${o.estado}" title="${o.totalOcorrencia}">
	          <span class="label"><c:out value="${o.estado}" /></span>
	          <span class="count" style="height: ${((o.totalOcorrencia / 150)  >= 100) ? 100 : o.totalOcorrencia / 150}%"><c:out value="${o.totalOcorrencia}" /></span>
	        </a>
	      </li>
	      
		</c:forEach>
	</ul>
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