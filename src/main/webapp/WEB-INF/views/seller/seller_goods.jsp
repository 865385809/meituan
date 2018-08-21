<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>商品页面</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.12.4.min.js"></script>
    <link href="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

    <link href="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/static/meituan/basic/css/demo.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/static/meituan/css/seastyle.css" rel="stylesheet" type="text/css" />
    <%--自建的css--%>
    <link href="${pageContext.request.contextPath}/static/css/seller_goods.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/meituan/basic/js/jquery-1.7.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/meituan/js/script.js"></script>
    <style type="text/css">
        .goodsLogin{
            width:500px;
            height:150px;
            position:absolute;
            left:300px;
            top:200px;
        }
    </style>
</head>
<body>
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
<b class="line"></b>

<div class="search">
    <div class="search-list">
        <div class="nav-table"></div>
        <div class="am-g am-g-fixed">
            <div class="am-u-sm-12 am-u-md-12">
                <%--相关搜索--%>
                    <%--选择分类--%>
                        <div id="ka">
                            <div id="ka1">
                                <div class="font1">
                                    ${store.stoName}
                                </div><br>
                                人均￥${store.stoPrice}
                            </div>
                            <div id="ka2">
                                地址 : ${store.stoAddress}<br><br>
                                电话 : ${store.stoTel}
                            </div>
                            <div id="ka3">
                                营业时间 : ${store.stoTime}
                            </div>
                            <div id="ka4">
                                <img src="${store.stoPicture}">
                            </div>
                        </div>
                        <div class="clear"></div>
                <%--分页上边的栏--%>
                <div class="search-content">
                    <div class="sort"></div>
                    <div class="clear"></div>
                    <%--商品展示--%>
                    <div class="font2">商家团购及优惠</div>

                        <div id="goodsList">
                            <c:if test="${member!=null}">
                                <div class="font3">${goodsList.size()}款优惠商品</div>
                                <c:forEach items="${goodsList}" var="goods">
                                    <div class="goods">
                                        <div class="goodsPicture">
                                            <img src="${goods.godPicture}">
                                        </div>
                                        <div class="goodsContext">
                                            ${goods.godName}<br><br><br>
                                            <div class="font4">￥${goods.godPrice}</div>
                                            <div class="font5"><del>门店价￥${goods.godStoreprice}</del></div>
                                        </div>
                                        <div class="goodsButton">
                                            <%--<button  class="btn btn-warning payment_btn btn_buy" >--%>
                                               <%--<a href="${pageContext.request.contextPath}/goodsController/creatOrder?godId=${goods.godId}&stoName=${store.stoName}&stoId=${store.stoId}">--%>
                                                <a href="#" class="btn btn-warning payment_btn btn_buy" onclick="buyGood('${goods.godId}');return false;" >
                                                    立即抢购
                                                </a>
                                            <%--</button>--%>
                                        </div>
                                    </div>
                                </c:forEach>
                            </c:if>
                            <c:if test="${member==null}">
                                <div class="goodsLogin">
                                    <div class="font1">查看更多商品优惠</div>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    <button id="btn_login" class="btn btn-info btn-primary btn-lg">登陆</button>
                                </div>
                            </c:if>
                    </div>
                    <%--抢购提交用的表单--%>
                    <form id="buy_form" method="post" action="${pageContext.request.contextPath}/goodsController/creatOrder">
                        <input type="hidden" name="stoName" value=${store.stoName}>
                        <input type="hidden" name="stoId" value=stoId=${store.stoId}>
                        <input type="hidden" name="godId" id="goodId" value="">
                    </form>
                    <script type="text/javascript">
                        function buyGood(goodId) {
                            document.getElementById("goodId").value = goodId;
                            document.getElementById("buy_form").submit();
                        }
                        $("#btn_login").click(function () {
                            window.location.href="${pageContext.request.contextPath}/memberController/toLogin"
                        });
                    </script>
                </div>
                <%--猜你喜欢--%>
                <div class="search-side">
                    <div class="side-title">
                        猜你喜欢
                    </div>
                    <li>
                        <div class="i-pic check">
                            <img src="${pageContext.request.contextPath}/static/meituan/images/cp.jpg" />
                            <p class="check-title">萨拉米 1+1小鸡腿</p>
                            <p class="price fl">
                                <b>¥</b>
                                <strong>29.90</strong>
                            </p>
                            <p class="number fl">
                                销量<span>1110</span>
                            </p>
                        </div>
                    </li>
                    <li>
                        <div class="i-pic check">
                            <img src="${pageContext.request.contextPath}/static/meituan/images/cp2.jpg" />
                            <p class="check-title">ZEK 原味海苔</p>
                            <p class="price fl">
                                <b>¥</b>
                                <strong>8.90</strong>
                            </p>
                            <p class="number fl">
                                销量<span>1110</span>
                            </p>
                        </div>
                    </li>
                </div>
                <div class="clear"></div>

            </div>
        </div>
        <!--底部-->
        <jsp:include page="${pageContext.request.contextPath}/tail.jsp"></jsp:include>
    </div>
</div>
</body>
</html>
