<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <title>美团网</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="alternate icon" type="image/png" href="static/images/favicon.png">
    <link rel='icon' href='favicon.ico' type='image/x-ico' />
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <link rel="stylesheet" href="static/css/default.min.css?t=227" />
    <script type="text/javascript" src="static/lib/jquery/jquery.min.js"></script>
    <script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
    <script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
    <script src="static/lib/amazeui/amazeui.ie8polyfill.min.js"></script>
    <script type="text/javascript" src="static/lib/handlebars/handlebars.min.js"></script>
    <script type="text/javascript" src="static/lib/iscroll/iscroll-probe.js"></script>
    <script type="text/javascript" src="static/lib/amazeui/amazeui.min.js"></script>
    <script type="text/javascript" src="static/lib/raty/jquery.raty.js"></script>
    <script type="text/javascript" src="static/js/main.min.js?t=1"></script>
</head>
<body>
<header class="hd">
    <div class="hd-top am-hide-md-down">
        <div class="cg">
            <div class="hd-top-left">
                <a href="#">设为首页</a>
                <a href="#">收藏</a>
                <a href="#">RSS订阅</a>
                <a href="/memberController/memberAllList">管理跳转信息</a>
            </div>
            <div class="hd-top-right">
                <a href="member/register.html">注册</a>
                <a href="member/member_register.jsp">会员注册</a>
                <a href="member/login.html">登录</a>
                <a href="member/member_login.jsp">会员登录</a>
            </div>
        </div>
    </div>
    <div class="cg">
        <div class="hd-search">

            <div class="hd-search-left">
                <a href="../index.html"><img src="./static/images/logo.jpg" height="100" width="150"/></a>
                <%--<a href="../index.html"><img class="am-show-md-down" src="./static/images/logo-sm.jpg" /></a>--%>
            </div>

            <div class="hd-search-right am-hide-md-down">
                <div class="hd-search-right-input">
                    <input type="text" name="name" value="" placeholder="搜索模版" />
                    <button class="font am-show-md-down">&#xe634;</button>
                </div>
                <div class="hd-search-right-keyword">
                    <a href="#">包装用品</a>
                    <a href="#">母婴</a>
                    <a href="#">教育</a>
                    <a href="#">招聘</a>
                    <a href="#">绿化</a>
                </div>
            </div>


            <button class="am-show-md-down font f-btn" id="hd_botton" type="button" data-am-modal="{target: '#my-modal'}">&#xe68b;</button>
        </div>
    </div>


    <div class="hd-bottom">
        <div class="cg">
            <div class="hd-bottom-category am-hide-md-down">
                <h1><a href="javascript:;">全部模版分类</a><i data-am-collapse="{target: '.banner-collapse'}">&#xe78f;</i></h1>
            </div>
            <div class="hd-bottom-nav" id="my-modal">
                <h1 class="am-show-md-down"><input type="text" name="name" value="" placeholder="请输入关键字" /><em class="font">&#xe6e7;</em><i data-am-modal="{target: '#my-modal'}">&#xe607;</i></h1>
                <ul>
                    <li class="on"><a href="index.html">首页</a></li>
                    <li><a href="member/template.html">模版中心</a></li>
                    <li><a href="#">定制服务</a></li>
                    <li><a href="#">成功案例</a></li>
                    <li><a href="#">关于我们</a></li>
                </ul>
            </div>
        </div>
    </div>
</header>

<div class="am-cf"></div>
<div class="am-slider am-slider-default index-lunbo" data-am-flexslider="{playAfterPaused: 8000}">
    <ul class="am-slides">
        <li><img src="static/images/index_banner01.jpg" /></li>
        <li><img src="static/images/index_banner01.jpg" /></li>
        <li><img src="static/images/index_banner01.jpg" /></li>
    </ul>

    <div class="banner-slide am-hide-md-down">
        <div class="cg">
            <ul class="category">
                <li><a href="#">机构组织</a></li>
                <li><a href="#">农林牧渔</a></li>
                <li><a href="#">医药卫生</a></li>
                <li><a href="#">建筑建材</a></li>
                <li><a href="#">冶金矿产</a></li>
                <li><a href="#">石油化工</a></li>
                <li><a href="#">水利水电</a></li>
                <li><a href="#">交通运输</a></li>
                <li><a href="#">信息产业</a></li>
                <li><a href="#">机械机电</a></li>
                <li><a href="#">轻工食品</a></li>
                <li><a href="#">服装纺织</a></li>
                <li><a href="#">专业服务</a></li>
                <li><a href="#">安全防护</a></li>
                <li><a href="#">环保绿化</a></li>
                <li><a href="#">旅游休闲</a></li>
                <li><a href="#">办公文教</a></li>
                <li><a href="#">电子电工</a></li>
                <li><a href="#">玩具礼品</a></li>
                <li><a href="#">家居用品</a></li>
                <li><a href="#">物资专材</a></li>
                <li><a href="#">包装用品</a></li>
                <li><a href="#">办公家具</a></li>
            </ul>
        </div>
    </div>

