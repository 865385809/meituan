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
</head>
<body>
<!--头 -->
<header>
    <article>
        <div class="mt-logo">
            <!--顶部导航条 -->
            <jsp:include page="${pageContext.request.contextPath}/head.jsp"></jsp:include>

            <!--悬浮搜索框-->
            <div class="nav white">
                <div class="logoBig">
                    <li><img height="100" src="${pageContext.request.contextPath}/static/meituan/images/logobig3.png" /></li>
                </div>

                <div class="search-bar pr">
                    <a name="index_none_header_sysc" href="#"></a>
                    <form>
                        <input id="searchInput" name="index_none_header_sysc" type="text" placeholder="搜索" autocomplete="off">
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
                                <a href="information.html">
                                    <img src="${pageContext.request.contextPath}/static/meituan/images/getAvatar.do.jpg">
                                </a>
                                <em class="s-name">(小叮当)<span class="vip1"></em>
                                <div class="s-prestige am-btn am-round">
                                    </span>会员福利</div>
                            </div>
                            <div class="m-right">
                                <div class="m-new">
                                    <a href="news.html"><i class="am-icon-bell-o"></i>消息</a>
                                </div>
                                <div class="m-address">
                                    <a href="address.html" class="i-trigger">我的收货地址</a>
                                </div>
                            </div>
                        </div>

                    </div>
                    <div class="box-container-bottom"></div>

                    <!--订单 -->
                    <div class="m-order">
                        <div class="s-bar">
                            <i class="s-icon"></i>我的订单
                            <a class="i-load-more-item-shadow" href="order.html">全部订单</a>
                        </div>
                        <ul>
                            <li><a href="order.html"><i><img src="${pageContext.request.contextPath}/static/meituan/images/pay.png"/></i><span>全部订单</span></a></li>
                            <li><a href="order.html"><i><img src="${pageContext.request.contextPath}/static/meituan/images/send.png"/></i><span>待付款<em class="m-num">1</em></span></a></li>
                            <li><a href="order.html"><i><img src="${pageContext.request.contextPath}/static/meituan/images/receive.png"/></i><span>待使用</span></a></li>
                            <li><a href="order.html"><i><img src="${pageContext.request.contextPath}/static/meituan/images/comment.png"/></i><span>待评价<em class="m-num">3</em></span></a></li>
                        </ul>
                    </div>

                    <!--收藏夹 -->
                    <div class="you-like">
                        <div class="s-bar">猜你喜欢
                            <a class="am-badge am-badge-danger am-round">降价</a>
                            <a class="am-badge am-badge-danger am-round">下架</a>
                            <a class="i-load-more-item-shadow" href="#"><i class="am-icon-refresh am-icon-fw"></i>换一组</a>
                        </div>
                        <div class="s-content">
                            <div class="s-item-wrap">
                                <div class="s-item">

                                    <div class="s-pic">
                                        <a href="#" class="s-pic-link">
                                            <img src="${pageContext.request.contextPath}/static/meituan/images/0-item_pic.jpg_220x220.jpg" alt="包邮s925纯银项链女吊坠短款锁骨链颈链日韩猫咪银饰简约夏配饰" title="包邮s925纯银项链女吊坠短款锁骨链颈链日韩猫咪银饰简约夏配饰" class="s-pic-img s-guess-item-img">
                                        </a>
                                    </div>
                                    <div class="s-price-box">
                                        <span class="s-price"><em class="s-price-sign">¥</em><em class="s-value">42.50</em></span>
                                        <span class="s-history-price"><em class="s-price-sign">¥</em><em class="s-value">68.00</em></span>

                                    </div>
                                    <div class="s-title"><a href="#" title="包邮s925纯银项链女吊坠短款锁骨链颈链日韩猫咪银饰简约夏配饰">包邮s925纯银项链女吊坠短款锁骨链颈链日韩猫咪银饰简约夏配饰</a></div>
                                    <div class="s-extra-box">
                                        <span class="s-comment">好评: 98.03%</span>
                                        <span class="s-sales">月销: 219</span>

                                    </div>
                                </div>
                            </div>

                            <div class="s-item-wrap">
                                <div class="s-item">

                                    <div class="s-pic">
                                        <a href="#" class="s-pic-link">
                                            <img src="${pageContext.request.contextPath}/static/meituan/images/1-item_pic.jpg_220x220.jpg" alt="s925纯银千纸鹤锁骨链短款简约时尚韩版素银项链小清新秋款女配饰" title="s925纯银千纸鹤锁骨链短款简约时尚韩版素银项链小清新秋款女配饰" class="s-pic-img s-guess-item-img">
                                        </a>
                                    </div>
                                    <div class="s-price-box">
                                        <span class="s-price"><em class="s-price-sign">¥</em><em class="s-value">49.90</em></span>
                                        <span class="s-history-price"><em class="s-price-sign">¥</em><em class="s-value">88.00</em></span>

                                    </div>
                                    <div class="s-title"><a href="#" title="s925纯银千纸鹤锁骨链短款简约时尚韩版素银项链小清新秋款女配饰">s925纯银千纸鹤锁骨链短款简约时尚韩版素银项链小清新秋款女配饰</a></div>
                                    <div class="s-extra-box">
                                        <span class="s-comment">好评: 99.74%</span>
                                        <span class="s-sales">月销: 69</span>

                                    </div>
                                </div>
                            </div>

                            <div class="s-item-wrap">
                                <div class="s-item">

                                    <div class="s-pic">
                                        <a href="#" class="s-pic-link">
                                            <img src="${pageContext.request.contextPath}/static/meituan/images/-0-saturn_solar.jpg_220x220.jpg" alt="4折抢购!十二生肖925银女戒指,时尚开口女戒" title="4折抢购!十二生肖925银女戒指,时尚开口女戒" class="s-pic-img s-guess-item-img">
                                        </a>
                                    </div>
                                    <div class="s-price-box">
                                        <span class="s-price"><em class="s-price-sign">¥</em><em class="s-value">378.00</em></span>
                                        <span class="s-history-price"><em class="s-price-sign">¥</em><em class="s-value">1888.00</em></span>

                                    </div>
                                    <div class="s-title"><a href="#" title="4折抢购!十二生肖925银女戒指,时尚开口女戒">4折抢购!十二生肖925银女戒指,时尚开口女戒</a></div>
                                    <div class="s-extra-box">
                                        <span class="s-comment">好评: 99.93%</span>
                                        <span class="s-sales">月销: 278</span>

                                    </div>
                                </div>
                            </div>

                            <div class="s-item-wrap">
                                <div class="s-item">

                                    <div class="s-pic">
                                        <a href="#" class="s-pic-link">
                                            <img src="${pageContext.request.contextPath}/static/meituan/images/0-item_pic.jpg_220x220.jpg" alt="包邮s925纯银项链女吊坠短款锁骨链颈链日韩猫咪银饰简约夏配饰" title="包邮s925纯银项链女吊坠短款锁骨链颈链日韩猫咪银饰简约夏配饰" class="s-pic-img s-guess-item-img">
                                        </a>
                                    </div>
                                    <div class="s-price-box">
                                        <span class="s-price"><em class="s-price-sign">¥</em><em class="s-value">42.50</em></span>
                                        <span class="s-history-price"><em class="s-price-sign">¥</em><em class="s-value">68.00</em></span>

                                    </div>
                                    <div class="s-title"><a href="#" title="包邮s925纯银项链女吊坠短款锁骨链颈链日韩猫咪银饰简约夏配饰">包邮s925纯银项链女吊坠短款锁骨链颈链日韩猫咪银饰简约夏配饰</a></div>
                                    <div class="s-extra-box">
                                        <span class="s-comment">好评: 98.03%</span>
                                        <span class="s-sales">月销: 219</span>

                                    </div>
                                </div>
                            </div>

                            <div class="s-item-wrap">
                                <div class="s-item">

                                    <div class="s-pic">
                                        <a href="#" class="s-pic-link">
                                            <img src="${pageContext.request.contextPath}/static/meituan/images/1-item_pic.jpg_220x220.jpg" alt="s925纯银千纸鹤锁骨链短款简约时尚韩版素银项链小清新秋款女配饰" title="s925纯银千纸鹤锁骨链短款简约时尚韩版素银项链小清新秋款女配饰" class="s-pic-img s-guess-item-img">
                                        </a>
                                    </div>
                                    <div class="s-price-box">
                                        <span class="s-price"><em class="s-price-sign">¥</em><em class="s-value">49.90</em></span>
                                        <span class="s-history-price"><em class="s-price-sign">¥</em><em class="s-value">88.00</em></span>

                                    </div>
                                    <div class="s-title"><a href="#" title="s925纯银千纸鹤锁骨链短款简约时尚韩版素银项链小清新秋款女配饰">s925纯银千纸鹤锁骨链短款简约时尚韩版素银项链小清新秋款女配饰</a></div>
                                    <div class="s-extra-box">
                                        <span class="s-comment">好评: 99.74%</span>
                                        <span class="s-sales">月销: 69</span>

                                    </div>
                                </div>
                            </div>

                            <div class="s-item-wrap">
                                <div class="s-item">

                                    <div class="s-pic">
                                        <a href="#" class="s-pic-link">
                                            <img src="${pageContext.request.contextPath}/static/meituan/images/-0-saturn_solar.jpg_220x220.jpg" alt="4折抢购!十二生肖925银女戒指,时尚开口女戒" title="4折抢购!十二生肖925银女戒指,时尚开口女戒" class="s-pic-img s-guess-item-img">
                                        </a>
                                    </div>
                                    <div class="s-price-box">
                                        <span class="s-price"><em class="s-price-sign">¥</em><em class="s-value">378.00</em></span>
                                        <span class="s-history-price"><em class="s-price-sign">¥</em><em class="s-value">1888.00</em></span>

                                    </div>
                                    <div class="s-title"><a href="#" title="4折抢购!十二生肖925银女戒指,时尚开口女戒">4折抢购!十二生肖925银女戒指,时尚开口女戒</a></div>
                                    <div class="s-extra-box">
                                        <span class="s-comment">好评: 99.93%</span>
                                        <span class="s-sales">月销: 278</span>

                                    </div>
                                </div>
                            </div>

                        </div>

                        <div class="s-more-btn i-load-more-item" data-screen="0"><i class="am-icon-refresh am-icon-fw"></i>更多</div>

                    </div>

                </div>
            </div>
        </div>
        <!--底部-->
        <jsp:include page="${pageContext.request.contextPath}/tail.jsp"></jsp:include>
    </div>

    <aside class="menu">
        <ul>
            <li class="person active">
                <a href="index.html">个人中心</a>
            </li>
            <li class="person">
                <a href="#">个人信息</a>
                <ul>
                    <li> <a href="information.html">个人信息设置</a></li>
                </ul>
            </li>
            <li class="person">
                <a href="#">订单信息</a>
                <ul>
                    <li><a href="order.html">代付款</a></li>
                    <li> <a href="change.html">代使用</a></li>
                    <li> <a href="change.html">代评价</a></li>
                    <li> <a href="change.html">售后</a></li>
                </ul>
            </li>
            <li class="person">
                <a href="#">我的收藏</a>
                <ul>
                    <li> <a href="coupon.html">收藏的商家 </a></li>
                    <li> <a href="bonus.html">收藏的商品</a></li>
                </ul>
            </li>

            <li class="person">
                <a href="#">我的评价</a>
                <ul>
                    <li> <a href="collection.html">已评价</a></li>
                    <li> <a href="foot.html">待评价</a></li>
                </ul>
            </li>
        </ul>
    </aside>
</div>

</body>

</html>