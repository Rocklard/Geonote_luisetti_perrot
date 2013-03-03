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
			    <h1>Connexion</h1>
				
				<!-- login -->
				<form class="navbar-form pull-left">
				    <div class="control-group">
					    <label class="control-label" for="logEmail">Email</label>
					    <div class="controls">
					    	<input type="text" id="logEmail" placeholder="Email">
					    </div>
					</div>
				
				    <div class="control-group">
					    <label class="control-label" for="logPassword">Password</label>
					    <div class="controls">
					    	<input type="password" id="logPassword" placeholder="Password">
					    </div>
				    </div>
			
				    <div class="control-group">
						<div class="controls">
						    <label class="checkbox">
						    <input type="checkbox"> Remember me
						    </label>
						    <button type="button" class="btn" onclick="connection()">Sign in</button>
						    <a href="register.php"> <button type="button" class ="btn">Register</button></a>
					    </div>
				    </div>
			    </form>	    
			</div>
			
			<!-- include bibliothèque javascript-->		
			<script type="text/javascript" src="js/connexion.js"></script>
			
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

				$result = mysql_query("SELECT Email,Password FROM Users WHERE Email='perrot.gael'");
				
				while($data = mysql_fetch_assoc($result)) 
			    { 
				    // on affiche les informations de l'enregistrement en cours 
				    echo '<b>'.$data['Email'].' '.$data['Password'].'</b></br>';
			    }								
				mysql_close($conn);
			?>		
			-->
						
	    </body>
    </html>