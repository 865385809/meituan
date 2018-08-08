<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>商品页面</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.12.4.min.js"></script>
    <link href="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

    <link href="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/static/meituan/basic/css/demo.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/static/meituan/css/cartstyle.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/static/meituan/css/jsstyle.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/meituan/js/address.js"></script>
    <%--自建的css--%>
    <link href="${pageContext.request.contextPath}/static/css/seller_goods.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/meituan/basic/js/jquery-1.7.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/meituan/js/script.js"></script>

</head>
<body>
<!--顶部导航条 -->
<jsp:include page="${pageContext.request.contextPath}/head.jsp"></jsp:include>
<!--悬浮搜索框-->
<div class="nav white">
    <div class="logoBig">
        <li><img height="100" width="10" src="${pageContext.request.contextPath}/static/meituan/images/logobig3.png" /></li>
    </div>
    <div class="search-bar pr">
        <a name="index_none_header_sysc" href="#"></a>
        <form>
            <input id="searchInput" name="index_none_header_sysc" type="text" placeholder="" autocomplete="off">
            <input id="ai-topsearch" class="submit am-btn"  value="搜索" index="1" type="submit">
        </form>
    </div>
</div>
<div class="clear"></div>
<b class="line"></b>

        <!--订单 -->
        <div class="concent">
                <br><br><br><br><br>
                <%--商品表头--%>
                <div class="cart-table-th">
                    <div class="wp">
                        <div class="th th-item">
                            <div class="td-inner">商品信息</div>
                        </div>
                        <div class="th th-price">
                            <div class="td-inner">单价</div>
                        </div>
                        <div class="th th-amount">
                            <div class="td-inner">数量</div>
                        </div>
                        <div class="th th-sum">
                            <div class="td-inner">金额</div>
                        </div>
                    </div>
                </div>
                <tr class="item-list">
                    <div class="bundle  bundle-last">
                        <div class="bundle-main">
                            <ul class="item-content clearfix">
                                <%--商品信息--%>
                                <li class="td td-item">
                                    <div class="item-pic">
                                        <a href="#" class="J_MakePoint">
                                            <img src="${pageContext.request.contextPath}/static/meituan/images/kouhong.jpg_80x80.jpg" class="itempic J_ItemImg"></a>
                                    </div>
                                    <div class="item-info">
                                        <div class="item-basic-info">
                                            <a href="#" class="item-title J_MakePoint" data-point="tbcart.8.11">美康粉黛醉美唇膏 持久保湿滋润防水不掉色</a>
                                        </div>
                                    </div>
                                </li>
                                <li class="td td-price">
                                        <div class="item-price price-promo-promo">
                                            <div class="price-content">
                                                <em class="J_Price price-now">39.00</em>
                                            </div>
                                        </div>
                                    </li>
                                <%--加法--%>
                                <li class="td td-amount">
                                    <div class="amount-wrapper ">
                                        <div class="item-amount ">
                                            <span class="phone-title">购买数量</span>
                                            <div class="sl">
                                                <input class="min am-btn" name="" type="button" value="-" />
                                                <input class="text_box" name="" type="text" value="3" style="width:30px;" />
                                                <input class="add am-btn" name="" type="button" value="+" />
                                            </div>
                                        </div>
                                    </div>
                                </li>
                                <%--总数--%>
                                <li class="td td-sum">
                                    <div class="td-inner">
                                        <em tabindex="0" class="J_ItemSum number">117.00</em>
                                    </div>
                                </li>
                            </ul>
                            <div class="clear"></div>
                        </div>
                    </div>
                </tr>
        </div>
        <!--含运费小计 -->
        <div class="buy-point-discharge ">
            <p class="price g_price ">
                合计（含运费） <span>¥</span><em class="pay-sum">244.00</em>
            </p>
        </div>
        <!--信息 -->
        <div class="order-go clearfix">
            <div class="pay-confirm clearfix">
                <div class="box">
                    <div tabindex="0" id="holyshit267" class="realPay"><em class="t">实付款：</em>
                        <span class="price g_price ">
                            <span>¥</span> <em class="style-large-bold-red " id="J_ActualFee">244.00</em>
                        </span>
                    </div>
                </div>
                <div id="holyshit269" class="submitOrder">
                    <div class="go-btn-wrap">
                        <a id="J_Go" href="success.html" class="btn-go" tabindex="0" title="点击此按钮，提交订单">提交订单</a>
                    </div>
                </div>
                <div class="clear"></div>
            </div>
        </div>
<jsp:include page="${pageContext.request.contextPath}/tail.jsp"></jsp:include>
</body>
</html>
