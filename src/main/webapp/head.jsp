<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>头部</title>
    <link href="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/meituan/css/personal.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/meituan/css/systyle.css" rel="stylesheet" type="text/css">

</head>
<body>
    <div class="am-container header">
        <ul class="message-l">
            <div class="topMessage">
                <div class="menu-hd">
                    <%--登陆成功--%>
                    <c:if test="${member!=null}">
                        你好！<a href="#">${member.mUsername}</a>，
                        <a href="/memberController/memberLoginOut">退出登陆</a>
                    </c:if>
                    <c:if test="${member==null}">
                        <a href="member/member_register.jsp">注册</a>
                        <a href="member/member_login.jsp">登录</a>
                    </c:if>
                        <a href="${pageContext.request.contextPath}/memberController/sendMail">发送邮件</a>
                        <a href="/storeController/searchShop">分页查询</a>
                        <a href="/memberController/memberAllList">管理跳转信息</a>
                        <a href="/excelController/excel">导入/导出</a>
                </div>
            </div>
        </ul>
        <ul class="message-r">
            <div class="topMessage home">
                <div class="menu-hd"><a href="#" target="_top" class="h">商家中心</a></div>
            </div>
            <div class="topMessage my-shangcheng">
                <div class="menu-hd MyShangcheng"><a href="${pageContext.request.contextPath}/member/member_center.jsp" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a></div>
            </div>
            <div class="topMessage mini-cart">
                <div class="menu-hd"><a id="mc-menu-hd" href="#" target="_top"><i class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum" class="h">0</strong></a></div>
            </div>
            <div class="topMessage favorite">
                <div class="menu-hd"><a href="#" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a></div>
        </ul>
    </div>
</body>
</html>
