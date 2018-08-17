<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>个人中心</title>
    <link href="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/meituan/css/personal.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/meituan/css/systyle.css" rel="stylesheet" type="text/css">
    <%--动态栏需要的文件--%>
    <link href="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/static/meituan/basic/css/demo.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/meituan/basic/js/jquery-1.7.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/js/amazeui.js"></script>
    <%--自建的--%>
    <link href="${pageContext.request.contextPath}/static/css/seller_goods.css" rel="stylesheet" type="text/css" />
</head>
<body>
<!--tou -->
<header>
    <article>
        <div class="mt-logo">
            <!--顶部导航条 -->
            <jsp:include page="${pageContext.request.contextPath}/head.jsp"></jsp:include>
            <!--悬浮搜索框-->
            <div class="nav white">
                <div class="logoBig">
                    <li>
                        <a href="${pageContext.request.contextPath}/storeController/homeSearch">
                            <img height="100" width="10" src="${pageContext.request.contextPath}/static/meituan/images/logobig3.png" />
                        </a>
                    </li>
                </div>

                <div class="search-bar pr">
                    <a name="index_none_header_sysc" href="#"></a>
                    <form method="post" action="${pageContext.request.contextPath}/storeController/searchShop">
                        <input id="searchInput" name="stoName" type="text" placeholder="输入商店名称" autocomplete="off">
                        <input id="ai-topsearch" class="submit am-btn" value="搜索" index="1" type="submit">
                    </form>
                </div>
            </div>
            <div class="clear"></div>
        </div>
        </div>
    </article>
</header>
<div class="nav-table">

