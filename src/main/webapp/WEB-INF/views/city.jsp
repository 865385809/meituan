<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>三级联动</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.12.4.min.js"></script>
    <script type="text/javascript">

        <%--城市--%>
        function testJson1(){
            var prId = $("#province").val();
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
                                '<option value="'+data[index].coId+'">'+data[index].coName+'</option>'
                            );
                        });
                    }
                }
            });
        }
    </script>
</head>
<body>
<select name="province"  id="province" onchange="testJson1()">
    <option value="">---请选择省份---</option>
    <c:forEach items="${provinced}" var="c1">
        <option value="${c1.prId}" onclick="qwe()">${c1.prName}</option>
    </c:forEach>
</select>
<%--onclick="testJson2()"--%>
<select name="city" id="city" onchange="testJson2()">
    <option value="">---请选择城市---</option>
</select>
<select name="county" id="county" >
    <option value="">---请选择县城---</option>
</select>
</body>
</html>