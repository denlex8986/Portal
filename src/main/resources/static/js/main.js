$(document).ready(function () {
    $("#register").bind("click", function (event) {

        event.preventDefault();

        var user = {}
        user["email"] = $("#email").val();
        user["login"] = $("#login").val();
        user["password"] = $("#password").val();

        var userJSON = JSON.stringify(user);


        $.ajax({
            url: "/accounts/register",
            type: "POST",
            data: userJSON,
            dataType: "json",
            contentType: "application/json; charset=utf-8",
            success: function () {
                console.log("Registration success");
            },
            error: function () {
                console.log("Registration ERROR")
            }
        });

        $('#registrationModal').modal('hide');
    });

    if ($('#email').hasClass('error'))
        $('#email').removeClass('error');

    if ($('#email').hasClass('success'))
        $('#email').removeClass('success');

    $('#email').keyup(function () {
        var email = $(this).val();

        if (email.length == 0) {
            if ($(this).hasClass('error'))
                $(this).removeClass('error');

            if ($(this).hasClass('success'))
                $(this).removeClass('success');
            return;
        }

        if (email.search('@') == -1) return;

        $.ajax({
            url: '/accounts/check_email',
            type: 'POST',
            data: email,
            dataType: "json",
            contentType: "application/json; charset=utf-8",
            success: function (data) {
                if (data == false) {

                    if ($('#email').hasClass('error'))
                        $('#email').removeClass('error');

                    $('#email').addClass('success');
                }
                else {
                    if ($('#email').hasClass('success'))
                        $('#email').removeClass('success');

                    $('#email').addClass('error');
                }
            },
            error: function () {
                console.log('error');
            }
        });
    });

    if ($('#login').hasClass('error'))
        $('#login').removeClass('error');

    if ($('#login').hasClass('success'))
        $('#login').removeClass('success');

    $('#login').keyup(function () {
        var login = $(this).val();

        if (login.length == 0) {
            if ($(this).hasClass('error'))
                $(this).removeClass('error');

            if ($(this).hasClass('success'))
                $(this).removeClass('success');
            return;
        }

        $.ajax({
            url: '/accounts/check_login',
            type: 'POST',
            data: login,
            dataType: "json",
            contentType: "application/json; charset=utf-8",
            success: function (data) {
                if (data == false) {

                    if ($('#login').hasClass('error'))
                        $('#login').removeClass('error');

                    $('#login').addClass('success');
                }
                else {
                    if ($('#login').hasClass('success'))
                        $('#login').removeClass('success');

                    $('#login').addClass('error');
                }
            },
            error: function () {
                console.log('error');
            }
        });
    });
});