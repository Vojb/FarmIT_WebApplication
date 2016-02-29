	$("#findAnimal").click(function(){
	
		alert($('#Baajs').val());
		  $("#kuk").val($('#Baajs').val());
		  alert($('#Baajs').val());
});	
$("#changeFood").change(function() {
		$('#food').text($('option:selected').attr('data-content'));
		$('#foodOne').text($('option:selected').attr('data-example'));
	    
	}).change();
	
	
//		$("#findAnimal").click(function(){
//			
//				alert($('#Baajs').delay(5000).val());
//				  $('#foundStatusAnimal').val($('#Baajs').val());
//				  alert($('#Baajs').val());
//	});

	

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
//		}
//	
//}