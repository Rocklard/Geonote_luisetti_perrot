<!DOCTYPE html>
    <html>
	    <head>
		    <title>Géo notes</title>
		    <!-- Feuilles de style Bootstrap et personnalisé -->
		    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
		    <link href="css/stylesheet.css" rel="stylesheet" media="screen" >
		    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	    </head>
	    <body>
			</br>
			</br>
			<div class="container">
			    <h1>Inscription</h1>		
				<!-- register -->
				<form class="navbar-form pull-left">
				    <div class="control-group">
					    <label class="control-label" for="inputName">Nom</label>
					    <div class="controls">
					    	<input type="text" id="inputName" placeholder="Nom" required>
					    </div>
					</div>
					
					<div class="control-group">
					    <label class="control-label" for="inputSurname">Prénom</label>
					    <div class="controls">
					    	<input type="text" id="inputSurname" placeholder="Prénom" required>
					    </div>
					</div>
					
					<div class="control-group">
					    <label class="control-label" for="inputEmail">Email</label>
					    <div class="controls">
					    	<input type="email" id="inputEmail" placeholder="utilisateur@exemple.com" required>
					    </div>
					</div>
					
				    <div class="control-group">
					    <label class="control-label" for="inputPassword">Mot de passe</label>
					    <div class="controls">
					    	<input type="password" id="inputPassword" placeholder="Password" required>
					    </div>
				    </div>
			
				    <div class="control-group">
						<div class="controls">
						    <button type="bouton" class="btn" onclick="saveData()">Valider</button>
					    </div>
				    </div>
			    </form>
			</div>			
			
			
			<!-- include bibliothèque javascript-->	
			<script src="js/jquery-latest.js"></script>
		    <script src="js/bootstrap.min.js"></script>
		    <script type="text/javascript" src="js/register.js"></script>		    

			<!-- include barre de navigation -->
		    <?php include("php/upbardisconnected.php");?>

		    
			<!--
			<?php
				// On définit les 4 variables nécessaires à la connexion MySQL :
				$hostname = "localhost";
				$user     = "root";
				$password = "root";
				$nom_base_donnees = "IHM";
			
				// Connexion au serveur MySQL
				$conn = mysql_connect($hostname, $user, $password) or die(mysql_error());
			
				// Choix de la base sur laquelle travailler
				mysql_select_db($nom_base_donnees, $conn);
				
				// Requête que l'on exécute

				mysql_query("INSERT INTO Users (Nom , Prenom, Email, Password) VALUES ('Perrot', 'Gael', 'perrot.gael', 'azerty')");


								
				mysql_close($conn);
			?>
			-->		
	    </body>
    </html>