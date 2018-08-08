<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head lang="en">
    <title>注册</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/css/amazeui.min.css" />
    <link href="${pageContext.request.contextPath}/static/meituan/css/dlstyle.css" rel="stylesheet" type="text/css">
    <script src="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>
</head>

<body>

<div class="login-boxtitle">
    <a href="${pageContext.request.contextPath}/home.jsp"><img alt="美团" src="${pageContext.request.contextPath}/static/meituan/images/logobig3.png" /></a>
</div>

<div class="res-banner">
    <div class="res-main">
        <div class="login-banner-bg"><span></span><img src="${pageContext.request.contextPath}/static/meituan/images/big.jpg" /></div>
        <div class="login-box">

            <div class="am-tabs" id="doc-my-tabs">
                <ul class="am-tabs-nav am-nav am-nav-tabs am-nav-justify">
                    <li class="am-active"><a href="">用户注册</a></li>
                    <a href="${pageContext.request.contextPath}/member/member_login.jsp" class="zcnext am-fr am-btn-default">登陆</a>
                </ul>

                <div class="am-tabs-bd">
                    <div id="register_div" class="am-tab-panel am-active">
                        <form method="post">
                            <div class="user-name">
                                <label for="username"><i class="am-icon-user"></i></label>
                                <input type="text" name="mUsername" id="username" placeholder="请输入账号">
                            </div>
                            <div class="user-pass">
                                <label for="password"><i class="am-icon-lock"></i></label>
                                <input type="password" name="mPassword" id="password" placeholder="设置密码">
                            </div>
                            <div class="user-email">
                                <label for="email"><i class="am-icon-envelope-o"></i></label>
                                <input type="email" name="mMailbox" id="email" placeholder="需要邮箱激活账号">
                            </div>
                            <div class="user-phone">
                                <label for="phone"><i class="am-icon-mobile-phone am-icon-md"></i></label>
                                <input type="tel" name="mPhone" id="phone" placeholder="激活账号需要手机短信验证">
                            </div>
                        </form>

                        <div class="login-links">
                            <label for="reader-me">
                                <input id="reader-me" type="checkbox" checked="true"  onclick="return false;"  />我已阅读并接受
                                <a href="${pageContext.request.contextPath}/member/member_copyright.jsp">版权说明和隐私保护条款</a>
                            </label>
                        </div>
                        <div class="am-cf">
                            <input type="submit" name="" id="member_sava_sub" value="注册" class="am-btn am-btn-primary am-btn-sm am-fl">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <jsp:include page="${pageContext.request.contextPath}/tail.jsp"></jsp:include>
    <script type="text/javascript">
        //注册ajax提交表单数据
        $("#member_sava_sub").click(function () {
            $.ajax({
                url:"${pageContext.request.contextPath}/memberController/member_save",
                type:"POST",
                data:$("#register_div form").serialize(),
                success:function (result) {
                    if(result.code == 100){
                        //会员注册成功；
                        window.location.href="${pageContext.request.contextPath}/member/member_login.jsp";
                        alert(result.msg);
                    }
                }
            });
        });
    </script>
</body>
</html>