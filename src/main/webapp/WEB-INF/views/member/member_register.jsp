<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head lang="en">
    <title>注册</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/css/amazeui.min.css" />
    <link href="${pageContext.request.contextPath}/static/meituan/css/dlstyle.css" rel="stylesheet" type="text/css">
    <script src="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>
    <%--bookstrap--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.12.4.min.js"></script>
    <link href="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>

<body>

<div class="login-boxtitle">
    <a href="${pageContext.request.contextPath}/storeController/homeSearch"><img alt="美团" src="${pageContext.request.contextPath}/static/meituan/images/logobig3.png" /></a>
</div>

<div class="res-banner">
    <%--<div class="res-main">--%>
        <div class="login-banner-bg"><span></span><img src="${pageContext.request.contextPath}/static/meituan/images/big.jpg" /></div>
        <div class="login-box">
                <ul class="am-tabs-nav am-nav am-nav-tabs am-nav-justify">
                    <li class="am-active"><a href="">用户注册</a></li>
                    <a href="${pageContext.request.contextPath}/memberController/toLogin" class="zcnext am-fr am-btn-default">登陆</a>
                </ul>
                <form id="register_form" method="post" enctype="multipart/form-data" action="${pageContext.request.contextPath}/memberController/member_save">
                    <div class="user-name">
                        <label for="username_input"><i class="am-icon-user"></i></label>
                        <input type="text" name="mUsername" id="username_input" placeholder="请输入账号">
                        <span id="span_username"></span>
                    </div><br>
                    <div class="user-pass">
                        <label for="password_input"><i class="am-icon-lock"></i></label>
                        <input type="password" name="mPassword" id="password_input" placeholder="设置密码">
                        <span id="span_password"></span>
                    </div><br>
                    <div class="user-name">
                        <label for="name_input"><i class="am-icon-navicon"></i></label>
                        <input type="text" name="mName" id="name_input" placeholder="输入昵称">
                        <span id="span_name"></span>
                    </div><br>
                    <div class="user-phone">
                        <label for="phone_input"><i class="am-icon-mobile-phone am-icon-md"></i></label>
                        <input type="tel" name="mPhone" id="phone_input" placeholder="输入手机号">
                        <span id="span_phone"></span>
                    </div>
                    <%--<div class="user-name">--%>
                        <%--<label for="upload"><i class="am-icon-file"></i></label>--%>
                        <br>上传头像:
                        <input type="file" name="upload" id="upload_input" value="上传头像" placeholder="上传头像">
                        <span id="span_file"></span>
                    <%--</div>--%>
                    <div class="user-email">
                        <label for="email_input"><i class="am-icon-envelope-o"></i></label>
                        <input type="email" name="mMailbox" id="email_input" size="5" placeholder="输入邮箱获取验证码">
                        <span id="span_email"></span>
                    </div>
                    <br><br><br>验证码：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <button onclick="sendMail();return false;"> 发送邮箱</button>
                        <input type="text" name="mailCode" id="mailCode_input" placeholder="输入邮箱验证码">
                        <span id="span_mailCode"> </span>
                    <div class="am-cf">
                        <input type="submit"  id="member_sava_sub" value="注册" onclick="sendForm();return false;" class="am-btn am-btn-primary am-btn-sm am-fl">
                    </div>
                </form>
                <%--协议--%>
                <div class="login-links">
                    <label for="reader-me">
                        <input id="reader-me" type="checkbox" checked="true"  onclick="return false;"  />我已阅读并接受
                        <a href="${pageContext.request.contextPath}/memberController/toCopyRight">版权说明和隐私保护条款</a>
                    </label>
                </div>
        </div>
    </div>
