if (localStorage) {
	// Le navigateur supporte le localStorage
	function saveData() {
		var nom = document.querySelector('#inputName').value;
		var prenom = document.querySelector('#inputSurname').value;
		var email = document.querySelector('#inputEmail').value;
		var password = document.querySelector('#inputPassword').value;
		localStorage.setItem('nom', nom);
		localStorage.setItem('prenom', prenom);
		localStorage.setItem('email', email);
		localStorage.setItem('password', password);
		document.location.href="login.php";
	}
		
	//var interval = setInterval(saveData, 5000); //effectue une sauvegarde des données toutes les 5 secondes
	
} else {
	// localStorage non supporté
	alert("Votre navigateur ne supporte pas le LocalStorage");
}
