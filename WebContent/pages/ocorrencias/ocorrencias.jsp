<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
    

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ocorrencias</title>

<link rel=stylesheet type="text/css" href="css/styles_charts.css">


<script src="js/amcharts/amcharts.js" type="text/javascript"></script>
<script src="js/amcharts/serial.js" type="text/javascript"></script>

  <script type="text/javascript">
            var chart;
            var chartData = [
                {
                    "year": 2009,
                    "income": 23.5,
                    "expenses": 18.1
                },
                {
                    "year": 2010,
                    "income": 26.2,
                    "expenses": 22.8
                },
                {
                    "year": 2011,
                    "income": 30.1,
                    "expenses": 23.9
                },
                {
                    "year": 2012,
                    "income": 29.5,
                    "expenses": 25.1
                },
                {
                    "year": 2013,
                    "income": 30.6,
                    "expenses": 27.2,
                    "dashLengthLine": 5
                },
                {
                    "year": 2014,
                    "income": 34.1,
                    "expenses": 29.9,
                    "dashLengthColumn": 5,
                    "alpha":0.2,
                    "additional":"(projection)"
                }
                
            ];


            AmCharts.ready(function () {
                // SERIAL CHART  
                chart = new AmCharts.AmSerialChart();
                chart.pathToImages = "../amcharts/images/";
                chart.dataProvider = chartData;
                chart.categoryField = "year";
                chart.startDuration = 1;
                
                chart.handDrawn = true;
                chart.handDrawnScatter = 3;

                // AXES
                // category
                var categoryAxis = chart.categoryAxis;
                categoryAxis.gridPosition = "start";

                // value
                var valueAxis = new AmCharts.ValueAxis();
                valueAxis.axisAlpha = 0;
                chart.addValueAxis(valueAxis);

                // GRAPHS
                // column graph
                var graph1 = new AmCharts.AmGraph();
                graph1.type = "column";
                graph1.title = "Income";
                graph1.lineColor = "#a668d5";
                graph1.valueField = "income";
                graph1.lineAlpha = 1;
                graph1.fillAlphas = 1;
                graph1.dashLengthField = "dashLengthColumn";
                graph1.alphaField = "alpha";
                graph1.balloonText = "<span style='font-size:13px;'>[[title]] in [[category]]:<b>[[value]]</b> [[additional]]</span>";
                chart.addGraph(graph1);

                // line
                var graph2 = new AmCharts.AmGraph();
                graph2.type = "line";
                graph2.title = "Expenses";
                graph2.lineColor = "#fcd202";
                graph2.valueField = "expenses";
                graph2.lineThickness = 3;
                graph2.bullet = "round";
                graph2.bulletBorderThickness = 3;
                graph2.bulletBorderColor = "#fcd202";
                graph2.bulletBorderAlpha = 1;
                graph2.bulletColor = "#ffffff";
                graph2.dashLengthField = "dashLengthLine";
                graph2.balloonText = "<span style='font-size:13px;'>[[title]] in [[category]]:<b>[[value]]</b> [[additional]]</span>";
                chart.addGraph(graph2);

                // LEGEND                
                var legend = new AmCharts.AmLegend();
                legend.useGraphSettings = true;
                chart.addLegend(legend);

                // WRITE
                chart.write("chartdiv");
            });
        </script>    



</head>
<body>

<br /><br /><br /><br /><br /><br />

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

<br /><br /><br /><br /><br /><br />


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

<br /><br />
<br /><br />

<div class="section">
	<h4 style="width: 500px; margin:0px auto">Total Ocorrencias X Pessoas Sem Cinto</h4>

	<div id="chartdiv" style="width: 500px; height: 600px; margin:0px auto"></div>
	
</div>

</body>
</html>