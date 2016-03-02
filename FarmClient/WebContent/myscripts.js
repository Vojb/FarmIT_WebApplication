$("#changeFood").change(function() {
		$('#food').text($('option:selected').attr('data-content'));
		$('#foodOne').text($('option:selected').attr('data-example'));
		
	}).change();

//$(document).ready(function(){	
//	console.log("alsjd")
//$("#find-animal").click(function(){
//	alert($('#animalstatus').val());
//	  $('#foundstatusanimal').val($('#animalstatus').val());
//		alert($('#animalstatus').val());
//		alert("fuck")
//	});	
//});

/* function x(){
	var fnElement = document.getElementById("findIdAnimal");
	  var findIdAnimal = fnElement.value;
	  if (isNaN(findIdAnimal)) {
		  
		  //document.getElementById("findIdAnimal").value = '';		 
		  //fnElement.setAttribute("placeholder","Id only consists of numbers");
		  return false;
	  }
		document.getElementById("y").submit();
} */


	

//	
//	function validateForm() {
//		var fnElement = document.getElementById("findIdAnimal");
//		var findIdAnimal = fnElement.value;
//		if (findIdAnimal == null || findIdAnimal == "" || findIdAnimal === "undefined"){
//		fnElement.setAttribute("placeholder","Animal Id please" );
//	}
//		function checkIfIdNbr(){
//		  var fnElement = document.getElementById("findIdAnimal");
//		  console.log(fnElement);
//		  var findIdAnimal = fnElement.value;
//		  if (isNaN(findIdAnimal)) {
//			fnElement.setAttribute("placeholder","Id only consists of numbers");
//		    return false;
//		  }
//	}
//	
