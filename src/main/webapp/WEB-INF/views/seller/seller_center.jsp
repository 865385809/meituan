<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="">
<head>
    <title>商户中心</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/seller/css/style.css" media="all" />

    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/assets/css/form-elements.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/assets/css/style.css">
</head>
<body>
<div class="testing">
    <header class="main">
        <h1><strong>商户</strong> 中心</h1>
    </header>
    <section class="user">
        <div class="profile-img">
            <p><img src="${pageContext.request.contextPath}/static/seller/images/uiface2.png" alt="" height="40" width="40" /> 商店列表</p>
        </div>
        <!--顶栏上方-->
        <div class="buttons">
            <%--<span class="button dropdown">--%>
                <%--<a href="#">Notifications <span class="pip">4</span></a>--%>
            <%--</span>--%>
            <span class="button">${seller.sName}</span>
            <span class="button blue"><a href="${pageContext.request.contextPath}/sellerController/sellerLogout">退出登陆</a></span>
        </div>
    </section>
</div>
<!--左边侧栏-->
<nav>
    <ul>
        <li><a ><span class="icon">&#128196;</span> 商店列表</a></li>
        <li><a href="${pageContext.request.contextPath}/sellerController/toOpenStore"><span class="icon">&#128101;</span> 开店 </a></li>
    </ul>
</nav>

<!--内容-->
<section class="content">
    <section class="widget">
        <header></header>
        <div class="content cycle">
            <table>
                <c:forEach items="${stores}" var="store">
                <tr>
                    <td>
                        <img alt="商家图片" width="250" height="150" src="${store.stoPicture}">
                    </td>
                    <td>
                        <h3>${store.stoName}</h3>
                    </td>
                    <td>
                        <button class="btn btn-primary">
                            <a href="${pageContext.request.contextPath}/sellerController/toAddGoods?stoId=${store.stoId}">
                                添加商品
                            </a>
                        </button>
                    </td>
                    <td>
                        <button class="btn btn-danger">
                            <a href="${pageContext.request.contextPath}/goodsController/goodList?stoId=${store.stoId}">
                                商品列表
                            </a>
                        </button>
                    </td>
                </tr>
                </c:forEach>
            </table>
        </div>
    </section>
</section>
<script type="text/javascript">
    $("#btn_openStore").click(function () {
        <%--window.location.href="${pageContext.request.contextPath}/memberController/toLogin"--%>
        $("#openStore_form").submit();
    });
</script>
</body>
</html>