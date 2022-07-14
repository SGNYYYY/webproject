var UserName = document.getElementById("UserName");
var Password = document.getElementById("Password");
var LoginButton = document.getElementById("LoginButton");
var UserNameText = '';

// isLoginFun();
//登录
function login() {
    if (!UserName.value) {
        alert("请先输入用户名");
        UserName.focus();
        return;
    }
    if (!Password.value) {
        alert("请输入密码");
        Password.focus();
        return;
    }

    UserNameText = $("#UserName").val();
    var PasswordTest = $("#Password").val();

    var da = {
        "username": UserNameText,
        "password": PasswordTest
    };
    //commonAjaxPost(true, "/redis/userLogin", da, loginSuccess)
        //commonAjaxPost(true, "/admin/userLogins", da, loginSuccess)
    var result = {}
    if(da.username==="admin"&&da.password==="1"){
        result.code = '666'
        result.message = "登陆成功"
    }
    loginSuccess(result)

}

//登录成功回调
function loginSuccess(result) {
    console.log(result)
    if (result.code == '666') {
        layer.msg(result.message, { icon: 1 });
        setCookie('isLogin', '1');
        window.location.href = "index"
    } else {
        //layer.msg("此用户不存在",{icon:2});
        $('#errorMsgBox').show()
        $('#errorMsgBox').text(result.message)
    }
}

//回车事件
$(document).keydown(function(event) {
    if (event.keyCode == 13) {
        login();
    }
});