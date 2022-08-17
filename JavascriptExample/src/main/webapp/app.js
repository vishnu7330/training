function msg() {

	alert("Welcome to Javascript");
}


function changeContent() {

	document.getElementById("mycontent1").innerHTML = "Welcome to Javascript";

}

function changeContentWithJquery() {

	$('#mycontent1').text("Welcome to Jquery");

}

function changeContentWithAjax() {
	$.ajax('api/message/data.txt',   // request url
		{
			success: function(data, status, xhr) {    // success callback function
				$('#mycontent1').text(data);
				console.log("HTTP status: " + status);
			}
		});
}

function changeCSSWithJavascript() {
	document.getElementById("mycontent2").style.fontSize = "25px";
	document.getElementById("mycontent2").style.color = "green";
	document.getElementById("mycontent2").style.backgroundColor = "yellow";
}

function changeCSSWithJQuery() {
	/* $('#mycontent').css('color','red'); */

	$('#mycontent3').addClass("content");
}


$(document).ready(function() {
	console.log("page loading");
	alert("on load");
	$('#mycontent1').text("Loading...");


	$("#hide").click(function() {
		$('#mycontent4').hide();
	});
	$("#show").click(function() {
		$('#mycontent4').show();
	});

});