<!DOCTYPE html>
    <html>
	    <head>
		    <title>Géo notes</title>
		    <!-- Feuilles de style Bootstrap et personnalisé -->
		    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
		    <link href="css/stylesheet.css" rel="stylesheet" media="screen" >
		    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	    </head>
	    <body onload="initialize()">
			</br>
			</br>
			<div class="container">
			    <h1>Création de parcours</h1>    
			    
			    <div id="container" >
				    <form name="MyForm"  method="GET">			    
				    	<div id="element">
				    	Le point A représente votre position actuelle
				    	</br>
				    	</br>											
						</div>										
					</form>
					<div id="map">
			            <p>Veuillez patienter pendant le chargement de la carte...</p>
		            </div>
		            </br><input type="button" value="Créer parcours" class="btn" onclick="javascript:CreerParcours()"><br>	
				</div>	
			</div>
				
				<!-- include bibliothèque javascript-->	
    		    <script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false&language=fr"></script>
			    <script type="text/javascript" src="js/functions.js"></script>
			    <script src="js/jquery-latest.js"></script>
			    <script src="js/bootstrap.min.js"></script>	
			    
				<!-- include barre de navigation -->			    
			    <?php include("php/upbarconnected.php");?>
			    
			    
			    <!-- script qui crée des notes en LocalStorage puis les lit afin de les afficher dans des checkbox -->
			    <script>
			    for (j=0 ; j<10 ; j++)
			    {
				    localStorage.setItem('Note '+j , 'pos '+j);
			    }
			    /*
			    for(i=0;i<10;i++){
				 	//$('#element').append('<input type="checkbox" name="nom" value="46.044634,4.889008" /> Note '+(i+1)+'</br>');
				 	$('#element').append('<input type="checkbox" name="Note'+i+'" value="46.044634,4.889008" /> '+localStorage.getItem("Note "+i)+'</br>');

				 }*/
			    
         		var myCollection = { "Notes":[
				{'ID': 1, 'Titre':'Chad', 'Descriptif':'Campbell', 'position':'48.044634,4.854008'},
				{'ID': 2, 'Titre':'John', 'Desctriptif':'Smith', 'position':'46.044634,4.889008'},
				{'ID': 3, 'Titre':'def', 'Desctriptif':'gou', 'position':'46.044634,4.300855'}]
				};				
				localStorage.setItem('collectionKey', JSON.stringify(myCollection));
				
				
				var savedString = localStorage.getItem('collectionKey');
				var savedCollection = JSON.parse(savedString);
				
				for (a=0 ; a<3 ; a++)
				{
					var debut = savedString.indexOf("position")+11;
					var fin = savedString.indexOf("}")-1;
					var bufferString = savedString.substring(debut,fin);
					savedString = savedString.substring(fin+2);
					$('#element').append('<input type="checkbox" name="Note'+a+'" value="'+bufferString+'" /> Note '+(a+1)+' </br>');
				}
				//while((savedString.indexOf("position"))!=-1);							    
				 </script>
	    </body>
    </html>