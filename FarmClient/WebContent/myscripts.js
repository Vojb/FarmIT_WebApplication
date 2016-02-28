$("#changeFood").change(function() {
    $('#food').text($('option:selected').attr('data-content'));
}).change();


var d = new Date();
document.getElementById("demo").innerHTML = d.toDateString();
