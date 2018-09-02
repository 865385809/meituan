<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商家登陆</title>
    <link href="${pageContext.request.contextPath}/static/css/style.css" rel='stylesheet' type='text/css' />
    <%--前台校验要用到的JS文件--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.12.4.min.js"></script>

</head>
<body>
<h1>商家登陆</h1>
<div class="app-cam">
    <font color="red">${message}</font>
    <form action="${pageContext.request.contextPath}/sellerController/sellerLogin" method="post">
        <%--onblur="if (this.value == '') {this.value = '用户名';}"   onfocus="this.value = '';" --%>
        <input type="text" class="text" name="sUsername"  id="username"  placeholder="请输入用户名">
        <span id="span_username"></span>
        <font color="red">${username}</font>
        <%--onblur="if (this.value == '') {this.value = 'Password';}"--%>
        <input type="password" name="sPassword"  id="password"  placeholder="请输入密码">
        <span id="span_password"></span>
        <font color="red">${password}</font>
        <div class="submit">
            <input type="submit" onclick="login_form();return false;" value="登陆" >
        </div>
        <div class="buttons">
            <ul>
                <li><a href="${pageContext.request.contextPath}/sellerController/toSellerRegister" class="hvr-sweep-to-right">注册</a></li>
            </ul>
        </div>
    </form>
</div>
<script type="text/javascript">
    var username = "";
    var password = "";
    function login_form() {
        document.getElementById("span_username").innerHTML="";
        if (username==""){
            document.getElementById("span_username").innerHTML='不能为空';
            document.getElementById("span_username").style.color='red';
            return false;
        }
        document.getElementById("span_password").innerHTML="";
        if(password==""){
            document.getElementById("span_password").innerHTML='不能为空';
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
            document.getElementById("span_username").innerHTML='*不能为空';
            document.getElementById("span_username").style.color='red';
            return false;
        }
    });
    //验证密码
    $("#password").change(function(){
        password = $("#password").val();
        document.getElementById("span_password").innerHTML="";
        if(password==""){
            document.getElementById("span_password").innerHTML='*不能为空';
            document.getElementById("span_password").style.color='red';
            return false;
        }
    });
</script>
</body>
</html>