<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<title>Ocorrencias BR</title>
	<meta charset="UTF-8">
	<meta name="description" content="">
	<meta name="viewport" content="width=device-width">

	<link rel="stylesheet" type="text/css" href="../../template/css/ocorrenciasbr.css">
	<link rel="stylesheet" type="text/css" href="../../template/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="../../template/css/styles_charts.css">
	<link rel="stylesheet" type="text/css" href="../../template/css/default.css" />
	<link rel="stylesheet" type="text/css" href="../../template/css/component.css" />
	<script src="../../template/js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>

	<script>window.jQuery || document.write('<script src="../../template/js/vendor/jquery-1.10.1.js"><\/script>')</script>
	<script src="../../template/js/vendor/bootstrap.min.js"></script>
</head>

<body>

	<header>
		<jsp:include page="../../template/header.jsp"></jsp:include>
	</header>

	<div id="background">

		<div class="container">	
			<div class="main">

				<ul id="rb-grid" class="rb-grid clearfix">
					<li class="icon-clima-1 rb-span-2">
						<h3>Lisbon</h3><span class="rb-temp">21�C</span>
						<div class="rb-overlay">
							<span class="rb-close">close</span>
							<div class="rb-week">
								<div><span class="rb-city">Lisbon</span><span class="icon-clima-1"></span><span>21�C</span></div>
								<div><span>Mon</span><span class="icon-clima-1"></span><span>19�C</span></div>
								<div><span>Tue</span><span class="icon-clima-2"></span><span>19�C</span></div>
								<div><span>Wed</span><span class="icon-clima-2"></span><span>18�C</span></div>
								<div><span>Thu</span><span class="icon-clima-2"></span><span>17�C</span></div>
								<div><span>Fri</span><span class="icon-clima-1"></span><span>19�C</span></div>
								<div><span>Sat</span><span class="icon-clima-1"></span><span>22�C</span></div>
								<div><span>Sun</span><span class="icon-clima-1"></span><span>18�C</span></div>
							</div>
						</div>
					</li>
					<li class="icon-clima-2">
						<h3>Paris</h3><span class="rb-temp">11�C</span>
						<div class="rb-overlay">
							<span class="rb-close">close</span>
							<div class="rb-week">
								<div><span class="rb-city">Paris</span><span class="icon-clima-2"></span><span>11�C</span></div>
								<div><span>Mon</span><span class="icon-clima-1"></span><span>12�C</span></div>
								<div><span>Tue</span><span class="icon-clima-4"></span><span>11�C</span></div>
								<div><span>Wed</span><span class="icon-clima-4"></span><span>10�C</span></div>
								<div><span>Thu</span><span class="icon-clima-4"></span><span>9�C</span></div>
								<div><span>Fri</span><span class="icon-clima-2"></span><span>10�C</span></div>
								<div><span>Sat</span><span class="icon-clima-2"></span><span>10�C</span></div>
								<div><span>Sun</span><span class="icon-clima-2"></span><span>12�C</span></div>
							</div>
						</div>
					</li>
					<li class="icon-clima-1">
						<h3>Belgrade</h3><span class="rb-temp">15�C</span>
						<div class="rb-overlay">
							<span class="rb-close">close</span>
							<div class="rb-week">
								<div><span class="rb-city">Belgrade</span><span class="icon-clima-1"></span><span>15�C</span></div>
								<div><span>Mon</span><span class="icon-clima-3"></span><span>16�C</span></div>
								<div><span>Tue</span><span class="icon-clima-3"></span><span>17�C</span></div>
								<div><span>Wed</span><span class="icon-clima-3"></span><span>15�C</span></div>
								<div><span>Thu</span><span class="icon-clima-4"></span><span>13�C</span></div>
								<div><span>Fri</span><span class="icon-clima-3"></span><span>10�C</span></div>
								<div><span>Sat</span><span class="icon-clima-1"></span><span>11�C</span></div>
								<div><span>Sun</span><span class="icon-clima-1"></span><span>12�C</span></div>
							</div>
						</div>
					</li>
					<li class="icon-clima-4">
						<h3>Moscow</h3><span class="rb-temp">2�C</span>
						<div class="rb-overlay">
							<span class="rb-close">close</span>
							<div class="rb-week">
								<div><span class="rb-city">Moscow</span><span class="icon-clima-4"></span><span>1�C</span></div>
								<div><span>Mon</span><span class="icon-clima-4"></span><span>-1�C</span></div>
								<div><span>Tue</span><span class="icon-clima-6"></span><span>-2�C</span></div>
								<div><span>Wed</span><span class="icon-clima-6"></span><span>-6�C</span></div>
								<div><span>Thu</span><span class="icon-clima-6"></span><span>-4�C</span></div>
								<div><span>Fri</span><span class="icon-clima-5"></span><span>-5�C</span></div>
								<div><span>Sat</span><span class="icon-clima-6"></span><span>-6�C</span></div>
								<div><span>Sun</span><span class="icon-clima-6"></span><span>-8�C</span></div>
							</div>
						</div>
					</li>
					<li class="icon-clima-1">
						<h3>New Delhi</h3><span class="rb-temp">17�C</span>
						<div class="rb-overlay">
							<span class="rb-close">close</span>
							<div class="rb-week">
								<div><span class="rb-city">New Delhi</span><span class="icon-clima-1"></span><span>17�C</span></div>
								<div><span>Mon</span><span class="icon-clima-1"></span><span>18�C</span></div>
								<div><span>Tue</span><span class="icon-clima-8"></span><span>19�C</span></div>
								<div><span>Wed</span><span class="icon-clima-8"></span><span>16�C</span></div>
								<div><span>Thu</span><span class="icon-clima-10"></span><span>17�C</span></div>
								<div><span>Fri</span><span class="icon-clima-10"></span><span>18�C</span></div>
								<div><span>Sat</span><span class="icon-clima-2"></span><span>17�C</span></div>
								<div><span>Sun</span><span class="icon-clima-1"></span><span>17�C</span></div>
							</div>
						</div>
					</li>
					<li class="icon-clima-1">
						<h3>Tel Aviv</h3><span class="rb-temp">23�C</span>
						<div class="rb-overlay">
							<span class="rb-close">close</span>
							<div class="rb-week">
								<div><span class="rb-city">Tel Aviv</span><span class="icon-clima-1"></span><span>22�C</span></div>
								<div><span>Mon</span><span class="icon-clima-1"></span><span>23�C</span></div>
								<div><span>Tue</span><span class="icon-clima-2"></span><span>22�C</span></div>
								<div><span>Wed</span><span class="icon-clima-2"></span><span>22�C</span></div>
								<div><span>Thu</span><span class="icon-clima-2"></span><span>21�C</span></div>
								<div><span>Fri</span><span class="icon-clima-1"></span><span>21�C</span></div>
								<div><span>Sat</span><span class="icon-clima-2"></span><span>21�C</span></div>
								<div><span>Sun</span><span class="icon-clima-2"></span><span>24�C</span></div>
							</div>
						</div>
					</li>
					<li class="icon-clima-2">
						<h3>Cairo</h3><span class="rb-temp">21�C</span>
						<div class="rb-overlay">
							<span class="rb-close">close</span>
							<div class="rb-week">
								<div><span class="rb-city">Cairo</span><span class="icon-clima-2"></span><span>21�C</span></div>
								<div><span>Mon</span><span class="icon-clima-1"></span><span>22�C</span></div>
								<div><span>Tue</span><span class="icon-clima-1"></span><span>20�C</span></div>
								<div><span>Wed</span><span class="icon-clima-1"></span><span>21�C</span></div>
								<div><span>Thu</span><span class="icon-clima-1"></span><span>21�C</span></div>
								<div><span>Fri</span><span class="icon-clima-2"></span><span>21�C</span></div>
								<div><span>Sat</span><span class="icon-clima-2"></span><span>22�C</span></div>
								<div><span>Sun</span><span class="icon-clima-2"></span><span>23�C</span></div>
							</div>
						</div>
					</li>
					<li class="icon-clima-11">
						<h3>New York</h3><span class="rb-temp">3�C</span>
						<div class="rb-overlay">
							<span class="rb-close">close</span>
							<div class="rb-week">
								<div><span class="rb-city">New York</span><span class="icon-clima-11"></span><span>3�C</span></div>
								<div><span>Mon</span><span class="icon-clima-11"></span><span>3�C</span></div>
								<div><span>Tue</span><span class="icon-clima-11"></span><span>-1�C</span></div>
								<div><span>Wed</span><span class="icon-clima-11"></span><span>-2�C</span></div>
								<div><span>Thu</span><span class="icon-clima-7"></span><span>1�C</span></div>
								<div><span>Fri</span><span class="icon-clima-7"></span><span>0�C</span></div>
								<div><span>Sat</span><span class="icon-clima-11"></span><span>2�C</span></div>
								<div><span>Sun</span><span class="icon-clima-11"></span><span>3�C</span></div>
							</div>
						</div>
					</li>
					<li class="icon-clima-2 rb-span-2">
						<h3>San Francisco</h3><span class="rb-temp">15�C</span>
						<div class="rb-overlay">
							<span class="rb-close">close</span>
							<div class="rb-week">
								<div><span class="rb-city">San Francisco</span><span class="icon-clima-2"></span><span>15�C</span></div>
								<div><span>Mon</span><span class="icon-clima-2"></span><span>16�C</span></div>
								<div><span>Tue</span><span class="icon-clima-2"></span><span>14�C</span></div>
								<div><span>Wed</span><span class="icon-clima-2"></span><span>13�C</span></div>
								<div><span>Thu</span><span class="icon-clima-2"></span><span>15�C</span></div>
								<div><span>Fri</span><span class="icon-clima-2"></span><span>15�C</span></div>
								<div><span>Sat</span><span class="icon-clima-1"></span><span>16�C</span></div>
								<div><span>Sun</span><span class="icon-clima-1"></span><span>15�C</span></div>
							</div>
						</div>
					</li>
					<li class="icon-clima-2">
						<h3>Tokyo</h3><span class="rb-temp">8�C</span>
						<div class="rb-overlay">
							<span class="rb-close">close</span>
							<div class="rb-week">
								<div><span class="rb-city">Tokyo</span><span class="icon-clima-2"></span><span>8�C</span></div>
								<div><span>Mon</span><span class="icon-clima-1"></span><span>7�C</span></div>
								<div><span>Tue</span><span class="icon-clima-2"></span><span>6�C</span></div>
								<div><span>Wed</span><span class="icon-clima-1"></span><span>8�C</span></div>
								<div><span>Thu</span><span class="icon-clima-1"></span><span>8�C</span></div>
								<div><span>Fri</span><span class="icon-clima-2"></span><span>6�C</span></div>
								<div><span>Sat</span><span class="icon-clima-2"></span><span>5�C</span></div>
								<div><span>Sun</span><span class="icon-clima-2"></span><span>5�C</span></div>
							</div>
						</div>
					</li>
					<li class="icon-clima-4 rb-span-4">
						<h3>Sydney</h3><span class="rb-temp">25�C</span>
						<div class="rb-overlay">
							<span class="rb-close">close</span>
							<div class="rb-week">
								<div><span class="rb-city">Sydney</span><span class="icon-clima-4"></span><span>28�C</span></div>
								<div><span>Mon</span><span class="icon-clima-4"></span><span>24�C</span></div>
								<div><span>Tue</span><span class="icon-clima-4"></span><span>26�C</span></div>
								<div><span>Wed</span><span class="icon-clima-2"></span><span>27�C</span></div>
								<div><span>Thu</span><span class="icon-clima-2"></span><span>30�C</span></div>
								<div><span>Fri</span><span class="icon-clima-8"></span><span>31�C</span></div>
								<div><span>Sat</span><span class="icon-clima-8"></span><span>29�C</span></div>
								<div><span>Sun</span><span class="icon-clima-8"></span><span>29�C</span></div>
							</div>
						</div>
					</li>
				</ul>
				
			</div>
		</div><!-- /container -->
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
		<script src="js/jquery.fittext.js"></script>
		<script src="js/boxgrid.js"></script>
		<script>
			$(function() {

				Boxgrid.init();
				

			});
		</script>

	</div><!-- background -->
	<footer>
		<jsp:include page="../../template/footer.jsp"></jsp:include>
	</footer>


</body>
</html>