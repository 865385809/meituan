<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>商家搜索中心</title>
    <%--bookstrap--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.12.4.min.js"></script>
    <link href="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

    <link href="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/static/meituan/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/static/meituan/basic/css/demo.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/static/meituan/css/seastyle.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/meituan/basic/js/jquery-1.7.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/meituan/js/script.js"></script>
    <%--自建的css--%>
    <link href="${pageContext.request.contextPath}/static/css/seller_goods.css" rel="stylesheet" type="text/css" />
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
                <div class="theme-popover">
                    <div class="searchAbout">
                        <%--<span class="font-pale">相关搜索：</span>--%>
                        <%--<a title="坚果" href="#">坚果</a>--%>
                        <%--<a title="瓜子" href="#">瓜子</a>--%>
                        <%--<a title="鸡腿" href="#">豆干</a>--%>

                    </div>
                    <%--选择分类--%>
                    <ul class="select">
                        <p class="title font-normal">
                            <%--<span class="fl">松子</span>--%>
                            <span class="total fl">搜索到<strong class="num">${storeListInfo.total}</strong>个相关商店</span>
                        </p>
                        <div class="clear"></div>
                        <li class="select-result">
                            <dl>
                                <dt>已选</dt>
                                <dd class="select-no"></dd>
                                <p class="eliminateCriteria">清除</p>
                            </dl>
                        </li>
                        <div class="clear"></div>
                        <li class="select-list">
                            <dl id="select1">
                                <dt class="am-badge am-round">分类</dt>

                                <div class="dd-conent">
                                    <dd class="select-all selected"><a href="#">全部</a></dd>
                                    <%--<dd><a href="#">美食</a></dd>--%>
                                    
                                </div>

                            </dl>
                        </li>
                        <li class="select-list">
                            <dl id="select2">
                                <dt class="am-badge am-round">区域</dt>
                                <div class="dd-conent">
                                    <dd class="select-all selected"><a href="#">全部</a></dd>
                                    <dd><a href="#">广东省</a></dd>
                                </div>
                            </dl>
                        </li>
                        <%--<li class="select-list">--%>
                            <%--<dl id="select3">--%>
                                <%--<dt class="am-badge am-round">其他</dt>--%>
                                <%--<div class="dd-conent">--%>
                                    <%--<dd class="select-all selected"><a href="#">全部</a></dd>--%>
                                    <%--<dd>无</dd>--%>
                                <%--</div>--%>
                            <%--</dl>--%>
                        <%--</li>--%>
                    </ul>
                    <div class="clear"></div>
                </div>
                <%--分页上边的栏--%>
                <div class="search-content">
                    <div class="sort">
                        <%--<li class="first"><a title="综合">综合排序</a></li>--%>
                        <%--<li><a title="销量">销量排序</a></li>--%>
                        <%--<li><a title="价格">价格优先</a></li>--%>
                        <%--<li class="big"><a title="评价" href="#">评价为主</a></li>--%>
                    </div>
                    <div class="clear"></div>
                    <%--商品展示--%>
                    <div class="container">
                        <c:forEach items="${storeListInfo.list}" var="store">
                                <div class="row">
                                    <a href="${pageContext.request.contextPath}/goodsController/findGoodsByStoreId?stoId=${store.stoId}" >
                                    <div class="col-md-4">
                                        <img src="${store.stoPicture}">
                                    </div>
                                    <div class="col-md-6">
                                        <div class="font2">【${store.stoName}】</div> <br/><br/>
                                        1565评论<br/><br/>
                                            ${store.stoAddress}<br><br/>
                                        人均<div class="font4">￥${store.stoPrice}</div><br><br/>
                                    </div>
                                    </a>

                                </div>
                            <br/><hr/><hr/><br/>
                        </c:forEach>
                        <%--显示分页的信息--%>
                        <div class="row">
                            <%--分页的文字信息--%>
                            <div class="col-md-4">
                                当前${storeListInfo.pageNum}页，
                                总${storeListInfo.pages}页，
                                共${storeListInfo.total}条记录
                            </div>
                            <%--分页条信息--%>
                            <div class="col-md-6" id="page_nav"></div>
                        </div>
                    </div>

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
<!--菜单 -->
<div class=tip>
    <%--右侧边栏--%>
    <div id="sidebar">
        <div id="wrap">
            <%--个人信息--%>
            <div id="prof" class="item ">
                <%--个人信息的小图片--%>
                <a href="# "><span class="setting "></span></a>
                <%--个人信息显示--%>
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
            <%--购物车--%>
            <div id="shopCart " class="item ">
                <a href="# ">
                    <span class="message "></span>
                </a>
                <p>
                    购物车
                </p>
                <p class="cart_num ">0</p>
            </div>
            <%--我的资产--%>
            <div id="asset " class="item ">
                <a href="# ">
                    <span class="view "></span>
                </a>
                <div class="mp_tooltip ">
                    我的资产
                    <i class="icon_arrow_right_black "></i>
                </div>
            </div>
            <%--我的足迹--%>
            <div id="foot " class="item ">
                <a href="# ">
                    <span class="zuji "></span>
                </a>
                <div class="mp_tooltip ">
                    我的足迹
                    <i class="icon_arrow_right_black "></i>
                </div>
            </div>
            <%--我的收藏--%>
            <div id="brand " class="item ">
                <a href="#">
                    <span class="wdsc "><img src="${pageContext.request.contextPath}/static/meituan/images/wdsc.png " /></span>
                </a>
                <div class="mp_tooltip ">
                    我的收藏
                    <i class="icon_arrow_right_black "></i>
                </div>
            </div>
            <%--我要充值--%>
            <div id="broadcast " class="item ">
                <a href="# ">
                    <span class="chongzhi "><img src="${pageContext.request.contextPath}/static/meituan/images/chongzhi.png " /></span>
                </a>
                <div class="mp_tooltip ">
                    我要充值
                    <i class="icon_arrow_right_black "></i>
                </div>
            </div>
            <%--右侧靠边栏下方--%>
            <div class="quick_toggle ">
                <%--客服中心--%>
                <li class="qtitem ">
                    <a href="# "><span class="kfzx "></span></a>
                    <div class="mp_tooltip ">客服中心<i class="icon_arrow_right_black "></i></div>
                </li>
                <!--二维码 -->
                <li class="qtitem ">
                    <a href="#none "><span class="mpbtn_qrcode "></span></a>
                    <div class="mp_qrcode " style="display:none; "><img src="${pageContext.request.contextPath}/static/meituan/images/weixin_code_145.png " /><i class="icon_arrow_white "></i></div>
                </li>
                <%--回到顶部--%>
                <li class="qtitem ">
                    <a href="#top " class="return_top "><span class="top "></span></a>
                </li>
            </div>
            <!--回到顶部 -->
        </div>
    </div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/meituan/basic/js/quick_links.js"></script>
