    <!DOCTYPE html>
    <html>
	    <head>
		    <title>Géo notes</title>
		    <!-- Bootstrap -->
		    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
		    <link href="css/stylesheet.css" rel="stylesheet" media="screen" >
		    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	    </head>
	    <body>
	    	</br>
			</br>			
				<div class ="container">
				    <h1>Profil </h1>				    
				    
				    <form class="navbar-form pull-left">
				    <div class="control-group">
					    <label class="control-label" for="profilName">Nom</label>
					    <div class="controls">
					    	<input type="text" id="profilName" placeholder="Nom">
					    </div>
					</div>
					
					<div class="control-group">
					    <label class="control-label" for="profilSurname">Prénom</label>
					    <div class="controls">
					    	<input type="text" id="profilSurname" placeholder="Prénom">
					    </div>
					</div>
					
					<div class="control-group">
					    <label class="control-label" for="profilEmail">Email</label>
					    <div class="controls">
					    	<input type="email" id="profilEmail" placeholder="utilisateur@exemple.com">
					    </div>
					</div>
					
				    <div class="control-group">
					    <label class="control-label" for="profilOldPassword">Ancien mot de passe</label>
					    <div class="controls">
					    	<input type="password" id="profilOldPassword" placeholder="Password">
					    </div>
				    </div>
				    
				    <div class="control-group">
					    <label class="control-label" for="profilPassword1">Nouveau mot de passe</label>
					    <div class="controls">
					    	<input type="password" id="profilPassword1" placeholder="Password">
					    </div>
				    </div>
				    
				    <div class="control-group">
					    <label class="control-label" for="profilPassword2">Confirmation mot de passe</label>
					    <div class="controls">
					    	<input type="password" id="profilPassword2" placeholder="Password">
					    </div>
				    </div>
			
				    <div class="control-group">
						<div class="controls">
						    <button type="bouton" class="btn" onclick="saveData()">Enregistrer</button>
					    </div>
				    </div>
			    </form>
			    
			    <!-- include bibliothèque javascript-->	
			    <script src="http://code.jquery.com/jquery-latest.js"></script>
			    <script src="js/bootstrap.min.js"></script>
				<script type="text/javascript" src="js/profil.js"></script>		
			    
				<!-- include barre de navigation -->			    
				<?php include("php/upbarconnected.php");?>

			
				
	    </body>
    </html>