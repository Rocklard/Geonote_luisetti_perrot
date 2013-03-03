if (localStorage) {
	// Le navigateur supporte le localStorage
	function connection()
		{	
			var logEmail = document.querySelector('#logEmail');
			var logPassword = document.querySelector('#logPassword');
		    var email = localStorage.getItem('email');
		    var password = localStorage.getItem('password');
		    
			if ((logEmail.value == email) && (logPassword.value == password))
			{
				alert("Connexion réussie");
				document.location.href="profil.php";
			}
			else
			{
				alert("Erreur de connexion");
			}
		}
}
else
{
	// localStorage non supporté
	alert("Votre navigateur ne supporte pas le LocalStorage");
}