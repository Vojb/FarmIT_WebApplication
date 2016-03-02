$("#typeAnimal").change(function() {
		$('#food').text($('option:selected').attr('data-content'));
		$('#foodOne').text($('option:selected').attr('data-example'));
	}).change();

function x(){
	var fnElement = document.getElementById("findIdAnimal");
	  var findIdAnimal = fnElement.value;
	  alert(findIdAnimal);
	  if (isNaN(findIdAnimal)) {
		  fnElement.setAttribute("placeholder","Id only consists of numbers");
		  return false;
	  }
		document.getElementById("y").submit();
}

