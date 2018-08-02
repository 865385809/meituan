<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <title>会员登陆</title>
    <%--<meta charset="UTF-8">--%>
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="alternate icon" type="image/png" href="${pageContext.request.contextPath}/static/images/favicon.png">
    <link rel='icon' href='favicon.ico' type='image/x-ico' />
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/default.min.css?t=227" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/jquery/jquery.min.js"></script>
    <script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
    <script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
    <script src="${pageContext.request.contextPath}/static/lib/amazeui/amazeui.ie8polyfill.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/handlebars/handlebars.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/iscroll/iscroll-probe.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/amazeui/amazeui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/raty/jquery.raty.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/main.min.js?t=1"></script>

    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.12.4.min.js"></script>
    <link href="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
﻿<header class="hd1">
    <div class="cg">
        <a href="../index.html"><img src="${pageContext.request.contextPath}/static/images/logo.jpg" height="100" width="150"/></a>
        <div class="hd1-right">
            没有账号？<a href="${pageContext.request.contextPath}/member/member_register.jsp">注册</a>
        </div>
    </div>
</header>
<div class="user">
    <div class="cgs">
        <div class="am-u-sm-12 am-u-md-12 am-u-lg-7">
            <div class="user-div">
                <h1>用户登录</h1>·
                <ul>
                    <li><i>&#xe681;</i><input type="text" name="username" value="" placeholder="请输入用户名" /></li>
                    <li><i>&#xe680;</i><input type="text" name="password" value="" placeholder="请输入密码" /></li>
                </ul>
                <span><a href="#">忘记密码</a></span>
                <button>登录</button>
            </div>
        </div>
        <%--<div class="am-hide-sm am-hide-md am-u-lg-5">--%>
            <%--<div class="user-right">--%>
                <%--<a href="#">还没有帐号</a>--%>
                <%--<button>立即注册</button>--%>
            <%--</div>--%>
        <%--</div>--%>
    </div>
</div>

</body>
</html>
