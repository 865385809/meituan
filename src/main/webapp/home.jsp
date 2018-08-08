<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <%--<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />--%>
    <%--<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">--%>
    <title>美团网</title>
    <link href="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/static/meituan/basic/css/demo.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/static/meituan/css/hmstyle.css" rel="stylesheet" type="text/css" />
    <script src="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>
        <%--点击进行分页搜索--%>
        <script type="text/javascript">
            function conditionPage(stoType,stoClassify) {
                document.getElementById("setStoType").value=stoType;
                document.getElementById("setStoClassify").value=stoClassify;
                $("#form1").submit();
            }
    </script>
</head>

<body>
<%--搜索栏--%>
<div class="hmtop">
    <!--顶部导航条 -->
    <jsp:include page="${pageContext.request.contextPath}/head.jsp"></jsp:include>
    <!--悬浮搜索框-->
    <div class="nav white">
        <div class="logoBig">
            <li>
                <a href="${pageContext.request.contextPath}/home.jsp">
                    <img height="100" width="10" src="${pageContext.request.contextPath}/static/meituan/images/logobig3.png" />
                </a>
            </li>
        </div>

        <div class="search-bar pr">
            <a name="index_none_header_sysc" href="#"></a>
            <form>
                <input id="searchInput" name="index_none_header_sysc" type="text" placeholder="输入商家" autocomplete="off">
                <input id="ai-topsearch" class="submit am-btn" value="搜索" index="1" type="submit">
            </form>
        </div>
    </div>
    <div class="clear"></div>