</div>


<div class="copyrights">Collect from <a href="http://www.cssmoban.com/" >网页模板</a></div>
<div class="notice">
    <div class="cg">
        <div class="am-u-sm-12 am-u-md-12 am-u-lg-8">
            <div class="notice-left">
                <div class="notice-left-img" id="noticeimg">
                    <a href="#"><img src="static/images/demo1.jpg" /></a>
                </div>
                <div class="notice-left-slider">
                    <div class="am-slider am-slider-default am-slider-carousel"
                         data-am-flexslider="{itemWidth: 200, itemMargin: 5, slideshow: false}">
                        <ul class="am-slides">
                            <li><img src="static/images/demo1.jpg" class="imgslider" data-clstag="baidu.com"/></li>
                            <li><img src="static/images/demo11.jpg" class="imgslider"  data-clstag="yinyuetai.com"/></li>
                            <li><img src="static/images/demo1.jpg" class="imgslider" data-clstag="yunalading.com"/></li>
                            <li><img src="static/images/demo11.jpg" class="imgslider" data-clstag="google.cn"/></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div class="am-u-sm-12 am-u-md-12 am-u-lg-4">
            <div class="notice-right">
                <div class="notice-right-div">
                    <h1 class="comh1">
                        网站公告
                        <em>
                            <a href="#"><b>MORE</b><i>&#xe696;</i></a>
                        </em>
                    </h1>

                    <img src="static/images//demo2.jpg"/>
                    <strong><a href="">外卖O2O系统无线云打印支持型号系统无线云打印支持型号</a></strong>
                    <ul>
                        <li><a href="#"><span>微信微分销系统怎么提高微商城的市场盈利</span></a></li>
                        <li><a href="#"><span>微信分销怎么做可以打造出微分销商城的爆款</span></a></li>
                        <li><a href="#"><span>微分销要避免什么问题</span></a></li>
                        <li><a href="#"><span>微信运营之中最重要的载体是什么？</span></a></li>
                        <li><a href="#"><span">传统餐饮收银系统存在先天不足，如何解决痛点?</span></a></li>
                        <li><a href="#"><span>微分销要避免什么问题</span></a></li>
                        <li><a href="#"><span>微信运营之中最重要的载体是什么？</span></a></li>

                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>


<div class="ads">
    <div class="cg">
        <img src="static/images/demo3.jpg" />
    </div>
</div>

