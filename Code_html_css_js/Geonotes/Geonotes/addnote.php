<!DOCTYPE html>
    <html>
	    <head>
		    <title>Géo notes</title>
		    <!-- Feuilles de style Bootstrap et personnalisé -->
		    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
		    <link href="css/stylesheet.css" rel="stylesheet" media="screen" >
   		    <link href="css/on_off.css" rel="stylesheet" media="screen" >
		    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	    </head>
	    <body onload="initialize()">
			</br>
			</br>
			<div id =container class="container">
			    <h1>Ajouter note</h1>			
			    </br>
				<form id="note" class="navbar-form pull-left" method="get">
				    <div class="control-group">
					    <label class="control-label" for="inputNote">Titre</label>
					    <div class="controls">
					    	<input type="text" id="inputNote" placeholder="Note" value="">
					    </div>
					</div>
					
					<div class="control-group">
					    <label class="control-label" for="inputDescription">Descriptif</label>
					    <div class="controls">
						    <textarea name="comments" cols="25" rows="5" id="inputDescription" placeholder="Texte.." ></textarea>
					    </div>
					</div>
					
					<div>
					Géolocalisation : 
				    	<p class="field switch"> 				    	
							<input type="radio" id="radio1" name="field"  checked />
						    <input type="radio" id="radio2" name="field" />
						    <label for="radio1" class="cb-enable selected"><span>oui</span></label>
						    <label for="radio2" class="cb-disable"><span>non</span></label>
						</p></br></br>
				    </div>  
				    <div class="control-group">
						<div class="controls">
						    <button id="add" type="submit" class="btn" onclick="saveNote()">Enregistrer</button>
					    </div>
				    </div>				    
			    </form>
			    <div id="map">
		            <p>Veuillez patienter pendant le chargement de la carte...</p>
	            </div>
			</div>
			
			
			<!-- include bibliothèque javascript-->	
		    <script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false&language=fr"></script>			
			<script src="js/jquery-latest.js"></script>
		    <script src="js/bootstrap.min.js"></script>
		    <script src="js/functions.js"></script>		    
		    <script type="text/javascript" src="js/on_off.js"></script>
		    <script type="text/javascript" src="js/addNote.js"></script>
		    
			<!-- include barre de navigation -->
		    <?php include("php/upbarconnected.php");?>


			
			
			<!--
			<script> 
			$(document).ready(function() {
			    $('#note').on('submit', function() {
			 
			        var note = $('#inputNote').val();
			        var description = $('#inputDescription').val();	
			        var location;
			   
			   
			        if (navigator.geolocation)
		       		var watchId = navigator.geolocation.getCurrentPosition(successCallback,
				                            null,
				                            {enableHighAccuracy:true});
				   else
					  alert("Votre navigateur ne prend pas en compte la géolocalisation HTML5");    
					 
					function successCallback(position){
					  latitude = position.coords.latitude;
					  longitude = position.coords.longitude;
					  location = latitude+","+longitude; 
					  alert(location);
					  if(note == '' || description == '') {
			            alert('Les champs doivent êtres remplis');
			        } else {
			            $.ajax({
                            url: 'php/add.php',
                            type: 'POST',
                            data: 'inputNote='+note+'&inputDescription='+description+'&geolocation='+location,
                            dataType: 'json',
                            success: function(json) {
                                if(json.reponse == 'ok') {
                                    alert('Tout est bon');
                                } else {
                                    alert('Erreur : '+ json.reponse);
                                }
                            }
                        });
			        }
			        return false;
					}					
			    });
			});
			</script>
			-->
	    </body>
    </html>