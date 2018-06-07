$(document).ready(function () {
	$("#register").bind("click", function(event) {

		event.preventDefault();

		var user = {}
		user["email"] = $("#email").val();
		user["login"] = $("#login").val();
		user["password"] = $("#password").val();

		/*var user = {
			'id' : '1',
			'login' : 'test',
			'email' : 'test@mail.ru',
			'password' : 'password'
		}*/

		var userJSON = JSON.stringify(user);

		$.ajax({
			url: "/register",
			type: "POST",
			data: userJSON,
			dataType: "json",
			contentType: "application/json; charset=utf-8",
			success: function () {
				console.log("УРАА");
			}
		});

		$('#registrationModal').modal('hide');
	});
});