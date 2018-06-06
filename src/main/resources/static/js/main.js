$(document).ready(function () {
	$("#register").bind("click", function() {
		$.ajax({
			url: "/register",
			type: "POST",
			dataType: "json",
			success: function () {
				console.log("УРАА");
			}
		});
	});
});
/*function onUserRegister() {
	console.log("before ajax");

	/!*$.ajax({
		type: "POST",
		url: "/register",
		dataType: "json",
		success: function () {
			console.log("Register successfully registered");
		},
		error: function () {
			console.log("Register user ERROR");
		}
	});*!/
	$.ajax({
		type: 'POST',
		url: '/register',
		dataType: 'json',
		success: function () {
			console.log("Success!")
		}
	});
}*/

/*
$.ajax({
	type: 'POST',
	url: '/register',
	dataType: 'json',
	success: function () {
		console.log("Success!")
	}
});*/
