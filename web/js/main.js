import $ from 'jquery';

$("#hello").click(function() {
    UserService.hello(function(data) {
        alert(data);
    });
});

$("#user").click(function() {
    UserService.user(function(data) {
        alert(JSON.stringify(data));
    });
});

$("#list").click(function() {
    UserService.list(function(data) {
        alert(JSON.stringify(data));
    });
});