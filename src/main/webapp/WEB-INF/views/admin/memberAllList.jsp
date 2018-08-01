<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>会员信息管理</title>
    <%--request.getContextPath()以斜线开始，不以斜线结束--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.12.4.min.js"></script>
    <link href="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>


</head>
<body>
<%--员工修改的模态框--%>
<div class="modal fade" id="memberUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" >会员修改</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <%--会员用户名--%>
                    <div class="form-group">
                        <label for="mUsername_add_input" class="col-sm-2 control-label">Username</label>
                        <div class="col-sm-10">
                            <p class="form-control-static" id="mUsername_update_static"></p>
                        </div>
                    </div>
                    <%--会员密码--%>
                    <div class="form-group">
                        <label for="mPassword_add_input" class="col-sm-2 control-label">Password</label>
                        <div class="col-sm-10">
                            <input type="text" name="mPassword" class="form-control" id="mPassword_update_input" placeholder="请输入密码">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <%--会员邮箱--%>
                    <div class="form-group">
                        <label for="mMail_add_input" class="col-sm-2 control-label">Mail</label>
                        <div class="col-sm-10">
                            <input type="text"  name="mMailbox" class="form-control" id="mMail_update_input" placeholder="123@qq.com">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <%--会员手机--%>
                    <div class="form-group">
                        <label for="mPhone_add_input"  class="col-sm-2 control-label">Phone</label>
                        <div class="col-sm-10">
                            <input type="text" name="mPhone" class="form-control" id="mPhone_update_input" placeholder="请输入11位数字的手机号">
                            <span class="help-block"></span>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" id="member_update_btn">修改</button>
            </div>
        </div>
    </div>
</div>
<%--员工添加的模态框--%>
<div class="modal fade" id="memberAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">会员注册</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <%--会员用户名--%>
                    <div class="form-group">
                        <label for="mUsername_add_input" class="col-sm-2 control-label">Username</label>
                        <div class="col-sm-10">
                            <input type="text" name="mUsername" class="form-control" id="mUsername_add_input" placeholder="请输入用户名">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <%--会员密码--%>
                    <div class="form-group">
                        <label for="mPassword_add_input" class="col-sm-2 control-label">Password</label>
                        <div class="col-sm-10">
                            <input type="text" name="mPassword" class="form-control" id="mPassword_add_input" placeholder="请输入密码">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <%--会员邮箱--%>
                    <div class="form-group">
                        <label for="mMail_add_input" class="col-sm-2 control-label">Mail</label>
                        <div class="col-sm-10">
                            <input type="text"  name="mMailbox" class="form-control" id="mMail_add_input" placeholder="123@qq.com">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <%--会员手机--%>
                    <div class="form-group">
                        <label for="mPhone_add_input"  class="col-sm-2 control-label">Phone</label>
                        <div class="col-sm-10">
                            <input type="text" name="mPhone" class="form-control" id="mPhone_add_input" placeholder="请输入11位数字的手机号">
                            <span class="help-block"></span>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" id="member_sava">Save</button>
            </div>
        </div>
    </div>
</div>
12
<%--会员修改模态框--%>
<script type="text/javascript">
    //这样的话是在创建按钮之前就绑定了，绑定不上
//    $(".edit_btn").click(function () {
//        alert("edit");
//    });
    //jquery新版没有live,使用on进行替代
    $(document).on("click",".edit_btn",function () {
        //查询会员信息
        findMember($(this).attr("edit_id"));
        //显示模态框
        $("#member_update_btn").attr("edit_btn_id",$(this).attr("edit_id"));
        $("#memberUpdateModal").modal({
           backdrop:"static"
        });
    });
    //修改前查询会员信息
    function findMember(m_id){
        $.ajax({
            url:"${pageContext.request.contextPath}/memberController/findMember/" +m_id,
            type:"GET",
            success:function(result){
                //console.log(result);
                var memberData = result.extend.member;
                $("#mUsername_update_static").text(memberData.mUsername);
                $("#mPassword_update_input").val(memberData.mPassword);
                $("#mMail_update_input").val(memberData.mMailbox);
                $("#mPhone_update_input").val(memberData.mPhone);
            }
        });
    }
    //更新会员信息
    $("#member_update_btn").click(function () {
        //密码
        var memberpassword = $("#mPassword_update_input").val();
        var regpassword = /^([a-zA-Z0-9_-]{6,18}$)/;
        if(!regpassword.test(memberpassword)){
            show_validate_msg("#mPassword_update_input", "error", "密码可以是6-18位的字母数字");
            return false;
        }else{
            show_validate_msg("#mPassword_update_input", "success", "");
        }
        //邮箱
        var membermail = $("#mMail_update_input").val();
        var regmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
        if(!regmail.test(membermail)){
            show_validate_msg("#mMail_update_input", "error", "邮箱格式不正确");
            return false;
        }else{
            show_validate_msg("#mMail_update_input", "success", "");
        }
        //手机验证
        var memberphone =  $("#mPhone_update_input").val();
        var regphone = /^1\d{10}$/;
        if(!regphone.test(memberphone)){
            show_validate_msg("#mPhone_update_input", "error", "手机的长度是以1开头的11位数字");
            return false;
        }else{
            show_validate_msg("#mPhone_update_input", "success", "");
        }
        //发送ajax请求更新会员
        $.ajax({
            url:"${pageContext.request.contextPath}/memberController/updateMember/" + $(this).attr("edit_btn_id"),
            type:"POST",
            data:$("#memberUpdateModal form").serialize() + "&_method=PUT",
            success:function (result) {
                alert(result.msg);
            }
        });
    });