</div>
<b class="line"></b>
<div class="center">
    <div class="col-main">
        <div class="main-wrap">
            <div class="wrap-left">
                <div class="wrap-list">
                    <div class="m-user">
                        <!--个人信息 -->
                        <div class="m-bg"></div>
                        <div class="m-userinfo">
                            <div class="m-baseinfo">
                                <a href="#">
                                    <%--<img src="${pageContext.request.contextPath}/static/meituan/images/getAvatar.do.jpg">--%>
                                    <img src="${member.mPicture}">
                                </a>
                                <em class="s-name">${member.mName}</em>
                            </div>
                        </div>
                    </div>

                    <!--订单 -->
                    <div class="m-order">
                        <div class="s-bar">
                            <i class="s-icon"></i>我的订单
                        </div>
                        <ul>
                            <!--前端动态栏-->
                            <div class="am-tabs" data-am-tabs>
                                <!--头顶的3个标题-->
                                <ul class="am-avg-sm-5 am-tabs-nav am-nav am-nav-tabs">
                                    <!--第一个-->
                                    <li class="am-active"><a id="a_allOrder" href="#"><i><img src="${pageContext.request.contextPath}/static/meituan/images/pay.png"/></i><span>全部订单<em class="m-num" id="em_allOrder"></em></span></a></li>
                                    <!--第二个-->
                                    <li><a id="a_noPayOrder" href="#"><i><img src="${pageContext.request.contextPath}/static/meituan/images/send.png"/></i><span>待付款<em class="m-num" id="em_noPay"></em></span></a></li>
                                    <!--第三个-->
                                    <li><a id="a_noUserOrder" href="#"><i><img src="${pageContext.request.contextPath}/static/meituan/images/receive.png"/></i><span>待使用<em class="m-num" id="em_noUser"></em></span></a></li>
                                    <%--第四个--%>
                                    <li><a id="a_noEvaOrder" href="#"><i><img src="${pageContext.request.contextPath}/static/meituan/images/comment.png"/></i><span>待评价<em class="m-num" id="em_noEva"></em></span></a></li>
                                    <%--个人信息--%>
                                    <li><a id="a_peopleInfo" href="#"><i><img src="${pageContext.request.contextPath}/static/meituan/images/comment.png"/></i><span>个人信息</span></a></li>
                                </ul>

                                <!--标题对应的内容-->
                                <div class="am-tabs-bd">
                                    <!--第一个-->
                                    <div class="am-tab-panel am-fade am-in am-active">
                                        <c:forEach items="${allOrders}" var="allOrders">
                                            <c:set var="allOrder" value="${allOrder+1}"/>
                                            <hr>
                                            <div class="order">
                                                <div class="orderPicture">
                                                    <img width="100" height="80" src="${allOrders.odrPicture}" alt="商品图片" class="img-thumbnail">
                                                </div>
                                                <div class="orderContext">
                                                    ${allOrders.odrName}<br><br><br>
                                                     数量 : ${allOrders.godCount}
                                                </div>
                                                <div class="orderPrice">
                                                    总价 : ${allOrders.odrPrice}
                                                </div>
                                                <div class="orderState">
                                                    <c:if test="${allOrders.odrPaystate==0}">待付款</c:if>
                                                    <c:if test="${allOrders.odrPaystate==1}">
                                                        <c:if test="${allOrders.odrUserstate==0}">待消费</c:if>
                                                    </c:if>
                                                    <c:if test="${allOrders.odrPaystate==1}">
                                                        <c:if test="${allOrders.odrUserstate==1}">
                                                            <c:if test="${allOrders.isEvaluation==0}">待评价</c:if>
                                                        </c:if>
                                                    </c:if>
                                                </div>
                                            </div>
                                            <hr>
                                        </c:forEach>
                                    </div>
                                    <!--第二个-->
                                    <div class="am-tab-panel am-fade">

                                        <c:forEach items="${allOrders}" var="allOrders">
                                            <c:if test="${allOrders.odrPaystate==0}">
                                                <%--待付款的商品个数--%>
                                                <c:set var="noPay" value="${noPay+1}"/>
                                            <hr>
                                            <div class="order">
                                                <div class="orderPicture">
                                                    <img width="100" height="80" src="${allOrders.odrPicture}" alt="商品图片"  class="img-thumbnail">
                                                </div>
                                                <div class="orderContext">
                                                        ${allOrders.odrName}<br><br><br>
                                                    数量 : ${allOrders.godCount}
                                                </div>
                                                <div class="orderPrice">
                                                    总价 : ${allOrders.odrPrice}
                                                </div>
                                                <div class="orderState">
                                                    待付款
                                                </div>
                                            </div>
                                            <hr>
                                            </c:if>
                                        </c:forEach>
                                    </div>
                                    <!--第三个-->
                                    <div class="am-tab-panel am-fade">
                                        <c:forEach items="${allOrders}" var="allOrders">
                                            <%--付款了才可以使用--%>
                                            <c:if test="${allOrders.odrPaystate==1}">
                                            <c:if test="${allOrders.odrUserstate==0}">
                                                <%--待付款的商品个数--%>
                                                <c:set var="noUser" value="${noUser+1}" />
                                                <hr>
                                                <div class="order">
                                                    <div class="orderPicture">
                                                        <img width="100" height="80" src="${allOrders.odrPicture}" alt="商品图片"  class="img-thumbnail">
                                                    </div>
                                                    <div class="orderContext">
                                                            ${allOrders.odrName}<br><br><br>
                                                        数量 : ${allOrders.godCount}
                                                    </div>
                                                    <div class="orderPrice">
                                                        总价 : ${allOrders.odrPrice}
                                                    </div>
                                                    <div class="orderState">
                                                        待使用
                                                    </div>
                                                </div>
                                                <hr>
                                            </c:if>
                                            </c:if>
                                        </c:forEach>
                                    </div>
                                    <!--第四个-->
                                    <div class="am-tab-panel am-fade">
                                        <%--只有付款并且消费了才可以使用--%>
                                        <c:forEach items="${allOrders}" var="allOrders">
                                            <c:if test="${allOrders.odrPaystate==1}">
                                                <c:if test="${allOrders.odrUserstate==1}">
                                                        <c:if test="${allOrders.isEvaluation==0}">
                                                            <%--待付款的商品个数--%>
                                                            <c:set var="noEva" value="${noEva+1}" />
                                                            <hr>
                                                            <div class="order">
                                                                <a href="${pageContext.request.contextPath}/ordersController/toCreatComment?goodsId=${allOrders.godId}&storeId=2">
                                                                    <div class="orderPicture">
                                                                        <img width="100" height="80" src="${allOrders.odrPicture}" alt="商品图片"  class="img-thumbnail">
                                                                    </div>
                                                                    <div class="orderContext">
                                                                            ${allOrders.odrName}<br><br><br>
                                                                        数量 : ${allOrders.godCount}
                                                                    </div>
                                                                    <div class="orderPrice">
                                                                        总价 : ${allOrders.odrPrice}
                                                                    </div>
                                                                    <div class="orderState">
                                                                        待评价
                                                                    </div>
                                                                </a>
                                                            </div>
                                                            <hr>
                                                        </c:if>
                                                    </c:if>
                                                </c:if>
                                        </c:forEach>
                                    </div>
                                    <%--个人信息--%>
                                    <div class="am-tab-panel am-fade">
                                        <div class="people">
                                            <div class="people1">
                                                <h1>个人信息设置</h1>
                                            </div>
                                            <form action="" >
                                                <div class="people1">
                                                    头像：<input type="file" name="">
                                                </div>
                                                <div class="people1">
                                                    昵称：<input type="text">
                                                </div>
                                                <div class="people1">
                                                    密码：<input type="text" name="" id="">
                                                </div>
                                                <div class="people1">
                                                <input type="submit" value="提交">
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <!--底部-->
        <jsp:include page="${pageContext.request.contextPath}/tail.jsp"></jsp:include>
    </div>

    <%--左侧边栏--%>
    <aside class="menu">
        <ul>
            <li class="person active">
                <font color="#ff69b4"> 个人中心</font><br>
            </li>
            <li class="person">
                <font color="red">个人信息</font><br>
                <ul>
                    <li> <a href="#"onclick="toPeopleInfo(); return false;" >个人信息设置</a></li>
                </ul>
            </li>
            <li class="person">
                <font color="red">订单信息</font><br>
                <ul>
                    <li><a href="#" onclick="toAllOrder(); return false;" >全部订单</a></li>
                    <li><a href="#" onclick="toNoPayOrder(); return false;" >待付款</a></li>
                    <li><a href="#" onclick="toNoUserOrder(); return false;" >待使用</a></li>
                    <li><a href="#" onclick="toNoEvaOrder(); return false;">待评价</a></li>
                </ul>
            </li>
            <%--<li class="person">--%>
                <%--<font color="red">我的评价</font><br>--%>
                <%--<ul>--%>
                    <%--<li> <a href="#">已评价</a></li>--%>
                    <%--<li> <a href="#">待评价</a></li>--%>
                <%--</ul>--%>
            <%--</li>--%>
        </ul>
    </aside>
</div>
<%--把值设置到图片上，显示订单件数--%>
<script type="text/javascript">
    $(function(){
        $("#em_noPay").html(${noPay});
        $("#em_allOrder").html(${allOrder});
        $("#em_noUser").html(${noUser});
        $("#em_noEva").html(${noEva});
    });
    //左侧边栏点击跳转
//    订单信息
    function toAllOrder() {
        var a_allOrder=document.getElementById("a_allOrder").click();;
    }
    function toNoPayOrder() {
        var a_noPayOrder=document.getElementById("a_noPayOrder").click();;
    }
    function toNoUserOrder() {
        var a_noUserOrder=document.getElementById("a_noUserOrder").click();;
    }
    function toNoEvaOrder() {
        var a_noEvaOrder=document.getElementById("a_noEvaOrder").click();;
    }
    function toPeopleInfo() {
        var a_peopleInfo=document.getElementById("a_peopleInfo").click();;
    }
</script>
</body>

</html>