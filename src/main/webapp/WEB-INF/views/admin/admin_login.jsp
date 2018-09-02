<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员登陆</title>
    <link href="${pageContext.request.contextPath}/static/admin/css/main.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="login">
    <div class="box png">
        <div class="logo png"></div>
        <div class="input">
            <div class="log">
                <font color="red">${message}</font>
                <form action="${pageContext.request.contextPath}/adminController/adminLogin" method="post">
                    <div class="name">
                        <label>用户名</label>
                        <input type="text" class="text" id="username" placeholder="用户名" name="admUsername" tabindex="1">
                        <BR><span id="span_username"></span>
                        <font color="red">${username}</font>
                    </div>
                    <div class="pwd">
                        <label>密　码</label>
                        <input type="password"  class="text" id="password" placeholder="密码" name="admPassword" tabindex="2">
                        <BR><span id="span_password"></span>
                        <font color="red">${password}</font>
                    </div>
                    <input type="submit" class="submit" onclick="login_form();return false;" tabindex="3" value="登录">
                    <div class="check"></div>
                </form>
                    <div class="tip"></div>
            </div>
        </div>
    </div>
    <div class="air-balloon ab-1 png"></div>
    <div class="air-balloon ab-2 png"></div>
    <div class="footer"></div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/js/jQuery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/js/fun.base.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/js/script.js"></script>
<script type="text/javascript">
    var username = "";
    var password = "";
    function login_form() {
        document.getElementById("span_username").innerHTML="";
        if (username==""){
            document.getElementById("span_username").innerHTML='*用户名不能为空';
            document.getElementById("span_username").style.color='red';
            return false;
        }
        document.getElementById("span_password").innerHTML="";
        if(password==""){
            document.getElementById("span_password").innerHTML='*密码不能为空';
            document.getElementById("span_password").style.color='red';
            return false;
        }
        document.getElementById("loginForm").submit();
    }
    //验证账号
    $("#username").change(function(){
        username = $("#username").val();
        document.getElementById("span_username").innerHTML="";
        if(username==""){
            document.getElementById("span_username").innerHTML='*用户名不能为空';
            document.getElementById("span_username").style.color='red';
            return false;
        }
    });
    //验证密码
    $("#password").change(function(){
        password = $("#password").val();
        document.getElementById("span_password").innerHTML="";
        if(password==""){
            document.getElementById("span_password").innerHTML='*密码不能为空';
            document.getElementById("span_password").style.color='red';
            return false;
        }
    });
</script>
</body>
</html>
