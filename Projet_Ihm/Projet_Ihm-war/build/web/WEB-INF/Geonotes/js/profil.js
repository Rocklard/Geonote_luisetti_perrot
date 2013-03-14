if (localStorage) {
	// Le navigateur supporte le localStorage
	retrieveData();

	function saveData() {
		var oldPassword = document.querySelector('#profilOldPassword');
		var profilPassword1 = document.querySelector('#profilPassword1');
		var profilPassword2 = document.querySelector('#profilPassword2');
		var nom = document.querySelector('#profilName').value;
		var prenom = document.querySelector('#profilSurname').value;
		var email = document.querySelector('#profilEmail').value;

		
		if (oldPassword.value == '' && profilPassword1.value == '' && profilPassword2.value == '')
		{			
			localStorage.setItem('nom', nom);
			localStorage.setItem('prenom', prenom);
			localStorage.setItem('email', email);
		}
		else
		{
			if ( oldPassword.value == localStorage.getItem('password'))
			{
				if( profilPassword1.value == profilPassword2.value)
				{
					localStorage.setItem('password', profilPassword1.value);
					localStorage.setItem('nom', nom);
					localStorage.setItem('prenom', prenom);
					localStorage.setItem('email', email);	
				}
				else
				{
					alert("Les deux mots de passe sont différent");
				}
			}
			else
			{
				alert("Mauvais mot de passe");
			}
		}	

		
		
	}
	function retrieveData() {
	    var nom = localStorage.getItem('nom');
	    var prenom = localStorage.getItem('prenom');
	    var email = localStorage.getItem('email');
	    document.querySelector('#profilName').value = nom;
	    document.querySelector('#profilSurname').value = prenom;
	    document.querySelector('#profilEmail').value = email;
	}
			
} else {
	// localStorage non supporté
	alert("Votre navigateur ne supporte pas le LocalStorage");
}
