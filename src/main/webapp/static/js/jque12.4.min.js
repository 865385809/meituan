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
    // totalRecord = result.extend.pageInfo.total;
    // currentPage = result.extend.pageInfo.pageNum;
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
