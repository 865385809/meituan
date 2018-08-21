<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>头部</title>
    <link href="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/meituan/css/personal.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/meituan/css/systyle.css" rel="stylesheet" type="text/css">
    <%--bookstrap--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.12.4.min.js"></script>
    <link href="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

</head>
<body>
    <div class="am-container header">
        <ul class="message-l">
            <div class="topMessage">
                <div class="menu-hd">
                    <%--登陆成功--%>
                    <c:if test="${member!=null}">
                        你好！<a href="${pageContext.request.contextPath}/ordersController/memberCenter" target="_blank">
                        <font color="#7fffd4">${member.mName}</font></a>
                        <a href="${pageContext.request.contextPath}/memberController/memberLoginOut">退出登陆</a>
                    </c:if>
                    <c:if test="${member==null}">
                        <a href="${pageContext.request.contextPath}/memberController/toRegister">注册</a>
                        <a href="${pageContext.request.contextPath}/memberController/toLogin">登录</a>
                    </c:if>
                        <a href="${pageContext.request.contextPath}/memberController/sendMail">发送邮件</a>
                        <a href="${pageContext.request.contextPath}/goodsController/creatOrder?godId=2&stoName=啦啦啦&stoId=20">抢购</a>
                        <%--<a href="/storeController/searchShop">分页查询</a>--%>
                        <%--<a href="/memberController/memberAllList">管理跳转信息</a>--%>
                        <%--<a href="/excelController/excel">导入/导出</a>--%>
                </div>
            </div>
        </ul>
        <ul class="message-r">
            <div class="topMessage home">
                <div class="menu-hd">
                    <a href="${pageContext.request.contextPath}/sellerController/storeCenter" target="_top" class="h">商家中心</a>
                </div>
            </div>
            <div class="topMessage my-shangcheng">
                <div class="menu-hd MyShangcheng">
                    <a href="${pageContext.request.contextPath}/ordersController/memberCenter" target="_blank">
                        <i class="am-icon-user am-icon-fw"></i>个人中心
                    </a>
                </div>
            </div>
        </ul>
    </div>
</body>
</html>
