$("#typeAnimal").change(function() {
		$('#food').text($('option:selected').attr('data-content'));
		$('#foodOne').text($('option:selected').attr('data-example'));
	}).change();

$("#typeAnimal").change(function(){
	   
	if ($('option:selected') ===($('#changeFoodHorse').val("Horse"))) {
	        $('#foodOne').show();
	    }
	    else {
	        $('#foodOne').hide();
	    }
	}).change();

