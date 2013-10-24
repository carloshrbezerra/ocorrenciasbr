<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<header>
	<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="logo">
			<a href=""> <img class="img-responsive" src="template/images/logo2.png">
			</a>
		</div>
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
				<span class="sr-only">Ocorrências</span> <span class="icon-bar"></span>
				<span class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
			<!-- 				<a class="navbar-brand" href="#">Brand</a> -->
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse navbar-ex1-collapse">
			
			<ul class="nav navbar-nav navbar-right">
				
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Estatísticas<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="ocorrencias.do?ano=2007">2007</a></li>
						<li><a href="ocorrencias.do?ano=2008">2008</a></li>
						<li><a href="ocorrencias.do?ano=2009">2009</a></li>
						<li><a href="ocorrencias.do?ano=2010">2010</a></li>
						<li><a href="ocorrencias.do?ano=2011">2011</a></li>
						<li><a href="ocorrencias.do?ano=2012">2012</a></li>
						<li><a href="ocorrencias.do?ano=2013">2013</a></li>
					</ul>
				</li>
			
				
				<li><a href="#">Curiosidades</a></li>
				<li><a href="javascript:getLocation()" rel="modal">Minha Localização</a></li>
			</ul>
			
			
			
		</div>
		
		
		<!-- /.navbar-collapse -->
		
		<%if(request.getAttribute("page") != null){%>
		<hr />
		<div class="title-geral"><h4>${title}</h4></div>
		<%}%>
		
	</nav>
	
	
		<%if(request.getAttribute("page") == null){%>
				<div id="logo">
					<img src="template/images/background.jpg" class="img-responsive"/>			
				</div>
		<%}%>

	
</header>