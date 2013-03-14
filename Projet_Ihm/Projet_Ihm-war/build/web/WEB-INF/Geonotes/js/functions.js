var map;
var panel;
var initialize;
var calculate;
var direction;
var pos;

initialize = function(){
	
  var latLng = new google.maps.LatLng(45.452592,4.387766); // correspond aux coordonnées de Télécom Saint Etienne
  var myOptions = {
    zoom      : 19, // Zoom par défaut
    center    : latLng, // Coordonnées de départ de la carte de type latLng 
    mapTypeId : google.maps.MapTypeId.ROADMAP, // Type de carte, différentes valeurs possible HYBRID, ROADMAP, SATELLITE, TERRAIN
    maxZoom   : 20
  };
  
  map      = new google.maps.Map(document.getElementById('map'), myOptions);
  panel    = document.getElementById('panel');
  
  /*var marker = new google.maps.Marker({
    position : latLng,
    map      : map,
  });
  
  
  var contentMarker = [
      '<div id="containerTabs">',
      '<div id="tabs">',
      '<ul>',
        '<li><a href="#tab-1"><span>Lorem</span></a></li>',
        '<li><a href="#tab-2"><span>Ipsum</span></a></li>',
        '<li><a href="#tab-3"><span>Dolor</span></a></li>',
      '</ul>',
      '<div id="tab-1">',
        '<h3>Lille</h3><p>Suspendisse quis magna dapibus orci porta varius sed sit amet purus. Ut eu justo dictum elit malesuada facilisis. Proin ipsum ligula, feugiat sed faucibus a, <a href="http://www.google.fr">google</a> sit amet mauris. In sit amet nisi mauris. Aliquam vestibulum quam et ligula pretium suscipit ullamcorper metus accumsan.</p>',
      '</div>',
      '<div id="tab-2">',
       '<h3>Aliquam vestibulum</h3><p>Aliquam vestibulum quam et ligula pretium suscipit ullamcorper metus accumsan.</p>',
      '</div>',
      '<div id="tab-3">',
        '<h3>Pretium suscipit</h3><ul><li>Lorem</li><li>Ipsum</li><li>Dolor</li><li>Amectus</li></ul>',
      '</div>',
      '</div>',
      '</div>'
  ].join('');

  var infoWindow = new google.maps.InfoWindow({
    content  : contentMarker,
    position : latLng
  });
  
  google.maps.event.addListener(marker, 'click', function() {
    infoWindow.open(map,marker);
  });
  
  google.maps.event.addListener(infoWindow, 'domready', function(){ // infoWindow est biensûr notre info-bulle
    jQuery("#tabs").tabs();
  });
  */
  
  
  direction = new google.maps.DirectionsRenderer({
    map   : map,
    panel : panel // Dom element pour afficher les instructions d'itinéraire
  });
  
  if (navigator.geolocation)
	       		var watchId = navigator.geolocation.getCurrentPosition(successCallback,
			                            null,
			                            {enableHighAccuracy:true});
		   else
			  alert("Votre navigateur ne prend pas en compte la géolocalisation HTML5");    
			 
			function successCallback(position){
			  map.panTo(new google.maps.LatLng(position.coords.latitude, position.coords.longitude));
			  marker = new google.maps.Marker({
			  position: new google.maps.LatLng(position.coords.latitude, position.coords.longitude), 
			  map: map
		      });
   			  pos = position.coords.latitude+","+ position.coords.longitude;
		    }

};

calculate = function(){
	//origin      = document.getElementById('origin').value; // Le point départ
    //destination = document.getElementById('destination').value; // Le point d'arrivée
    origin = null;
    destination = null;
	var waypoints = [];
	var markers = [];
	
	var mode;
    switch (document.getElementById("mode").value) {
      case "bicycling":
        mode = google.maps.DirectionsTravelMode.BICYCLING;
        break;
      case "driving":
        mode = google.maps.DirectionsTravelMode.DRIVING;
        break;
      case "walking":
        mode = google.maps.DirectionsTravelMode.WALKING;
        break;
    }
	  
	    if(document.getElementById('parcours').value =='Parcours1')
	    {
		    origin      = "rive de gier"; // Le point départ
		    destination = "saint etienne"; // Le point d'arrivée
		    waypoints.push({ location: "saint chamond", stopover: true });
	    }
	    else if(document.getElementById('parcours').value=="Parcours2")
	    {
		    origin      = "rive de gier"; // Le point départ
		    destination = "lyon"; // Le point d'arrivée
	    }
	    else if(document.getElementById('parcours').value=="Parcours3")
	    {
		    origin      = "lyon"; // Le point départ
		    destination = "saint etienne"; // Le point d'arrivée
	    }
	    else if(document.getElementById('parcours').value=="Parcours4")
	    {
		    //origin      = "marseille"; // Le point départ
		    //destination = "saint etienne"; // Le point d'arrivée
		    origin      = "45.044634,3.889008"; // Le point départ
		    destination = "45.533362,4.631071"; // Le point d'arrivée
	    }
	    
        if(origin && destination){
        
         var request = {
	        origin: origin,
	        destination: destination,
	        waypoints: waypoints,
	        travelMode: mode
	    };
	    
        var directionsService = new google.maps.DirectionsService(); // Service de calcul d'itinéraire
        directionsService.route(request, function(response, status){ // Envoie de la requête pour calculer le parcours
            if(status == google.maps.DirectionsStatus.OK){
                direction.setDirections(response); // Trace l'itinéraire sur la carte et les différentes étapes du parcours
            }
        });
    }
};

CreerParcours = function(){

	origin = null;
    destination = null;
	var waypoints = [];
	var markers = [];
	var elLength = document.MyForm.elements.length;
	var check = [];


    for (i=0; i<elLength; i++)
    {
        var type = MyForm.elements[i].type;        
        if (type == "checkbox" && MyForm.elements[i].checked){
        	check.push(MyForm.elements[i].value);       	
        }
    }	
    
    for (j=0; j<check.length ; j++)
        {
        	origin=pos;
        	if(j == 0 && origin == null) {origin = check[j];}
        	else if(destination == null){destination = check[j];}
        	else {
	        	waypoints.push({ location: destination, stopover: true });
	        	destination = check[j];
        	}         
        }

    if(origin && destination){
    
	    var request = {
		        origin: origin,
		        destination: destination,
		        waypoints: waypoints,
		        travelMode: google.maps.DirectionsTravelMode.WALKING
		        };
		        
		var directionsService = new google.maps.DirectionsService(); // Service de calcul d'itinéraire
	        directionsService.route(request, function(response, status){ // Envoie de la requête pour calculer le parcours
	            if(status == google.maps.DirectionsStatus.OK){
	                direction.setDirections(response); // Trace l'itinéraire sur la carte et les différentes étapes du parcours
	            }
	        });
        }   
};
saveNote = function(){
	var myCollection = { "Notes":[
	{'ID': 1, 'Titre':'Chad', 'Descriptif':'Campbell', 'position':'48.044634,4.854008'},
	{'ID': 2, 'Titre':'John', 'Desctriptif':'Smith', 'position':'46.044634,4.889008'},
	{'ID': 3, 'Titre':'def', 'Desctriptif':'gou', 'position':'46.044634,4.300855'}]
	};				
	localStorage.setItem('collectionKey', JSON.stringify(myCollection));	
	
	var savedString = localStorage.getItem('collectionKey');

};

initialize();

