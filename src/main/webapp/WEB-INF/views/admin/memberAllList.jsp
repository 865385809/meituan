<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>会员信息管理</title>
    <%--request.getContextPath()以斜线开始，不以斜线结束--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.12.4.min.js"></script>
    <link href="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <%--分页信息--%>


</head>
<body>
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
                        </div>
                    </div>
                    <%--会员密码--%>
                    <div class="form-group">
                        <label for="mPassword_add_input" class="col-sm-2 control-label">Password</label>
                        <div class="col-sm-10">
                            <input type="password" name="mPassword" class="form-control" id="mPassword_add_input" placeholder="请输入密码">
                        </div>
                    </div>
                    <%--会员邮箱--%>
                    <div class="form-group">
                        <label for="mMail_add_input" class="col-sm-2 control-label">Phone</label>
                        <div class="col-sm-10">
                            <input type="text"  name="mMail" class="form-control" id="mMail_add_input" placeholder="123@qq.com">
                        </div>
                    </div>
                    <%--会员手机--%>
                    <div class="form-group">
                        <label for="mPhone_add_input"  class="col-sm-2 control-label">Mail</label>
                        <div class="col-sm-10">
                            <input type="text" name="mPhone" class="form-control" id="mPhone_add_input" placeholder="请输入11位数字的手机号">
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

<script type="text/javascript">
    var totalRecord;
    //只要进入页面就会发送请求发送ajax得到分页数据
    $(function(){
        to_page(1);
    });

    //调到指定的页面
    function to_page(pn){
        $.ajax({
            url:"${pageContext.request.contextPath}/findAllMemberJson",
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
            var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm")
                .append($("<span></span>").addClass("glyphicon glyphicon-pencil").append("编辑"));
            var deleteBtn = $("<button></button>").addClass("btn btn-danger btn-sm")
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



    <%--打开模态框--%>
    //点击新增按钮弹出模态框。
    $("#member_add_modal_btn").click(function(){
        //本来是要发送ajax请求查询部门的信息
        //弹出模态框
        $("#memberAddModal").modal({
            backdrop:"static"
        });
    });
    $("#member_sava").click(function () {
        $.ajax({
            url:"${pageContext.request.contextPath}/member_save",
            type:"POST",
            data:$("#memberAddModal form").serialize(),
            success:function () {
                $("#memberAddModal").modal('hide');
                to_page(totalRecord);
            }
        });
    });
</script>
</body>
</html>
