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
$("#foundType").change(function() {
	if ($('#foundType').text() === "Horse") {
		$('#foundFoodOne').show();
	} else {
		$('#FoundFoodOne').hide();
	}
}).change();