</div>
<b class="line"></b>
<%--轮播图上面的那栏--%>
<div class="shopNav">
    <div class="slideall" style="height: auto;">
        <div class="long-title"><span class="all-goods">全部分类</span></div>
        <div class="nav-cont">
            <ul>
                <li class="index"><a href="#" onclick="conditionPage('外卖','');return false;">美团外卖</a></li>
                <li class="qc"><a href="#"  onclick="conditionPage('酒店','');return false;">酒店</a></li>
                <li class="qc last"><a href="#"  onclick="conditionPage('电影','');return false;">电影</a></li>
            </ul>
        </div>
        <div class="bannerTwo">
            <!--轮播 -->
            <div class="am-slider am-slider-default scoll" data-am-flexslider id="demo-slider-0">
                <ul class="am-slides">
                    <li class="banner1"><a  href="#" onclick="conditionPage('电影','');return false;" target="_blank"><img src="${pageContext.request.contextPath}/static/meituan/images/lunbo4.jpg" /></a></li>
                    <li class="banner2"><a href="#" onclick="conditionPage('美食','');return false;" target="_blank"><img src="${pageContext.request.contextPath}/static/meituan/images/lunbo5.jpg" /></a></li>
                    <li class="banner3"><a href="#" onclick="conditionPage('生活服务','');return false;" target="_blank"><img src="${pageContext.request.contextPath}/static/meituan/images/lunbo2.jpg" /></a></li>
                    <li class="banner4"><a href="#" onclick="conditionPage('外卖','');return false;" target="_blank"><img src="${pageContext.request.contextPath}/static/meituan/images/lunbo3.jpg" /></a></li>
                </ul>
            </div>
            <div class="clear"></div>
        </div>


        <form id="form1" method="post" action="${pageContext.request.contextPath}/storeController/searchShop">
            <input type="hidden" id="setStoType" name="stoType">
            <input type="hidden" id="setStoClassify" name="stoClassify">
        </form>
        <!--左边侧边导航 -->
        <div id="nav" class="navfull" style="position: static;">
            <div class="area clearfix">
                <div class="category-content" id="guide_2">

                    <div class="category" style="box-shadow:none ;margin-top: 2px;">
                        <ul class="category-list navTwo" id="js_climit_li">
                            <li>
                                <div class="category-info">
                                    <h3 class="category-name b-category-name">
                                        <i>
                                            <img src="${pageContext.request.contextPath}/static/meituan/images/cake.png">
                                        </i><a class="ml-22" title="美食" href="#" onclick="conditionPage('美食','');return false;">美食</a>
                                    </h3>
                                    <em>&gt;</em></div>
                                <div class="menu-item menu-in top">
                                    <div class="area-in">
                                        <div class="area-bg">
                                            <div class="menu-srot">
                                                <div class="sort-side">
                                                    <dl class="dl-sort">
                                                        <dt><span title="美食">美食</span></dt>
                                                        <dd><a title="快餐" href="#" onclick="conditionPage('','快餐');return false;"><span>快餐</span></a></dd>
                                                        <dd><a title="火锅" href="#" onclick="conditionPage('','火锅');return false;"><span>火锅</span></a></dd>
                                                        <dd><a title="甜品" href="#" onclick="conditionPage('','甜品');return false;"><span>甜品</span></a></dd>
                                                        <dd><a title="烧烤" href="#" onclick="conditionPage('','烧烤');return false;"><span>烧烤</span></a></dd>
                                                        <dd><a title="海鲜" href="#" onclick="conditionPage('','海鲜');return false;"><span>海鲜</span></a></dd>
                                                        <dd><a title="自助餐" href="#" onclick="conditionPage('','自助餐');return false;"><span>自助餐</span></a></dd>
                                                        <dd><a title="西餐" href="#" onclick="conditionPage('','西餐');return false;"><span>西餐</span></a></dd>
                                                    </dl>

                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <b class="arrow"></b>
                            </li>
                            <li >
                                <div class="category-info">
                                    <h3 class="category-name b-category-name">
                                        <i>
                                            <img src="${pageContext.request.contextPath}/static/meituan/images/cookies.png">
                                        </i>
                                        <a class="ml-22" title="外卖" href="#" onclick="conditionPage('外卖','');return false;">外卖</a>
                                    </h3>
                                    <em>&gt;</em></div>
                                <div class="menu-item menu-in top">
                                    <div class="area-in">
                                        <div class="area-bg">
                                            <div class="menu-srot">
                                                <div class="sort-side">
                                                    <dl class="dl-sort">
                                                        <dt><span title="美团外卖">美团外卖</span></dt>
                                                        <dd><a title="快餐" href="#" onclick="conditionPage('','快餐');return false;"><span>快餐</span></a></dd>
                                                        <dd><a title="火锅" href="#" onclick="conditionPage('','火锅');return false;"><span>火锅</span></a></dd>
                                                        <dd><a title="甜品" href="#" onclick="conditionPage('','甜品');return false;"><span>甜品</span></a></dd>
                                                        <dd><a title="烧烤" href="#" onclick="conditionPage('','烧烤');return false;"><span>烧烤</span></a></dd>
                                                        <dd><a title="海鲜" href="#" onclick="conditionPage('','海鲜');return false;"><span>海鲜</span></a></dd>
                                                        <dd><a title="自助餐" href="#" onclick="conditionPage('','自助餐');return false;"><span>自助餐</span></a></dd>
                                                        <dd><a title="西餐" href="#" onclick="conditionPage('','西餐');return false;"><span>西餐</span></a></dd>
                                                    </dl>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <b class="arrow"></b>
                            </li>
                            <li >
                                <div class="category-info">
                                    <h3 class="category-name b-category-name">
                                        <i>
                                            <img src="${pageContext.request.contextPath}/static/meituan/images/meat.png">
                                        </i><a class="ml-22" title="酒店" href="#" onclick="conditionPage('酒店','');return false;">酒店</a></h3>
                                    <em>&gt;</em></div>
                                <div class="menu-item menu-in top">
                                    <div class="area-in">
                                        <div class="area-bg">
                                            <div class="menu-srot">
                                                <div class="sort-side">
                                                    <dl class="dl-sort">
                                                        <dt><span title="酒店">酒店</span></dt>
                                                        <dd><a title="经济型" href="#" onclick="conditionPage('','经济型');return false;"><span>经济型</span></a></dd>
                                                        <dd><a title="舒适/三星" href="#" onclick="conditionPage('','舒适/三星');return false;"><span>舒适/三星</span></a></dd>
                                                        <dd><a title="高档/四星" href="#" onclick="conditionPage('','高档/四星');return false;"><span>高档/四星</span></a></dd>
                                                        <dd><a title="豪华/五星" href="#" onclick="conditionPage('','豪华/五星');return false;"><span>豪华/五星</span></a></dd>
                                                    </dl>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <b class="arrow"></b>
                            </li>
                            <li >
                                <div class="category-info">
                                    <h3 class="category-name b-category-name">
                                        <i>
                                            <img src="${pageContext.request.contextPath}/static/meituan/images/bamboo.png">
                                        </i><a class="ml-22" title="电影"  href="#" onclick="conditionPage('电影','');return false;">电影</a></h3>
                                    <em>&gt;</em></div>
                                <div class="menu-item menu-in top">
                                    <div class="area-in">
                                        <div class="area-bg">
                                            <div class="menu-srot">
                                                <div class="sort-side">
                                                    <dl class="dl-sort">
                                                        <dt><span title="电影">电影</span></dt>
                                                        <dd><a title="惊悚" href="#" onclick="conditionPage('','惊悚');return false;"><span>惊悚</span></a></dd>
                                                        <dd><a title="喜剧" href="#" onclick="conditionPage('','喜剧');return false;"><span>喜剧</span></a></dd>
                                                        <dd><a title="动作" href="#" onclick="conditionPage('','动作');return false;"><span>动作</span></a></dd>
                                                        <dd><a title="悬疑" href="#" onclick="conditionPage('','悬疑');return false;"><span>悬疑</span></a></dd>
                                                    </dl>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <b class="arrow"></b>
                            </li>
                            <li >
                                <div class="category-info">
                                    <h3 class="category-name b-category-name">
                                        <i>
                                            <img src="${pageContext.request.contextPath}/static/meituan/images/nut.png">
                                        </i><a class="ml-22" title="生活服务" href="#" onclick="conditionPage('生活服务','');return false;">生活服务</a></h3>
                                    <em>&gt;</em></div>
                                <div class="menu-item menu-in top">
                                    <div class="area-in">
                                        <div class="area-bg">
                                            <div class="menu-srot">
                                                <div class="sort-side">
                                                    <dl class="dl-sort">
                                                        <dt><span title="生活">生活</span></dt>
                                                        <dd><a title="电脑维修" href="#" onclick="conditionPage('','电脑维修');return false;"><span>电脑维修</span></a></dd>
                                                        <dd><a title="手机维修" href="#" onclick="conditionPage('','手机维修');return false;"><span>手机维修</span></a></dd>
                                                        <dd><a title="送水" href="#" onclick="conditionPage('','送水');return false;"><span>送水</span></a></dd>
                                                    </dl>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <b class="arrow"></b>
                            </li>
                            <li >
                                <div class="category-info">
                                    <h3 class="category-name b-category-name">
                                        <i>
                                            <img src="${pageContext.request.contextPath}/static/meituan/images/candy.png">
                                        </i><a class="ml-22" title="机票/火车票" href="#" onclick="conditionPage('机票/火车票','');return false;">机票/火车票</a></h3>
                                    <em>&gt;</em></div>
                                <div class="menu-item menu-in top">
                                    <div class="area-in">
                                        <div class="area-bg">
                                            <div class="menu-srot">
                                                <div class="sort-side">
                                                    <dl class="dl-sort">
                                                        <dt><span title="票">票</span></dt>
                                                        <dd><a title="国内机票" href="#" onclick="conditionPage('','国内机票');return false;"><span>国内机票</span></a></dd>
                                                        <dd><a title="国外机票" href="#" onclick="conditionPage('','国外机票');return false;"><span>国外机票</span></a></dd>
                                                        <dd><a title="火车票" href="#" onclick="conditionPage('','火车票');return false;"><span>火车票</span></a></dd>
                                                    </dl>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <b class="arrow"></b>
                            </li>
                            <li >
                                <div class="category-info">
                                    <h3 class="category-name b-category-name">
                                        <i>
                                            <img src="${pageContext.request.contextPath}/static/meituan/images/chocolate.png">
                                        </i><a class="ml-22" title="亲子/儿童乐园" href="#" onclick="conditionPage('亲子/儿童乐园','');return false;">亲子/儿童乐园</a></h3>
                                    <em>&gt;</em></div>
                                <div class="menu-item menu-in top">
                                    <div class="area-in">
                                        <div class="area-bg">
                                            <div class="menu-srot">
                                                <div class="sort-side">
                                                    <dl class="dl-sort">
                                                        <dt><span title="亲子/儿童">亲子/儿童</span></dt>
                                                        <dd><a title="少儿英语" href="#" onclick="conditionPage('','少儿英语');return false;"><span>少儿英语</span></a></dd>
                                                        <dd><a title="智力开发" href="#" onclick="conditionPage('','智力开发');return false;"><span>智力开发</span></a></dd>
                                                        <dd><a title="婴儿游泳" href="#" onclick="conditionPage('','婴儿游泳');return false;"><span>婴儿游泳</span></a></dd>
                                                    </dl>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <b class="arrow"></b>
                            </li>
                            <li >
                                <div class="category-info">
                                    <h3 class="category-name b-category-name">
                                        <i>
                                            <img src="${pageContext.request.contextPath}/static/meituan/images/fish.png">
                                        </i><a class="ml-22" title="运动健身/健身中心" href="#" onclick="conditionPage('运动健身/健身中心','');return false;">运动健身/健身中心</a></h3>
                                    <em>&gt;</em></div>
                                <div class="menu-item menu-in top">
                                    <div class="area-in">
                                        <div class="area-bg">
                                            <div class="menu-srot">
                                                <div class="sort-side">
                                                    <dl class="dl-sort">
                                                        <dt><span title="运动/健身">运动/健身</span></dt>
                                                        <dd><a title="篮球馆" href="#" onclick="conditionPage('','篮球馆');return false;"><span>篮球馆</span></a></dd>
                                                        <dd><a title="网球馆" href="#" onclick="conditionPage('','网球馆');return false;"><span>网球馆</span></a></dd>
                                                        <dd><a title="射箭馆" href="#" onclick="conditionPage('','射箭馆');return false;"><span>射箭馆</span></a></dd>
                                                        <dd><a title="足球场" href="#" onclick="conditionPage('','足球场');return false;"><span>足球场</span></a></dd>
                                                        <dd><a title="乒乓球" href="#" onclick="conditionPage('','乒乓球');return false;"><span>乒乓球</span></a></dd>
                                                    </dl>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <b class="arrow"></b>
                            </li>
                            <li >
                                <div class="category-info">
                                    <h3 class="category-name b-category-name">
                                        <i>
                                            <img src="${pageContext.request.contextPath}/static/meituan/images/tea.png">
                                        </i><a class="ml-22" title="酒吧/网吧"  href="#" onclick="conditionPage('酒吧/网吧','');return false;">酒吧/网吧</a></h3>
                                    <em>&gt;</em></div>
                                <div class="menu-item menu-in top">
                                    <div class="area-in">
                                        <div class="area-bg">
                                            <div class="menu-srot">
                                                <div class="sort-side">
                                                    <dl class="dl-sort">
                                                        <dt><span title="酒吧/网吧">酒吧/网吧</span></dt>
                                                        <dd><a title="KTV" href="#" onclick="conditionPage('','KTV');return false;"><span>KTV</span></a></dd>
                                                        <dd><a title="网咖" href="#" onclick="conditionPage('','网咖');return false;"><span>网咖</span></a></dd>
                                                    </dl>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <b class="arrow"></b>
                            </li>
                            <li>
                                <div class="category-info">
                                    <h3 class="category-name b-category-name">
                                        <i>
                                            <img src="${pageContext.request.contextPath}/static/meituan/images/package.png">
                                        </i><a class="ml-22" title="学习培训/音乐培训" href="#" onclick="conditionPage('学习培训/音乐培训','');return false;">学习培训/音乐培训</a></h3>
                                    <em>&gt;</em></div>
                                <div class="menu-item menu-in top">
                                    <div class="area-in">
                                        <div class="area-bg">
                                            <div class="menu-srot">
                                                <div class="sort-side">
                                                    <dl class="dl-sort">
                                                        <dt><span title="培训">培训</span></dt>
                                                        <dd><a title="钢琴" href="#" onclick="conditionPage('','钢琴');return false;"><span>钢琴</span></a></dd>
                                                        <dd><a title="吉他" href="#" onclick="conditionPage('','吉他');return false;"><span>吉他</span></a></dd>
                                                        <dd><a title="古筝" href="#" onclick="conditionPage('','古筝');return false;"><span>古筝</span></a></dd>
                                                    </dl>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>

            </div>
        </div>
        <!--导航 -->
        <script type="text/javascript">
            (function() {
                $('.am-slider').flexslider();
            });
            $(document).ready(function() {
                $("li").hover(function() {
                    $(".category-content .category-list li.first .menu-in").css("display", "none");
                    $(".category-content .category-list li.first").removeClass("hover");
                    $(this).addClass("hover");
                    $(this).children("div.menu-in").css("display", "block")
                }, function() {
                    $(this).removeClass("hover")
                    $(this).children("div.menu-in").css("display", "none")
                });
            })
        </script>
        <!--缩小时出现走马灯 -->
        <div class="marqueenTwo">
            <span class="marqueen-title"><i class="am-icon-volume-up am-icon-fw"></i>商城头条<em class="am-icon-angle-double-right"></em></span>
            <div class="demo">

                <ul>

                    <li><a target="_blank" href="#"><span>[特惠]</span>女生节商城爆品1分秒	</a></li>
                    <li><a target="_blank" href="#"><span>[公告]</span>华北、华中部分地区配送延迟</a></li>
                    <li><a target="_blank" href="#"><span>[特惠]</span>家电狂欢千亿礼券 买1送1！</a></li>
                    <li><a target="_blank" href="#"><span>[特惠]</span>洋河年末大促，低至两件五折</a></li>
                    <li><a target="_blank" href="#"><span>[公告]</span>华北、华中部分地区配送延迟</a></li>

                </ul>

            </div>
        </div>
        <div class="clear"></div>

    </div>
    <script type="text/javascript">
        if ($(window).width() < 640) {
            function autoScroll(obj) {
                $(obj).find("ul").animate({
                    marginTop: "-39px"
                }, 500, function() {
                    $(this).css({
                        marginTop: "0px"
                    }).find("li:first").appendTo(this);
                })
            }
            $(function() {
                setInterval('autoScroll(".demo")', 3000);
            })
        }
    </script>