</script>
<%--会员显示页面--%>
<div class="container">
    <%--标题--%>
    <div class="row">
        <div class="col-md-12">
            <h1>Meituan_Member</h1>
        </div>
    </div>
    <%--按钮--%>
    <div class="row">
        <div class="col-md-4 col-md-offset-10">
            <%--注意点击事件的JS代码应该放在下面，因为js代码的执行顺序--%>
            <button id="member_add_modal_btn" class="btn btn-primary" >添加</button>
            <button class="btn btn-danger" >删除</button>
        </div>
    </div>
    <%--会员的列表--%>
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover" id="member_tables">
                <thead>
                    <tr>
                        <th>会员的ID</th>
                        <th>会员名称</th>
                        <th>会员邮箱</th>
                        <th>会员手机</th>
                        <th>操作</th>
                    </tr>
                </thead>
                <tbody>
                </tbody>
            </table>
        </div>
    </div>
    <%--显示分页的信息--%>
    <div class="row">
        <%--分页的文字信息--%>
        <div class="col-md-6" id="page_info"></div>
        <%--分页条信息--%>
        <div class="col-md-6" id="page_nav"></div>
    </div>
</div>
<%--分页ajax--%>
<script type="text/javascript">
    var totalRecord;
    //只要进入页面就会发送请求发送ajax得到分页数据
    $(function(){
        to_page(1);
    });

    //调到指定的页面
    function to_page(pn){
        $.ajax({
            url:"${pageContext.request.contextPath}/memberController/findAllMemberJson",
            data:"pn="+pn,
            type:"GET",
            success:function(result){
                // console:log(result);
                // 解析会员数据
                build_member_table(result);
                //解析显示分页信息
                build_page_info(result);
                //解析分页条信息
                build_page_nav(result);
            }
        });
    }
    //解析分页条信息
    function build_page_nav(result){
        //每次都要清空
        $("#page_nav").empty();
        var ul = $("<ul></ul>").addClass("pagination");
        //首页前一页
        var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
        var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
        //判断是否有前一页
        if(result.extend.memberListPage.hasPreviousPage == false){
            firstPageLi.addClass("disabled");
            prePageLi.addClass("disabled");
        }else{
            //为元素添加点击翻页的事件
            firstPageLi.click(function(){
                to_page(1);
            });
            prePageLi.click(function(){
                to_page(result.extend.memberListPage.pageNum -1);
            });
        }
        //后一页，末页
        var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
        var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
        //是否有后一页
        if(result.extend.memberListPage.hasNextPage == false){
            nextPageLi.addClass("disabled");
            lastPageLi.addClass("disabled");
        }else{
            nextPageLi.click(function(){
                to_page(result.extend.memberListPage.pageNum +1);
            });
            lastPageLi.click(function(){
                to_page(result.extend.memberListPage.pages);
            });
        }
        ul.append(firstPageLi).append(prePageLi);   //添加首页和前一页
        //1,2，3遍历给ul中添加页码提示
        $.each(result.extend.memberListPage.navigatepageNums,function(index,item){
            var numLi = $("<li></li>").append($("<a></a>").append(item));
            if(result.extend.memberListPage.pageNum == item){
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
    }

    //解析显示分页信息
    function build_page_info(result) {
        $("#page_info").empty();
        $("#page_info").append("当前"+result.extend.memberListPage.pageNum+"页,总"+
            result.extend.memberListPage.pages+"页,总"+
            result.extend.memberListPage.total+"条记录");
        totalRecord = result.extend.memberListPage.total;
        currentPage = result.extend.memberListPage.pageNum;
    }
    //解析会员数据
    function build_member_table(result){
        //清空table表格
        $("#member_tables tbody").empty();
        var members = result.extend.memberListPage.list;
        $.each(members,function (index,item) {
            var mId = $("<td></td>").append(item.mId);
            var mUsername = $("<td></td>").append(item.mUsername);
            var mMailbox = $("<td></td>").append(item.mMailbox);
            var mPhone = $("<td></td>").append(item.mPhone);
            //两个按钮
            var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn")
                .append($("<span></span>").addClass("glyphicon glyphicon-pencil").append("编辑"))
                .attr("edit_id",item.mId);
            var deleteBtn = $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
                .append($("<span></span>").addClass("glyphicon glyphicon-trash").append("删除"));
            var btnTd = $("<td></td>").append(editBtn).append(" ").append(deleteBtn);
            //append方法执行完还是返回原来的元素
            $("<tr></tr>").append(mId)
                .append(mUsername)
                .append(mMailbox)
                .append(mPhone)
                .append(btnTd)
                .appendTo("#member_tables tbody");

        });
    }
</script>
<%--前台校验--%>
<script type="text/javascript">
    //数据得校验
    function validate_add_form() {

        //用户名
        var membername = $("#mUsername_add_input").val();
        var regname = /^([a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5}$)/;
        if(!regname.test(membername)){
            show_validate_msg("#mUsername_add_input", "error", "用户名可以是2-5位中文或者6-16位英文和数字的组合");
            return false;
        }else{
            show_validate_msg("#mUsername_add_input", "success", "");
        }
        //密码
        var memberpassword = $("#mPassword_add_input").val();
        var regpassword = /^([a-zA-Z0-9_-]{6,18}$)/;
        if(!regpassword.test(memberpassword)){
            show_validate_msg("#mPassword_add_input", "error", "密码可以是6-18位的字母数字");
            return false;
        }else{
            show_validate_msg("#mPassword_add_input", "success", "");
        }
        //邮箱
        var membermail = $("#mMail_add_input").val();
        var regmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
        if(!regmail.test(membermail)){
            show_validate_msg("#mMail_add_input", "error", "邮箱格式不正确");
            return false;
        }else{
            show_validate_msg("#mMail_add_input", "success", "");
        }
        //手机验证
        var memberphone =  $("#mPhone_add_input").val();
        var regphone = /^1\d{10}$/;
        if(!regphone.test(memberphone)){
            show_validate_msg("#mPhone_add_input", "error", "手机的长度是以1开头的11位数字");
            return false;
        }else{
            show_validate_msg("#mPhone_add_input", "success", "");
        }
        return true;
    }
    //显示校验结果的提示信息
    function show_validate_msg(ele,status,msg){
        //清除当前元素的校验状态
        $(ele).parent().removeClass("has-success has-error");
        $(ele).next("span").text("");
        if("success"==status){
            $(ele).parent().addClass("has-success");
            $(ele).next("span").text(msg);
        }else if("error" == status){
            $(ele).parent().addClass("has-error");
            $(ele).next("span").text(msg);
        }
    }
</script>
<%--用户名校验--%>
<script type="text/javascript">
    //校验用户名是否可用
    $("#mUsername_add_input").change(function(){
        //发送ajax请求校验用户名是否可用
        var membername = this.value;
        $.ajax({
            url:"${pageContext.request.contextPath}/memberController/checkmember",
            data:"membername="+membername,
            type:"POST",
            success:function(result){
                if(result.code==100){
                    show_validate_msg("#mUsername_add_input","success","用户名可用");
                    $("#member_sava").attr("ajax-va","success");
                }else{
                    show_validate_msg("#mUsername_add_input","error",result.extend.va_msg);
                    $("#member_sava").attr("ajax-va","error");
                }
            }
        });
    });
</script>
<%--打开模态框新增--%>
<script type="text/javascript">
    <%--打开模态框--%>
    //清空表单样式及内容
    function reset_form(ele){
        $(ele)[0].reset();
        //清空表单样式
        $(ele).find("*").removeClass("has-error has-success");
        $(ele).find(".help-block").text("");
    }
    //点击新增按钮弹出模态框。
    $("#member_add_modal_btn").click(function(){
        //重置模态框,清空表单样式及内容
        reset_form("#memberAddModal form");
        //本来是要发送ajax请求查询部门的信息
        //弹出模态框
        $("#memberAddModal").modal({
            backdrop:"static"
        });
    });

    //添加会员
    $("#member_sava").click(function () {
        //校验失败就不提交
        if(!validate_add_form()){
            return false;
        }
        //1、判断之前的ajax用户名校验是否成功。如果成功。
        if($(this).attr("ajax-va")=="error"){
            return false;
        }
        $.ajax({
            url:"${pageContext.request.contextPath}/memberController/member_save",
            type:"POST",
            data:$("#memberAddModal form").serialize(),
            success:function (result) {
                if(result.code == 100){
                    //员工保存成功；
                    //1、关闭模态框
                    $("#memberAddModal").modal('hide');
                    //2、来到最后一页，显示刚才保存的数据
                    to_page(totalRecord);
                }else{
                    //显示失败信息
                    //有哪个字段的错误信息就显示哪个字段的；
                    if(undefined != result.extend.errorFields.mMailbox){
                        //显示邮箱错误信息
                        show_validate_msg("#mMail_add_input", "error", result.extend.errorFields.mMailbox);
                    }
                    if(undefined != result.extend.errorFields.mUsername){
                        //显示员工名字的错误信息
                        show_validate_msg("#mUsername_add_input", "error", result.extend.errorFields.mMailbox);
                    }
                    if(undefined != result.extend.errorFields.mPassword){
                        //显示邮箱错误信息
                        show_validate_msg("#mPassword_add_input", "error", result.extend.errorFields.mPassword);
                    }
                    if(undefined != result.extend.errorFields.mPhone){
                        //显示员工名字的错误信息
                        show_validate_msg("#mPhone_add_input", "error", result.extend.errorFields.mPhone);
                    }
                }
            }
        });
    });
</script>
</body>
</html>
