function f1() {
    $("#div1").replaceWith($('<h1 id="div1">' +   $("#div1").text() + '</h1>'));
}

function f2() {
    $("#div1").replaceWith($('<div id="div1">' +  $("#div1").text() + '</div>'));
}

function f3() {
    $("#div1").text($("#div1").text() + " Insert some text after the text") ;
}

function f4() {
    $("#myTitle").text("Title changed");
}

function f5() {
    if ($("#div1").is(":hidden")) {
        $("#div1").show();
    } else {
        $("#div1").hide();
    }
}



$(document).ready(function(){
    $('#login').click(function()
    {
        var user=$('#userid').val();
        var pwd=$('#pswrd').val();
        $.ajax({
            type: "POST",
            url:"LoginServlet",
            data: {"user":user,"password":pwd},
            success: function (response) {
                if(response=='Correct'){
                    alert("1")
                }else{
                    alert("0");
                }
            }
        });
    });
});

$('#cities').cityAutocomplete();