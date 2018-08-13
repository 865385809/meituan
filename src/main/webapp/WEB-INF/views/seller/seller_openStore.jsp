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
            <p><img src="${pageContext.request.contextPath}/static/seller/images/uiface2.png" alt="" height="40" width="40" /> 开店</p>
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
        <li><a ><span class="icon">&#128101;</span> 开店 </a></li>
        <li><a href="${pageContext.request.contextPath}/sellerController/storeCenter"><span class="icon">&#128196;</span> 商店列表</a></li>
    </ul>
</nav>

<!--内容-->
<section class="content">
    <section class="widget">
        <header></header>
        <div class="content cycle">
            <div class="form-bottom">
                <form action="${pageContext.request.contextPath}/sellerController/openStore" enctype="multipart/form-data" method="post"role="form" id="openStore_form" class="registration-form" >
                    <div class="form-group">
                        <input type="text" name="stoName" placeholder="店名" class="form-first-name form-control">
                    </div>
                    <div class="form-group">
                        <input type="text" name="stoType" placeholder="分类" class="form-last-name form-control" >
                    </div>
                    <div class="form-group">
                        <input type="text" name="stoCity" placeholder="城市" class="form-email form-control" >
                    </div>
                    <div class="form-group">
                        <input type="text" name="stoClassify" placeholder="种类" class="form-email form-control" >
                    </div>
                    <div class="form-group">
                        <textarea  name="stoAddress" placeholder="详细地址" class="form-email form-control" ></textarea>
                    </div>
                    <div class="form-group">
                        <input type="text" name="stoPrice" placeholder="人均价格" class="form-email form-control" >
                    </div>
                    <div class="form-group">
                        <input type="file" name="upload" placeholder="商店图片" class="form-email form-control" >
                    </div>
                    <div class="form-group">
                        <input type="text" name="stoTel" placeholder="店铺电话号码" class="form-email form-control" >
                    </div>
                    <div class="form-group">
                        <input type="text" name="stoTime" placeholder="营业时间" class="form-email form-control" >
                    </div>
                    <div class="form-group">
                        <input type="hidden" name="sellerId" placeholder="商户ID" value="${seller.sId}" class="form-email form-control" >
                    </div>
                    <%--<input type="submit" value="开店" class="btn" id="btn_openStore"/>--%>
                    <button type="submit" class="btn" id="btn_openStore">开店</button>
                </form>
            </div>
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