</div>
<br/><br/><br/><br/><br/><br/><br/><br/>
<%--商品展示--%>
<div class="shopMainbg">
    <div class="shopMain" id="shopmain">
        <!--热门活动 -->
        <div class="am-container">
            <div class="sale-mt">
                <i></i>
                <em class="sale-title">限时秒杀</em>
                <div class="s-time" id="countdown">
                    <span class="hh">01</span>
                    <span class="mm">20</span>
                    <span class="ss">59</span>
                </div>
            </div>
            <div class="am-g am-g-fixed sale">
                <div class="am-u-sm-3 sale-item">
                    <div class="s-img">
                        <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/sale3.jpg" /></a>
                    </div>
                    <div class="s-info">
                        <a href="#"><p class="s-title">ZEK 原味海苔</p></a>
                        <div class="s-price">￥<b>9.90</b>
                            <a class="s-buy" href="#">秒杀</a>
                        </div>
                    </div>
                </div>

                <div class="am-u-sm-3 sale-item">
                    <div class="s-img">
                        <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/sale2.jpg" /></a>
                    </div>
                    <div class="s-info">
                        <a href="#"><p class="s-title">ZEK 原味海苔</p></a>
                        <div class="s-price">￥<b>9.90</b>
                            <a class="s-buy" href="#">秒杀</a>
                        </div>
                    </div>
                </div>

                <div class="am-u-sm-3 sale-item">
                    <div class="s-img">
                        <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/sale1.jpg" /></a>
                    </div>
                    <div class="s-info">
                        <a href="#"><p class="s-title">ZEK 原味海苔</p></a>
                        <div class="s-price">￥<b>9.90</b>
                            <a class="s-buy" href="#">秒杀</a>
                        </div>
                    </div>
                </div>

                <div class="am-u-sm-3 sale-item">
                    <div class="s-img">
                        <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/sale2.jpg " /></a>
                    </div>
                    <div class="s-info">
                        <a href="#"><p class="s-title">ZEK 原味海苔</p></a>
                        <div class="s-price">￥<b>9.90</b>
                            <a class="s-buy" href="#">秒杀</a>
                        </div>
                    </div>
                </div>

            </div>
        </div>
        <div class="clear "></div>

        <!--电影-->
        <div class="f1">
            <div class="am-container " >
                <div class="shopTitle ">
                    <h4 class="floor-title">电影</h4>
                    <div class="floor-subtitle"><em class="am-icon-caret-left"></em><h3>每一部电影都有一个故事</h3></div>
                </div>
            </div>

            <div class="am-g am-g-fixed floodSix ">
                <div class="am-u-sm-5 am-u-md-3 text-one list">
                    <div class="word">
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    </div>
                    <a href="# ">
                        <img src="${pageContext.request.contextPath}/static/meituan/images/5.jpg" />
                        <div class="outer-con ">
                            <div class="title ">
                                零食大礼包开抢啦
                            </div>
                            <div class="sub-title ">
                                当小鱼儿恋上软豆腐
                            </div>
                        </div>
                    </a>
                    <div class="triangle-topright"></div>
                </div>

                <div class="am-u-sm-7 am-u-md-5 am-u-lg-2 text-two big">

                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>

                    </div>
                    <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/act1.png" /></a>
                </div>

                <li>
                    <div class="am-u-md-2 am-u-lg-2 text-three">
                        <div class="boxLi"></div>
                        <div class="outer-con ">
                            <div class="title ">
                                小优布丁
                            </div>
                            <div class="sub-title ">
                                ¥4.8
                            </div>

                        </div>
                        <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/1.jpg " /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-md-2 am-u-lg-2 text-three sug">
                        <div class="boxLi"></div>
                        <div class="outer-con ">
                            <div class="title ">
                                小优布丁
                            </div>
                            <div class="sub-title ">
                                ¥4.8
                            </div>

                        </div>
                        <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/2.jpg " /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-4 am-u-md-5 am-u-lg-4 text-five">
                        <div class="boxLi"></div>
                        <div class="outer-con ">
                            <div class="title ">
                                小优布丁
                            </div>
                            <div class="sub-title ">
                                ¥4.8
                            </div>

                        </div>
                        <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/5.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-4 am-u-md-2 am-u-lg-2 text-six">
                        <div class="boxLi"></div>
                        <div class="outer-con ">
                            <div class="title ">
                                小优布丁
                            </div>
                            <div class="sub-title ">
                                ¥4.8
                            </div>

                        </div>
                        <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/3.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-4 am-u-md-2 am-u-lg-4 text-six">
                        <div class="boxLi"></div>
                        <div class="outer-con ">
                            <div class="title ">
                                小优布丁
                            </div>
                            <div class="sub-title ">
                                ¥4.8
                            </div>

                        </div>
                        <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/4.jpg" /></a>
                    </div>
                </li>
            </div>

            <div class="clear "></div>
        </div>
        <!--酒店-->
        <div class="f2">
            <div class="am-container ">
                <div class="shopTitle ">
                    <h4 class="floor-title">酒店</h4>
                    <div class="floor-subtitle"><em class="am-icon-caret-left"></em><h3>舒服睡上一觉</h3></div>
                </div>
            </div>
            <div class="am-g am-g-fixed floodSeven">
                <div class="am-u-sm-5 am-u-md-4 text-one list ">
                    <div class="word">
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    </div>
                    <a href="# ">
                        <div class="outer-con ">
                            <div class="title ">
                                零食大礼包开抢啦！
                            </div>
                            <div class="sub-title ">
                                零食大礼包
                            </div>
                        </div>
                        <img src="${pageContext.request.contextPath}/static/meituan/images/11.jpg" />
                    </a>
                    <div class="triangle-topright"></div>
                </div>

                <div class="am-u-sm-7 am-u-md-4 text-two big">

                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>

                    </div>
                    <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/act2.png " /></a>

                </div>

                <li>
                    <div class="am-u-sm-7 am-u-md-4 text-two">
                        <div class="boxLi"></div>
                        <div class="outer-con ">
                            <div class="title ">
                                雪之恋和风大福
                            </div>
                            <div class="sub-title ">
                                ¥13.8
                            </div>

                        </div>
                        <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/6.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-3 am-u-md-2 text-three sug">
                        <div class="boxLi"></div>
                        <div class="outer-con ">
                            <div class="title ">
                                小优布丁
                            </div>
                            <div class="sub-title ">
                                ¥4.8
                            </div>

                        </div>
                        <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/7.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-3 am-u-md-2 text-three big">
                        <div class="boxLi"></div>
                        <div class="outer-con ">
                            <div class="title ">
                                小优布丁
                            </div>
                            <div class="sub-title ">
                                ¥4.8
                            </div>

                        </div>
                        <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/10.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-3 am-u-md-2 text-three ">
                        <div class="boxLi"></div>
                        <div class="outer-con ">
                            <div class="title ">
                                小优布丁
                            </div>
                            <div class="sub-title ">
                                ¥4.8
                            </div>

                        </div>
                        <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/8.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-3 am-u-md-2 text-three ">
                        <div class="boxLi"></div>
                        <div class="outer-con ">
                            <div class="title ">
                                小优布丁
                            </div>
                            <div class="sub-title ">
                                ¥4.8
                            </div>

                        </div>
                        <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/9.jpg" /></a>
                    </div>
                </li>
            </div>
            <div class="clear "></div>
        </div>
        <%--猜你喜欢--%>
        <div class="f3">
            <div class="am-container " >
                <div class="shopTitle ">
                    <h4 class="floor-title">喜欢</h4>
                    <div class="floor-subtitle"><em class="am-icon-caret-left"></em><h3>你喜欢的，这里都有</h3></div>
                </div>
            </div>

            <div class="am-g am-g-fixed floodSix ">

                <div class="am-u-sm-5 am-u-md-3 text-one list">
                    <div class="word">
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    </div>
                    <a href="# ">
                        <img src="${pageContext.request.contextPath}/static/meituan/images/5.jpg" />
                        <div class="outer-con ">
                            <div class="title ">
                                零食大礼包开抢啦
                            </div>
                            <div class="sub-title ">
                                当小鱼儿恋上软豆腐
                            </div>
                        </div>
                    </a>
                    <div class="triangle-topright"></div>
                </div>

                <div class="am-u-sm-7 am-u-md-5 am-u-lg-2 text-two big">

                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>

                    </div>
                    <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/act1.png" /></a>
                </div>

                <li>
                    <div class="am-u-md-2 am-u-lg-2 text-three">
                        <div class="boxLi"></div>
                        <div class="outer-con ">
                            <div class="title ">
                                小优布丁
                            </div>
                            <div class="sub-title ">
                                ¥4.8
                            </div>

                        </div>
                        <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/1.jpg " /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-md-2 am-u-lg-2 text-three sug">
                        <div class="boxLi"></div>
                        <div class="outer-con ">
                            <div class="title ">
                                小优布丁
                            </div>
                            <div class="sub-title ">
                                ¥4.8
                            </div>

                        </div>
                        <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/2.jpg " /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-4 am-u-md-5 am-u-lg-4 text-five">
                        <div class="boxLi"></div>
                        <div class="outer-con ">
                            <div class="title ">
                                小优布丁
                            </div>
                            <div class="sub-title ">
                                ¥4.8
                            </div>

                        </div>
                        <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/5.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-4 am-u-md-2 am-u-lg-2 text-six">
                        <div class="boxLi"></div>
                        <div class="outer-con ">
                            <div class="title ">
                                小优布丁
                            </div>
                            <div class="sub-title ">
                                ¥4.8
                            </div>

                        </div>
                        <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/3.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-4 am-u-md-2 am-u-lg-4 text-six">
                        <div class="boxLi"></div>
                        <div class="outer-con ">
                            <div class="title ">
                                小优布丁
                            </div>
                            <div class="sub-title ">
                                ¥4.8
                            </div>

                        </div>
                        <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/4.jpg" /></a>
                    </div>
                </li>
            </div>
            <div class="clear "></div>
        </div>
        <%----%>
        <div class="f10">
            <!--坚果-->
            <div class="am-container ">
                <div class="shopTitle ">
                    <h4 class="floor-title">坚果</h4>
                    <div class="floor-subtitle"><em class="am-icon-caret-left"></em><h3>酥酥脆脆，回味无穷</h3></div>
                </div>
            </div>
            <div class="am-g am-g-fixed floodSeven">
                <div class="am-u-sm-5 am-u-md-4 text-one list ">
                    <div class="word">
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                        <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    </div>
                    <a href="# ">
                        <div class="outer-con ">
                            <div class="title ">
                                零食大礼包开抢啦！
                            </div>
                            <div class="sub-title ">
                                零食大礼包
                            </div>
                        </div>
                        <img src="${pageContext.request.contextPath}/static/meituan/images/11.jpg" />
                    </a>
                    <div class="triangle-topright"></div>
                </div>

                <div class="am-u-sm-7 am-u-md-4 text-two big">

                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>

                    </div>
                    <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/act2.png " /></a>

                </div>

                <li>
                    <div class="am-u-sm-7 am-u-md-4 text-two">
                        <div class="boxLi"></div>
                        <div class="outer-con ">
                            <div class="title ">
                                雪之恋和风大福
                            </div>
                            <div class="sub-title ">
                                ¥13.8
                            </div>

                        </div>
                        <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/6.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-3 am-u-md-2 text-three sug">
                        <div class="boxLi"></div>
                        <div class="outer-con ">
                            <div class="title ">
                                小优布丁
                            </div>
                            <div class="sub-title ">
                                ¥4.8
                            </div>

                        </div>
                        <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/7.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-3 am-u-md-2 text-three big">
                        <div class="boxLi"></div>
                        <div class="outer-con ">
                            <div class="title ">
                                小优布丁
                            </div>
                            <div class="sub-title ">
                                ¥4.8
                            </div>

                        </div>
                        <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/10.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-3 am-u-md-2 text-three ">
                        <div class="boxLi"></div>
                        <div class="outer-con ">
                            <div class="title ">
                                小优布丁
                            </div>
                            <div class="sub-title ">
                                ¥4.8
                            </div>

                        </div>
                        <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/8.jpg" /></a>
                    </div>
                </li>
                <li>
                    <div class="am-u-sm-3 am-u-md-2 text-three ">
                        <div class="boxLi"></div>
                        <div class="outer-con ">
                            <div class="title ">
                                小优布丁
                            </div>
                            <div class="sub-title ">
                                ¥4.8
                            </div>

                        </div>
                        <a href="# "><img src="${pageContext.request.contextPath}/static/meituan/images/9.jpg" /></a>
                    </div>
                </li>
            </div>
            <div class="clear "></div>
        </div>
        <jsp:include page="${pageContext.request.contextPath}/tail.jsp"></jsp:include>
    </div>
