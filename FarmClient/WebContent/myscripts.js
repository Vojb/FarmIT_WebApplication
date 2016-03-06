$("#typeAnimal").change(function() {
	$('#food').text($('option:selected').attr('data-content'));
	$('#foodOne').text($('option:selected').attr('data-example'));
}).change();

$("#typeAnimal").change(function() {
	if ($('#typeAnimal option:selected').text() === "Horse") {
		$('#hay').show();
	} else {
		$('#hay').hide();
	}
}).change();

//$(document).ready(
//	    function (){
//	    	$("#findAnimal").click(function() {
//	    
//
//	alert("hej");
////	alert(('#findIdAnimal').text().valueOf());
//	var id = 30;
//	
//	if(id> 4000){
//	alert("bajs");
////	if ($('#foundType').text() === "Horse") {
//		
//		$('#bajs').show();
//	} else {
//		alert($('#hay').text());
//		$('#hay').hide();
//	}
////	}
//}).change();
//	    });