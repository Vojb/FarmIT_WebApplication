	$("#changeFood").change(function() {
		$('#food').text($('option:selected').attr('data-content'));
		$('#foodOne').text($('option:selected').attr('data-example'));
	    
	}).change();
	
	
	function validateForm() {
		var fnElement = document.getElementById("findIdAnimal");
		var findIdAnimal = fnElement.value;
		if (findIdAnimal == null || findIdAnimal == "" || findIdAnimal === "undefined"){
		fnElement.setAttribute("placeholder","Animal Id please" );
	}
		function checkIfIdNbr(){
		  var fnElement =document.getElementById("findIdAnimal");
		  var findIdAnimal = findElement.value;
		  if (isNaN(fnElement)) {
			fnElement.setAttribute("placeholder","Id only consists of numbers");
		    return false;
		  }
		}
	
}