<div class="index-category">
    <div class="cg">
        <div class="am-u-sm-12 am-u-md-12 am-u-lg-4">
            <div class="index-category-left">
                <h1 class="comh1">
                    网页基础
                    <em>
                        <a href="#"><b>MORE</b><i>&#xe696;</i></a>
                    </em>
                </h1>
                <img src="static/images/demo4.jpg"/>
                <ul class="comcategory">
                    <li><a href="#"><span>Dreamweaver8创建自定义代码片段的方法</span><i>2016-06-16</i></a></li>
                    <li><a href="#"><span>Dreamweaver8创建自定义代码片段的方法</span><i>2016-06-16</i></a></li>
                    <li><a href="#"><span>Dreamweaver8创建自定义代码片段的方法</span><i>2016-06-16</i></a></li>
                    <li><a href="#"><span>Dreamweaver8创建自定义代码片段的方法</span><i>2016-06-16</i></a></li>
                    <li><a href="#"><span>Dreamweaver8创建自定义代码片段的方法</span><i>2016-06-16</i></a></li>
                    <li><a href="#"><span>Dreamweaver8创建自定义代码片段的方法</span><i>2016-06-16</i></a></li>
                </ul>
            </div>
        </div>
        <div class="am-u-sm-12 am-u-md-12 am-u-lg-4">
            <div class="index-category-left">
                <h1 class="comh1">
                    站长图集
                    <em>
                        <a href="#"><b>MORE</b><i >&#xe696;</i></a>
                    </em>
                </h1>
                <img src="static/images/demo5.jpg" />
                <ul class="comcategory">
                    <li><a href="#"><span>Dreamweaver8创建自定义代码片段的方法</span><i>2016-06-16</i></a></li>
                    <li><a href="#"><span>Dreamweaver8创建自定义代码片段的方法</span><i>2016-06-16</i></a></li>
                    <li><a href="#"><span>Dreamweaver8创建自定义代码片段的方法</span><i>2016-06-16</i></a></li>
                    <li><a href="#"><span>Dreamweaver8创建自定义代码片段的方法</span><i>2016-06-16</i></a></li>
                    <li><a href="#"><span>Dreamweaver8创建自定义代码片段的方法</span><i>2016-06-16</i></a></li>
                    <li><a href="#"><span>Dreamweaver8创建自定义代码片段的方法</span><i>2016-06-16</i></a></li>
                </ul>
            </div>
        </div>
        <div class="am-u-sm-12 am-u-md-12 am-u-lg-4">
            <div class="index-category-right">

                <div class="am-tabs" data-am-tabs="{noSwipe: 1}" id="doc-tab-demo-1">
                    <ul class="am-tabs-nav am-nav am-nav-tabs">
                        <li class="am-active"><a href="javascript: void(0)">软件下载</a></li>
                        <li><a href="javascript: void(0)">商品销售</a></li>

                    </ul>

                    <div class="am-tabs-bd">
                        <div class="am-tab-panel am-active">
                            <ul class="comcategory">
                                <li><a href="#"><span>Dreamweaver8创建自定义代码片段的方法</span><i>2016-06-16</i></a></li>
                                <li><a href="#"><span>Dreamweaver8创建自定义代码片段的方法</span><i>2016-06-16</i></a></li>
                                <li><a href="#"><span>Dreamweaver8创建自定义代码片段的方法</span><i>2016-06-16</i></a></li>
                                <li><a href="#"><span>Dreamweaver8创建自定义代码片段的方法</span><i>2016-06-16</i></a></li>
                                <li><a href="#"><span>Dreamweaver8创建自定义代码片段的方法</span><i>2016-06-16</i></a></li>
                                <li><a href="#"><span>Dreamweaver8创建自定义代码片段的方法</span><i>2016-06-16</i></a></li>
                            </ul>
                        </div>
                        <div class="am-tab-panel">
                            <ul class="comcategory">
                                <li><a href="#"><span>Dreamweaver8创建自定义代码片段的方法</span><i>2016-06-16</i></a></li>
                                <li><a href="#"><span>Dreamweaver8创建自定义代码片段的方法</span><i>2016-06-16</i></a></li>
                                <li><a href="#"><span>Dreamweaver8创建自定义代码片段的方法</span><i>2016-06-16</i></a></li>
                                <li><a href="#"><span>Dreamweaver8创建自定义代码片段的方法</span><i>2016-06-16</i></a></li>
                                <li><a href="#"><span>Dreamweaver8创建自定义代码片段的方法</span><i>2016-06-16</i></a></li>
                                <li><a href="#"><span>Dreamweaver8创建自定义代码片段的方法</span><i>2016-06-16</i></a></li>
                            </ul>
                        </div>

                    </div>
                </div>


            </div>
        </div>
    </div>
</div>


<div class="ads">
    <div class="cg">
        <img src="static/images/demo6.jpg" />
    </div>
</div>

<div class="index-sliderbottom">
    <div class="cg">
        <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
            <h1 class="comh1">
                图文资讯
                <em>
                    <a href="#"><b>MORE</b><i >&#xe696;</i></a>
                </em>
            </h1>

            <div class="am-slider am-slider-default am-slider-carousel"
                 data-am-flexslider="{itemWidth: 200, itemMargin: 15, slideshow: false}">
                <ul class="am-slides">
                    <li><a href="#"><img src="static/images/demo7.jpg" /><span>上汽股份旗下上海汽车中英文品牌命名</span></a></li>
                    <li><a href="#"><img src="static/images/demo7.jpg" /><span>上汽股份旗下上海汽车中英文品牌命名</span></a></li>
                    <li><a href="#"><img src="static/images/demo7.jpg" /><span>上汽股份旗下上海汽车中英文品牌命名</span></a></li>
                    <li><a href="#"><img src="static/images/demo7.jpg" /><span>上汽股份旗下上海汽车中英文品牌命名</span></a></li>
                    <li><a href="#"><img src="static/images/demo7.jpg" /><span>上汽股份旗下上海汽车中英文品牌命名</span></a></li>
                    <li><a href="#"><img src="static/images/demo7.jpg" /><span>上汽股份旗下上海汽车中英文品牌命名</span></a></li>
                    <li><a href="#"><img src="static/images/demo7.jpg" /><span>上汽股份旗下上海汽车中英文品牌命名</span></a></li>
                </ul>
            </div>

        </div>
    </div>
