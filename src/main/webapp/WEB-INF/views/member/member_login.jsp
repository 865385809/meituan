<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <title>登录</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/css/amazeui.css" />
    <link href="${pageContext.request.contextPath}/static/meituan/css/dlstyle.css" rel="stylesheet" type="text/css">
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
                <div class="user-name">
                    <label for="user"><i class="am-icon-user"></i></label>
                    <input type="text" name="mUsername" id="user" placeholder="邮箱/手机/用户名">
                </div>
                <div class="user-pass">
                    <label for="password"><i class="am-icon-lock"></i></label>
                    <input type="password" name="mPassword" id="password" placeholder="请输入密码">
                </div>
                <input type="submit" name="" onClick=submit1(); value="登 录" class="am-btn am-btn-primary am-btn-sm">
            </form>
                <div class="login-links">
                    <label for="remember-me"><input id="remember-me" type="checkbox">记住密码</label>
                    <a href="#" class="am-fr">忘记密码</a>
                    <a href="${pageContext.request.contextPath}/memberController/toRegister" class="zcnext am-fr am-btn-default">注册</a>
                </div>
        </div>
    </div>
</div>

<jsp:include page="${pageContext.request.contextPath}/tail.jsp"></jsp:include>
<%--<script type="text/javascript">--%>
    <%--function submit1() {--%>
        <%--document.loginForm.action = "${pageContext.request.contextPath}/memberController/selectMember"--%>
        <%--document.loginForm.submit();--%>
    <%--}--%>
<%--</script>--%>
</body>
</html>