<div class="theme-popover-mask"></div>

<%--分页搜索要提交的数据--%>
<form id="form1" method="post" action="${pageContext.request.contextPath}/storeController/searchShop">
    <input type="hidden" id="setStoType" name="stoType">
    <input type="hidden" id="setStoClassify" name="stoClassify">
    <input type="hidden" id="searchStoName" name="stoName">
    <input type="hidden" id="setPn" name="pn">
</form>
<%--分页ajax--%>
<script type="text/javascript">
    //调到指定的页面
    function to_page(pn){
        //分类
        var searchStoType = "${searchStoType }";
        //种类
        var setStoClassify = "${setStoClassify}";
        //商店名称
        var searchStoName = "${searchStoName}";
        //window.location.href="${pageContext.request.contextPath}/storeController/searchShop?pn=" + pn;
        document.getElementById("setPn").value=pn;
        if( searchStoType != null && searchStoType != ""){
            document.getElementById("setStoType").value=searchStoType;
        }
        if( setStoClassify != null && setStoClassify !="") {
            document.getElementById("setStoClassify").value=setStoClassify;
        }
        if( searchStoName != null && searchStoName !="") {
            document.getElementById("searchStoName").value=searchStoName;
        }
        $("#form1").submit();
    }
    $(function(){
        //每次都要清空
        $("#page_nav").empty();
        var ul = $("<ul></ul>").addClass("pagination");
        //首页前一页
        var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
        var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
        //判断是否有前一页
        if(${storeListInfo.hasPreviousPage == false}){
            firstPageLi.addClass("disabled");
            prePageLi.addClass("disabled");
        }else{
            //为元素添加点击翻页的事件
            firstPageLi.click(function(){
                to_page(1);
            });
            prePageLi.click(function(){
                to_page(${storeListInfo.pageNum - 1});
            });
        }
        //后一页，末页
        var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
        var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
        //是否有后一页
        if(${storeListInfo.hasNextPage == false}){
            nextPageLi.addClass("disabled");
            lastPageLi.addClass("disabled");
        }else{
            nextPageLi.click(function(){
                to_page(${storeListInfo.pageNum + 1});
            });
            lastPageLi.click(function(){
                to_page(${storeListInfo.pages});
            });
        }
        ul.append(firstPageLi).append(prePageLi);   //添加首页和前一页
        //1,2，3遍历给ul中添加页码提示
        $.each(${navigateNums},function(index,item){
            var numLi = $("<li></li>").append($("<a></a>").append(item));
            var pageNum = ${storeListInfo.pageNum};
            if( pageNum == item){
                numLi.addClass("active");       //如果是当前页就是激活状态
            }
            numLi.click(function(){         //页面跳转
                to_page(item);
            });
            ul.append(numLi);                   //把页码添加进ul
        });
        ul.append(nextPageLi).append(lastPageLi);   //添加下一页和末页
        //把ul加入到nav
        var navEle = $("<nav></nav>").append(ul);
        navEle.appendTo("#page_nav");
    });
    //解析分页条信息
</script>
</body>
</html>
