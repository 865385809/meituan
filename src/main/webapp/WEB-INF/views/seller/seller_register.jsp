<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商家登陆</title>
    <link href="${pageContext.request.contextPath}/static/css/style.css" rel='stylesheet' type='text/css' />
</head>
<body>
<h1>商家登陆</h1>
<div class="app-cam">
    <form action="${pageContext.request.contextPath}/sellerController/sellerRegister" method="post">
        <input type="text" class="text" name="sUsername" value="用户名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '用户名';}" >
        <input type="password" value="Password" name="sPassword" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}">
        <hr>
        <input type="text" class="text" name="sMailbox" value="邮箱" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '邮箱';}" >
        <input type="text" class="text" name="sPhone" value="手机号" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '手机号';}" >
        <input type="text" class="text" name="sName" value="昵称" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '昵称';}" >
            <div class="submit"><input type="submit" onclick="myFunction()" value="注册" ></div>
            <div class="buttons">
                <ul>
                    <li><a href="${pageContext.request.contextPath}/sellerController/toSellerLogin" class="hvr-sweep-to-right">登陆</a></li>
                </ul>
            </div>
    </form>
</div>
</body>
</html>