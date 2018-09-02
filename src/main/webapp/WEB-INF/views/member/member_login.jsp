<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <title>登录</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/css/amazeui.css" />
    <link href="${pageContext.request.contextPath}/static/meituan/css/dlstyle.css" rel="stylesheet" type="text/css">
    <%--前台校验要用到的JS文件--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.12.4.min.js"></script>
</head>
<body>
<%--美团图片--%>
<div class="login-boxtitle">
    <a href="${pageContext.request.contextPath}/storeController/homeSearch"><img alt="logo" src="${pageContext.request.contextPath}/static/meituan/images/logobig3.png" /></a>
</div>
<div class="login-banner">
    <div class="login-main">
        <div class="login-banner-bg"><span></span><img src="${pageContext.request.contextPath}/static/meituan/images/big.jpg" /></div>
        <div class="login-box">
            <h3 class="title">登录</h3>
            <form name="loginForm" method="post" action="${pageContext.request.contextPath}/memberController/selectMember">
                <font color="red">${message}</font>
                <div class="user-name">
                    <label for="username"><i class="am-icon-user"></i></label>
                    <input type="text" name="mUsername" id="username" placeholder="请输入用户名">
                    <span id="span_username"></span>
                    <font color="red">${username}</font>
                </div><br>
                <div class="user-pass">
                    <label for="password"><i class="am-icon-lock"></i></label>
                    <input type="password" name="mPassword" id="password" placeholder="请输入密码">
                    <span id="span_password"></span>
                    <font color="red">${password}</font>
                </div><br>
                <input type="submit" value="登 录" class="am-btn am-btn-primary am-btn-sm" onclick="login_form();return false;" >
            </form>
                <div class="login-links">
                    <%--<label for="remember-me"><input id="remember-me" type="checkbox">记住密码</label>--%>
                    <%--<a href="#" class="am-fr">忘记密码</a>--%>
                    <a href="${pageContext.request.contextPath}/memberController/toRegister" class="zcnext am-fr am-btn-default">注册</a>
                </div>
        </div>
    </div>
</div>
<jsp:include page="${pageContext.request.contextPath}/tail.jsp"></jsp:include>
<%--登陆前台校验--%>
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
            document.getElementById("span_username").innerHTML='用户名不能为空';
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