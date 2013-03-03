function addNote()
{
	var titre;
	var description;
	var latitude;
	var longitude;
	
	if (radio1.checked)
	{
		  if (navigator.geolocation)
	       		var watchId = navigator.geolocation.getCurrentPosition(successCallback,
			                            null,
			                            {enableHighAccuracy:true});
		   else
			  alert("Votre navigateur ne prend pas en compte la géolocalisation HTML5");    
			 
			function successCallback(position){
			  latitude = position.coords.latitude;
			  longitude = position.coords.longitude;
			  localStorage.setItem('latitude', latitude);
			  localStorage.setItem('longitude', longitude);
			  localStorage.setItem('latlong', latitude+","+longitude);			  	  
		    }

	}
	else if (radio2.checked)
	{

	}
}

function addNote2()
{
	var latitude;
	var longitude;
	
	if (navigator.geolocation)
	       		var watchId = navigator.geolocation.getCurrentPosition(successCallback,
			                            null,
			                            {enableHighAccuracy:true});
		   else
			  alert("Votre navigateur ne prend pas en compte la géolocalisation HTML5");    
			 
			function successCallback(position){
			  latitude = position.coords.latitude;
			  longitude = position.coords.longitude;
			  localStorage.setItem('latitude', latitude);
			  localStorage.setItem('longitude', longitude);
			  localStorage.setItem('latlong', latitude+","+longitude);	  	  
		    }		    
}


//var email = localStorage.getItem('email');
//document.querySelector('#profilName').value = nom;	