</div>

﻿<footer class="footer">
    <div class="cg">
        <div class="am-u-sm-12 am-u-md-12 am-u-lg-6">
            <div class="am-u-sm-12 am-u-md-12 am-u-lg-8">
                <div class="footer-div1 am-hide-md-down">
                    <h1>关于我们</h1>
                    <div class="footer-div1-top">
                        <img src="./static/images/footer.jpg"/>
                        <span><em>大冶市云阿拉丁科技有限公司成立于2015</em></span>
                    </div>
                    <div class="footer-div1-bottom">
                        云阿拉丁科技有限公司创建于2015年1月5日，总 部位于青铜故里——大冶市。公司致力于帮助传统行业力
                    </div>
                    <em><a href="#">阅读更多>></a></em>
                </div>
            </div>
            <div class="am-u-sm-12 am-u-md-12 am-u-lg-4">
                <div class="footer-div2 am-hide-md-down">
                    <h1>职位招聘</h1>
                    <ul>
                        <li><a href="#">招聘销售专员销售管理人员</a></li>
                        <li><a href="#">市场销售</a></li>
                        <li><a href="#">营销客服经理</a></li>
                        <li><a href="#">涉外律师</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="am-u-sm-12 am-u-md-12 am-u-lg-6">
            <div class="am-u-sm-12 am-u-md-12 am-u-lg-8">
                <div class="footer-div3 am-hide-md-down">
                    <h1>联系我们</h1>
                    <ul>
                        <li><i>&#xe617;</i>地址 Add : 大冶市大冶大道116号2栋金穗小区B幢201房</li>
                        <li><i>&#xe601;</i>电话Tel：(86) 0714-8868331</li>
                        <li><i>&#xe602;</i>传真Fax：(86) 0714-8868331</li>
                        <li><i>&#xe691;</i>dayeyunalading@.com</li>
                    </ul>
                </div>
            </div>
            <div class="am-u-sm-12 am-u-md-12 am-u-lg-4">
                <div class="footer-div3 am-hide-md-down">
                    <h1>关注我们</h1>
                    <ul>
                        <li><em>&#xe644;</em><b>新浪微博</b></li>
                        <li><em>&#xe6c9;</em><b>优酷</b></li>
                        <li><em>&#xe66f;</em><b>微信</b></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
            <div class="footer-bottom am-hide-md-down">
                <div class="footer-bottom-link">
                    <div class="am-u-sm-3 am-u-md-2 am-u-lg-2"><span>友情链接：</span></div>
                    <div class="am-u-sm-9 am-u-md-10 am-u-lg-10">
                        <strong>
                            <a href="#">北京网站建设</a>
                            <a href="#">网站建设</a>
                            <a href="#">网站设计</a>
                            <a href="#">合肥网站建设</a>
                            <a href="#">网站建设</a>
                            <a href="#">网店系统</a>
                            <a href="#">企业网站建设</a>
                            <a href="#">上海网站设计</a>
                            <a href="#">香港服务器</a>
                            <a href="#">康辉国</a>
                            <a href="#">网站建设</a>
                            <a href="#">网店系统</a>
                            <a href="#">企业网站建设</a>
                            <a href="#">上海网站设计</a>
                            <a href="#">香港服务器</a>
                            <a href="#">康辉国</a>
                        </strong>
                    </div>
                </div>
            </div>
            <h2>申请友情链接请联系QQ：00000000</h2>
            <h3>@2015-2016 版权所有 大冶云阿拉丁科技有限公司.<span><a href="http://www.haothemes.com/" target="_blank" title="好主题">好主题</a>提供 - More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></span>  </h3>
        </div>
    </div>
</footer>
<script type="text/javascript">
    var noticeimg = document.getElementById("noticeimg");
    var imgslider = document.querySelectorAll(".imgslider");
    var index = 0;
    for (var i = 0; i < imgslider.length; i++) {
        imgslider[i].index = i;
        imgslider[i].onclick = function () {
            index = this.index;
            var herf = imgslider[index].getAttribute('data-clstag');
            var src = imgslider[index].getAttribute('src');
            noticeimg.children[0].setAttribute('href', herf);
            noticeimg.getElementsByTagName("img")[0].setAttribute('src', src);
        }
    }






</script>
</body>
</html>
