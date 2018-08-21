<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="">
<head>
    <title>商户中心</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/seller/css/style.css" media="all" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/assets/css/form-elements.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/assets/css/style.css">
    <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.12.4.min.js"></script>
    <%--商店的分类和种类，2级联动--%>
    <script type="text/javascript">
        <%--分类--%>
        $(function(){
            $.ajax({
                url : "${pageContext.request.contextPath}/storetypeContrller/findStoretype/",
                type : "GET",
                dataType : "json",
                success : function(data){
                    if(data!=null){
                        $(data).each(function(index){
                            $("#stoType").append(
                                '<option value="'+data[index].stId+'">'+data[index].stName+'</option>'
                            );
                        });
                    }
                }
            });
        });
        <%--种类--%>
        function findStoClassify(){
            var stId = $("#stoType option:selected").val();
            $("#stoClassify").html('<option value="">---选择种类---</option>');
            $.ajax({
                url : "${pageContext.request.contextPath}/storetypeContrller/findStoreclassify/"+stId,
                type : "GET",
                dataType : "json",
                success : function(data){
                    if(data!=null){
                        $(data).each(function(index){
                            $("#stoClassify").append(
                                '<option value="'+data[index].scName+'">'+data[index].scName+'</option>'
                            );
                        });
                    }
                }
            });
            $("#stoType option:checked").val($("#stoType option:checked").text());
        }
    </script>
    <%--省市区三级联动--%>
    <script type="text/javascript">
        <%--搜索省份--%>
        $(function(){
            $.ajax({
                url : "${pageContext.request.contextPath}/comovementController/findProvince/",
                type : "GET",
                dataType : "json",
                success : function(data){
                    if(data!=null){
                        $(data).each(function(index){
                            $("#provinced").append(
                                '<option value="'+data[index].prId+'">'+data[index].prName+'</option>'
                            );
                        });
                    }
                }
            });
        });
        <%--城市--%>
        function testJson1(){
            var prId = $("#provinced option:selected").val();
            $("#city").html('<option value="">---请选择城市---</option>');
            $("#county").html('<option value="">---请选择县城---</option>');
            $.ajax({
                url : "${pageContext.request.contextPath}/comovementController/findCity/"+prId,
                type : "GET",
                dataType : "json",
                success : function(data){
                    if(data!=null){
                        $(data).each(function(index){
                            $("#city").append(
                                '<option value="'+data[index].ciId+'">'+data[index].ciName+'</option>'
                            );
                        });
                    }
                }
            });
//            只要值改变，遍历后就赋值
            $("#provinced option:checked").val($("#provinced option:checked").text());
        }
        <%--地区--%>
        function testJson2(){
            var ciId = $("#city option:selected").val();
            $("#county").html('<option value="">---请选择县城---</option>');
            $.ajax({
                url : "${pageContext.request.contextPath }/comovementController/findCountry/"+ciId,
                type : "GET",
                dataType : "json",
                success : function(data){
                    if(data!=null){
                        $(data).each(function(index){
                            $("#county").append(
//                                只要值改变就是名字
                                '<option value="'+data[index].coName+'">'+data[index].coName+'</option>'
                            );
                        });
                    }
                }
            });
//            只要值改变，遍历后就赋值
            $("#city option:checked").val($("#city option:checked").text());
        }
    </script>
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
                    <%--<input type="text" name="stoType_input" id="stoType_input" value="1" >--%>
                    <%--<input type="text" name="city_input" id="city_input" value="1">--%>
                    <%--<input type="text" name="provinced_input" id="provinced_input" value="1">--%>
                    <%--分类种类二级联动--%>
                    <div class="form-group">
                        <select name="stoType"  id="stoType" onchange="findStoClassify()">
                            <option value="">---选择分类---</option>
                        </select>

                        <select name="stoClassify" id="stoClassify" >
                            <option value="">---选择种类---</option>
                        </select>
                    </div>
                    <%--省市区三级联动--%>
                    <div class="form-group">
                        <select name="provinced"  id="provinced" onchange="testJson1()">
                            <option value="">---请选择省份---</option>
                            <%--<c:forEach items="${provinced}" var="c1">--%>
                                <%--<option value="${c1.prId}" onclick="qwe()">${c1.prName}</option>--%>
                            <%--</c:forEach>--%>
                        </select>
                        <select name="city" id="city" onchange="testJson2()">
                            <option value="">---请选择城市---</option>
                        </select>
                        <select name="county" id="county" onchange="testJson3()" >
                            <option value="">---请选择县城---</option>
                        </select>
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