var Notesapp = (function(){

	var App = {
		stores:{}
	}
	
	//initialize localStorage data store
	App.stores.notes = new Backbone.LocalStorage(‘notes’) ;
	
	//Note model
	var Note = Backbone.Model.extend({
		//use localStrorage datastore
		localStorage : App.stores.notes, // url: "http://masuperapp.com/notes", pour utiliser un serveur distant
		
		initialize: function(){
			if (!this.get('title')){
				this.set({title: "Note @ " + Date()});
			};
			if(!this.get('body')){
				this.set({body :" no content"});
			};
		},
		
		geolocate: function(){
			var coords = navigator.geolocation();
			this.set({latitude: coords.latitude});			
		}
		
	});
	
	window.note = Notes;
	
	return App;

})();