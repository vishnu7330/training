function msg() {

	alert("Welcome to Javascript");
}


function changeContent() {

	document.getElementById("mycontent").innerHTML = "Welcome to Javascript";

}

function changeContentWithJquery() {

	$('#mycontent').text("Welcome to Jquery");

}

function changeContentWithAjax() {
	$.ajax('api/message/data.txt',   // request url
		{
			success: function(data, status, xhr) {    // success callback function
				$('#mycontent').text(data);
			}
		});
}


$(document).ready(function() {
	console.log("page loading");
	alert("on load");
	$('#mycontent').text("Loading...");

});