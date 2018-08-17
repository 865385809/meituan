<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>手机认证</title>
    <link href="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap-datetimepicker.min.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/js/jquery-3.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <style type="text/css">
        #login{ width:450px; height:100px; margin:50px auto;}
        #btn{ margin-left:100px; margin-top:-25px; width: 120px;height: 25px; font-size: 11px; }
        body{ background-color: #ecfcf9;}
    </style>
</head>AlipayConfig.java
<!-- 图片验证码  -->
<script src="${pageContext.request.contextPath}/static/js/gVerify.js"></script>
<script>
    $(function(){
        var verifyCode = new GVerify("v_container");
        document.getElementById("code_input").onblur = function(){
            var res = verifyCode.validate(document.getElementById("code_input").value);
            if(res){
                alert("验证正确");
            }else{
                alert("验证码错误");
            }
        }
    })
</script>
<!-- 发送短信验证码倒计时-->
<script type="text/javascript">
    var InterValObj; //timer变量，控制时间
    var count = 30; //间隔函数，1秒执行
    var curCount;//当前剩余秒数
    function sendMessage(){curCount = count;
        $("#btn").attr("disabled", "true");
        $("#btn").val(curCount + "秒后可重新发送");
        InterValObj = window.setInterval(SetRemainTime, 1000); //启动计时器，1秒执行一次请求后台发送验证码 TODO
    }
    //timer处理函数
    function SetRemainTime() {
        if (curCount == 0) {
            window.clearInterval(InterValObj);//停止计时器
            $("#btn").removeAttr("disabled");//启用按钮
            $("#btn").val("重新发送验证码");
        }
        else {
            curCount--;
            $("#btn").val(curCount + "秒后可重新发送");
        }
    }
</script>
<body>
<div class="container">
    <div  id="login">
        <form class="form-horizontal" role="form">
            <div class="form-group">
                <label class="col-sm-2 control-label">验证码</label>
                <div class="col-sm-5">
                    <input type="text" class="form-control" id="code_input" placeholder="请输入验证码"  required autofocus>
                    <span id="v_container"></span>
                </div>
            </div>
            <div class="form-group" style="position: relative;top:50px;">
                <label class="col-sm-2 control-label">手机号</label>
                <div class="col-sm-5">
                    <input type="text" class="form-control" id="phone" name="phone" placeholder="请输入您的手机号"  required autofocus>
                </div>
            </div>
            <div class="form-group" style="position: relative;top:50px;">
                <label class="col-sm-2 control-label">验证码</label>
                <div class="col-sm-3">
                    <input type="code" class="form-control" id="code" name="code" placeholder="验证码" required>
                    <input class="btn btn-default" id="btn" name="btn" value="发送验证码" onclick="sendMessage()" />
                </div>
            </div>
            <div class="form-group" style="position: relative;top:50px;">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="button" class="btn btn-info" id="lo">验证</button>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
<!-- 发送短信验证码并验证  -->
<script type="text/javascript">
    var sms="";
    //发送
    $("#btn").click(function(){
        var phone=$("#phone").val();
        if(phone!="")
        {
            $.ajax({
                url:"${pageContext.request.contextPath}/codeController/sendSMS",
                type:"post",
                data:{"phone":phone},
                dataType:"json",
                success:function(result){
                    if(result.status==1){
                        sms=result.data;
                    }
                }
            });
        }else{
            alert("请输入手机号");
            return false;
        }
    });
    //验证
    $("#lo").click(function(){
        var code=$("#code").val();
        if(code==""){
            alert("请输入验证码");
        }else{
            if(sms==code){
                alert("验证成功");
//                window.location.href="http://localhost:8866/TestCode/jsp/success.jsp";
            }else{
                alert("验证码错误");
            };
        };
    });
</script>
</html>
