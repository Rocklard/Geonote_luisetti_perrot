<?php
			if(isset($_POST['inputNote']) && isset($_POST['inputDescription']) && isset($_POST['geolocation'])) {
			    if(($_POST['inputNote'] != '') && ($_POST['inputDescription'] != '') && ($_POST['geolocation'])) {
			        $reponse = 'ok';
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
					
					mysql_query("INSERT INTO Notes (Note , Descriptif, Position) VALUES ('{$_POST['inputNote']}', '{$_POST['inputDescription']}', '{$_POST['inputDescription']}'");
					mysql_close($conn);       
			        
			    } else {
			        $reponse = 'Les champs sont vides';
			    }
			} else {
			    $reponse = 'Tous les champs ne sont pas parvenus';
			}
			$array['reponse'] = $reponse;
			echo json_encode($array);
?>