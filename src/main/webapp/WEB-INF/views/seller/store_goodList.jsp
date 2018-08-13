<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="">
<head>
    <title>商品列表</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/seller/css/style.css" media="all" />

    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/assets/css/form-elements.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/assets/css/style.css">
</head>
<body>
<div class="testing">
    <header class="main">
        <h1><strong>商店</strong> 列表</h1>
    </header>
    <section class="user">
        <div class="profile-img">
            <p><img src="${pageContext.request.contextPath}/static/seller/images/uiface2.png" alt="" height="40" width="40" /> 商品列表</p>
        </div>
        <!--顶栏上方-->
        <div class="buttons">

            <span class="button">${seller.sName}</span>
            <span class="button blue"><a href="${pageContext.request.contextPath}/sellerController/sellerLogout">退出登陆</a></span>
        </div>
    </section>
</div>
<!--左边侧栏-->
<nav>
    <ul>
        <li><a href="${pageContext.request.contextPath}/sellerController/storeCenter"><span class="icon">&#128196;</span> 商品列表</a></li>
        <li><a href="${pageContext.request.contextPath}/sellerController/toOpenStore"><span class="icon">&#128101;</span> 开店 </a></li>
    </ul>
</nav>

<!--内容-->
<section class="content">
    <section class="widget">
        <header></header>
        <div class="content cycle">
            <table>
                <c:forEach items="${goods}" var="good">
                    <tr>
                        <td>
                            <img alt="商家图片" width="250" height="150" src="${good.godPicture}">
                        </td>
                        <td>
                            <h3>${good.godName}</h3>
                        </td>
                        <td>
                            <del>门店价：￥${good.godStoreprice}</del>
                        </td>
                        <td>
                            折后价：￥${good.godPrice}
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </section>
</section>

</body>
</html>
