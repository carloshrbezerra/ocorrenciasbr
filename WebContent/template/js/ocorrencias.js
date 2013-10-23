	var geocoder;
	var map;
	var infowindow = new google.maps.InfoWindow();
	var marker;

	function getLocation(){
	  if (navigator.geolocation)
	    {
	    navigator.geolocation.getCurrentPosition(initialize,showError);
	    }
	  else{x.innerHTML="Geolocaliza��o n�o � suportada nesse browser.";}
	 }

	function showError(error){
	  switch(error.code)
	    {
	    case error.PERMISSION_DENIED:
	      x.innerHTML="Usu�rio rejeitou a solicita��o de Geolocaliza��o."
	      break;
	    case error.POSITION_UNAVAILABLE:
	      x.innerHTML="Localiza��o indispon�vel."
	      break;
	    case error.TIMEOUT:
	      x.innerHTML="O tempo da requisi��o expirou."
	      break;
	    case error.UNKNOWN_ERROR:
	      x.innerHTML="Algum erro desconhecido aconteceu."
	      break;
	    }
	 }
	
	function initialize(position) {

	  geocoder = new google.maps.Geocoder();	
		
	  lat=position.coords.latitude;
	  lon=position.coords.longitude;
	  latlng =new google.maps.LatLng(lat, lon);
		
	  geocoder.geocode({'latLng': latlng}, function(results, status) {
		    if (status == google.maps.GeocoderStatus.OK) {
		      if (results[1]) {
		        document.location = "maps.do?lat="+lat+"&lon="+lon+"&estado="+removerAcentos(results[1].formatted_address).split(",",1);
		      } else {
		        alert('No results found');
		      }
		    } else {
		      alert('Geocoder failed due to: ' + status);
		    }
		  });	

	  
	}


	function removerAcentos( newStringComAcento ) {
		  var string = newStringComAcento;
			var mapaAcentosHex 	= {
				a : /[\xE0-\xE6]/g,
				e : /[\xE8-\xEB]/g,
				i : /[\xEC-\xEF]/g,
				o : /[\xF2-\xF6]/g,
				u : /[\xF9-\xFC]/g,
				c : /\xE7/g,
				n : /\xF1/g
			};
		 
			for ( var letra in mapaAcentosHex ) {
				var expressaoRegular = mapaAcentosHex[letra];
				string = string.replace( expressaoRegular, letra );
			}

			return string.replace(" ", "").toLowerCase();
			
		}


		function scrollBar(){
			$('html, body').animate({  
		    	scrollTop: 0  
			}, 1000);
		}