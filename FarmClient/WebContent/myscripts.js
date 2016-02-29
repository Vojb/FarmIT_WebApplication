	$("#changeFood").change(function() {
		$('#food').text($('option:selected').attr('data-content'));
		$('#foodOne').text($('option:selected').attr('data-example'));
	    
	}).change();
