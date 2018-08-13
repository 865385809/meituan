<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商家登陆</title>
    <link href="${pageContext.request.contextPath}/static/css/style.css" rel='stylesheet' type='text/css' />
</head>
<body>
<h1>商家登陆</h1>
<div class="app-cam">
    <form action="${pageContext.request.contextPath}/sellerController/sellerLogin" method="post">
        <input type="text" class="text" name="sUsername" value="用户名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '用户名';}" >
        <input type="password" name="sPassword" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}">
        <div class="submit"><input type="submit" onclick="myFunction()" value="登陆" ></div>
        <div class="buttons">
            <ul>
                <li><a href="${pageContext.request.contextPath}/sellerController/toSellerRegister" class="hvr-sweep-to-right">注册</a></li>
            </ul>
        </div>
    </form>
</div>
</body>
</html>