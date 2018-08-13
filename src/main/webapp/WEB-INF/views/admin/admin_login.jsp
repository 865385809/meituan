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
                <form action="${pageContext.request.contextPath}/adminController/adminLogin" method="post">
                    <div class="name">
                        <label>用户名</label>
                        <input type="text" class="text" id="value_1" placeholder="用户名" name="admUsername" tabindex="1">
                    </div>
                    <div class="pwd">
                        <label>密　码</label>
                        <input type="password"  class="text" id="value_2" placeholder="密码" name="admPassword" tabindex="2">
                        <input type="submit" class="submit" tabindex="3" value="登录">
                        <div class="check"></div>
                    </div>
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

</body>
</html>
