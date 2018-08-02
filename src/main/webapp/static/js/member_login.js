//点击跳转
$("#jump_login_btn").click(function () {
    window.location.href="${pageContext.request.contextPath}/member/member_login.jsp";
});
//注册ajax提交表单数据
$("#member_sava").click(function () {
    $.ajax({
        url:"${pageContext.request.contextPath}/memberController/member_save",
        type:"POST",
        data:$("#register_ul form").serialize(),
        success:function (result) {
            if(result.code == 100){
                //会员注册成功；
                window.location.href="${pageContext.request.contextPath}/member/member_login.jsp";
                alert(result.msg);
            }
        }
    });
});