<%--尾部--%>
<br><br><br><br><br><br><br><br><br>
<jsp:include page="${pageContext.request.contextPath}/tail.jsp"></jsp:include>
<script type="text/javascript">
    var name = "";var username="";var password = "";var file = "";var phone = "";var email = "";var mailCode = "";var regpassword = /^([a-zA-Z0-9_-]{6,18}$)/;var regusername = /^([a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5}$)/;var regmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;var regphone = /^1\d{10}$/;
    var sendCode = "";
    //提交表单
    function sendForm() {
        document.getElementById("span_username").innerHTML="";
        if (username==""){
            document.getElementById("span_username").innerHTML='*用户名不能为空';
            document.getElementById("span_username").style.color='red';
            return false;
        }else if(!regusername.test(username)){
            document.getElementById("span_username").innerHTML='*用户名可以是2-5位中文或者6-16位英文和数字的组合,不能有特殊字符';
            document.getElementById("span_username").style.color='red';
            return false;
        }
        if (password==""){
            document.getElementById("span_password").innerHTML='*密码不能为空';
            document.getElementById("span_password").style.color='red';
            return false;
        }else if(!regpassword.test(password)){
            document.getElementById("span_password").innerHTML='*密码可以是6-18位的字母数字';
            document.getElementById("span_password").style.color='red';
            return false;
        }
        if (name==""){
            document.getElementById("span_name").innerHTML='*昵称不能为空';
            document.getElementById("span_name").style.color='red';
            return false;
        }
        if (file==""){
            document.getElementById("span_file").innerHTML='*上传文件不能为空';
            document.getElementById("span_file").style.color='red';
            return false;
        }
        if (phone==""){
            document.getElementById("span_phone").innerHTML='*手机号不能为空';
            document.getElementById("span_phone").style.color='red';
            return false;
        }else if(!regphone.test(phone)){
            document.getElementById("span_phone").innerHTML='*手机号格式只能是1开头的11位手机号码';
            document.getElementById("span_phone").style.color='red';
            return false;
        }
        if (email==""){
            document.getElementById("span_email").innerHTML='*邮箱不能为空';
            document.getElementById("span_email").style.color='red';
            return false;
        }else if(!regmail.test(email)){
            document.getElementById("span_email").innerHTML='*邮箱格式不对';
            document.getElementById("span_email").style.color='red';
            return false;
        }
        if (mailCode==""){
            document.getElementById("span_mailCode").innerHTML='*邮箱验证码不能为空';
            document.getElementById("span_mailCode").style.color='red';
            return false;
        }else if (mailCode!=sendCode){
            document.getElementById("span_mailCode").innerHTML='*验证码错误';
            document.getElementById("span_mailCode").style.color='red';
            return false;
        }
        document.getElementById("register_form").submit();
    }
    //验证账号
    $("#username_input").change(function(){
        username = $("#username_input").val();
        document.getElementById("span_username").innerHTML="";
            if(!regusername.test(username)){
            document.getElementById("span_username").innerHTML='*用户名可以是2-5位中文或者6-16位英文和数字的组合,不能有特殊字符';
            document.getElementById("span_username").style.color='red';
            return false;
        }
        $.ajax({
            url:"${pageContext.request.contextPath}/memberController/checkmember",
            data:"membername="+username,
            type:"POST",
            success:function(result){
                if(result.code==100){
                    document.getElementById("span_username").innerHTML='用户名可用';
                    document.getElementById("span_username").style.color='green';
                }else{
                    document.getElementById("span_username").innerHTML='用户名不可用';
                    document.getElementById("span_username").style.color='red';
                   // show_validate_msg("#mUsername_add_input","error",result.extend.va_msg);
                }
            }
        });
    });
    //验证密码
    $("#password_input").change(function(){
        password = $("#password_input").val();
        document.getElementById("span_password").innerHTML="";
            if(!regpassword.test(password)){
            document.getElementById("span_password").innerHTML='*密码可以是6-18位的字母数字';
            document.getElementById("span_password").style.color='red';
            return false;
        }
    });
    //验证昵称
    $("#name_input").change(function(){
        name = $("#name_input").val();
        document.getElementById("span_name").innerHTML="";
    });
    //验证文件
    $("#upload_input").change(function(){
        file = $("#upload_input").val();
        document.getElementById("span_file").innerHTML="";
    });
    //验证手机号
    $("#phone_input").change(function(){
        phone = $("#phone_input").val();
        document.getElementById("span_phone").innerHTML="";
            if(!regphone.test(phone)){
            document.getElementById("span_phone").innerHTML='*手机号格式只能是1开头的11位手机号码';
            document.getElementById("span_phone").style.color='red';
            return false;
        }
    });
    //邮箱改变校验
    $("#email_input").change(function(){
        email = $("#email_input").val();

        document.getElementById("span_email").innerHTML="";
            if(!regmail.test(email)){
            document.getElementById("span_email").innerHTML='*邮箱格式不对';
            document.getElementById("span_email").style.color='red';
            return false;
        }
    });
    //邮箱验证码
    $("#mailCode_input").change(function(){
        mailCode = $("#mailCode_input").val();
        document.getElementById("span_mailCode").innerHTML="";
        if (mailCode!=sendCode){
            document.getElementById("span_mailCode").innerHTML='*验证码错误';
            document.getElementById("span_mailCode").style.color='red';
            return false;
        }
    });
    //点击发送邮箱验证
    function sendMail() {
        email = $("#email_input").val();
        document.getElementById("span_email").innerHTML="";
            if(!regmail.test(email)){
            document.getElementById("span_email").innerHTML='*邮箱格式不对';
            document.getElementById("span_email").style.color='red';
            return false;
        }
        $.ajax({
            url:"${pageContext.request.contextPath}/memberController/sendMail?email="+email,
            type:"GET",
            success:function (result) {
                if(result.code == 100){
                    alert("发送成功");
                    sendCode=result.extend.mailCode;
                }
            }
        });
    }
</script>
</body>
</html>