</div>
<!--菜单 -->
<div class=tip>
    <%--右侧边栏--%>
    <div id="sidebar">
        <div id="wrap">
            <div id="prof" class="item ">
                <a href="# ">
                    <span class="setting "></span>
                </a>
                <div class="ibar_login_box status_login ">
                    <div class="avatar_box ">
                        <p class="avatar_imgbox "><img src="${pageContext.request.contextPath}/static/meituan/images/no-img_mid_.jpg " /></p>
                        <ul class="user_info ">
                            <li>用户名：sl1903</li>
                            <li>级&nbsp;别：普通会员</li>
                        </ul>
                    </div>
                    <div class="login_btnbox ">
                        <a href="# " class="login_order ">我的订单</a>
                        <a href="# " class="login_favorite ">我的收藏</a>
                    </div>
                    <i class="icon_arrow_white "></i>
                </div>

            </div>
            <div id="shopCart " class="item ">
                <a href="# ">
                    <span class="message "></span>
                </a>
                <p>
                    购物车
                </p>
                <p class="cart_num ">0</p>
            </div>
            <div id="asset " class="item ">
                <a href="# ">
                    <span class="view "></span>
                </a>
                <div class="mp_tooltip ">
                    我的资产
                    <i class="icon_arrow_right_black "></i>
                </div>
            </div>

            <div id="foot " class="item ">
                <a href="# ">
                    <span class="zuji "></span>
                </a>
                <div class="mp_tooltip ">
                    我的足迹
                    <i class="icon_arrow_right_black "></i>
                </div>
            </div>

            <div id="brand " class="item ">
                <a href="#">
                    <span class="wdsc "><img src="${pageContext.request.contextPath}/static/meituan/images/wdsc.png " /></span>
                </a>
                <div class="mp_tooltip ">
                    我的收藏
                    <i class="icon_arrow_right_black "></i>
                </div>
            </div>

            <div id="broadcast " class="item ">
                <a href="# ">
                    <span class="chongzhi "><img src="${pageContext.request.contextPath}/static/meituan/images/chongzhi.png " /></span>
                </a>
                <div class="mp_tooltip ">
                    我要充值
                    <i class="icon_arrow_right_black "></i>
                </div>
            </div>

            <div class="quick_toggle ">
                <li class="qtitem ">
                    <a href="# "><span class="kfzx "></span></a>
                    <div class="mp_tooltip ">客服中心<i class="icon_arrow_right_black "></i></div>
                </li>
                <!--二维码 -->
                <li class="qtitem ">
                    <a href="#none "><span class="mpbtn_qrcode "></span></a>
                    <div class="mp_qrcode " style="display:none; "><img src="${pageContext.request.contextPath}/static/meituan/images/weixin_code_145.png " /><i class="icon_arrow_white "></i></div>
                </li>
                <li class="qtitem ">
                    <a href="#top " class="return_top "><span class="top "></span></a>
                </li>
            </div>

            <!--回到顶部 -->
            <div id="quick_links_pop " class="quick_links_pop hide "></div>
        </div>
    </div>
</div>

<script type="text/javascript " src="${pageContext.request.contextPath}/static/meituan/basic/js/quick_links.js "></script>
</body>
</html>
