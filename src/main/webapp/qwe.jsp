<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台系统</title>
    <link href="${pageContext.request.contextPath}/static/adminlist/style/authority/main_css.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/static/adminlist/style/authority/zTreeStyle.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/adminlist/scripts/jquery/jquery-1.7.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/adminlist/scripts/zTree/jquery.ztree.core-3.2.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/adminlist/scripts/authority/commonAll.js"></script>
    <script type="text/javascript">
        /* zTree插件加载目录的处理  */
        var zTree;
        var setting = {
            view: {
                dblClickExpand: false,
                showLine: false,
                expandSpeed: ($.browser.msie && parseInt($.browser.version)<=6)?"":"fast"
            },
            data: {
                key: {
                    name: "resourceName"
                },
                simpleData: {
                    enable:true,
                    idKey: "resourceID",
                    pIdKey: "parentID",
                    rootPId: ""
                }
            },
            callback: {
                onClick: zTreeOnClick
            }
        };

        var curExpandNode = null;
        function beforeExpand(treeId, treeNode) {
            var pNode = curExpandNode ? curExpandNode.getParentNode():null;
            var treeNodeP = treeNode.parentTId ? treeNode.getParentNode():null;
            for(var i=0, l=!treeNodeP ? 0:treeNodeP.children.length; i<l; i++ ) {
                if (treeNode !== treeNodeP.children[i]) {
                    zTree.expandNode(treeNodeP.children[i], false);
                }
            }
            while (pNode) {
                if (pNode === treeNode) {
                    break;
                }
                pNode = pNode.getParentNode();
            }
            if (!pNode) {
                singlePath(treeNode);
            }

        }
        function singlePath(newNode) {
            if (newNode === curExpandNode) return;
            if (curExpandNode && curExpandNode.open==true) {
                if (newNode.parentTId === curExpandNode.parentTId) {
                    zTree.expandNode(curExpandNode, false);
                } else {
                    var newParents = [];
                    while (newNode) {
                        newNode = newNode.getParentNode();
                        if (newNode === curExpandNode) {
                            newParents = null;
                            break;
                        } else if (newNode) {
                            newParents.push(newNode);
                        }
                    }
                    if (newParents!=null) {
                        var oldNode = curExpandNode;
                        var oldParents = [];
                        while (oldNode) {
                            oldNode = oldNode.getParentNode();
                            if (oldNode) {
                                oldParents.push(oldNode);
                            }
                        }
                        if (newParents.length>0) {
                            for (var i = Math.min(newParents.length, oldParents.length)-1; i>=0; i--) {
                                if (newParents[i] !== oldParents[i]) {
                                    zTree.expandNode(oldParents[i], false);
                                    break;
                                }
                            }
                        }else {
                            zTree.expandNode(oldParents[oldParents.length-1], false);
                        }
                    }
                }
            }
            curExpandNode = newNode;
        }

        function onExpand(event, treeId, treeNode) {
            curExpandNode = treeNode;
        }

        /** 用于捕获节点被点击的事件回调函数  **/
        function zTreeOnClick(event, treeId, treeNode) {
            var zTree = $.fn.zTree.getZTreeObj("dleft_tab1");
            zTree.expandNode(treeNode, null, null, null, true);
            // 		zTree.expandNode(treeNode);
            // 规定：如果是父类节点，不允许单击操作
            if(treeNode.isParent){
                // 			alert("父类节点无法点击哦...");
                return false;
            }
            // 如果节点路径为空或者为"#"，不允许单击操作
            if(treeNode.accessPath=="" || treeNode.accessPath=="#"){
                //alert("节点路径为空或者为'#'哦...");
                return false;
            }
            // 跳到该节点下对应的路径, 把当前资源ID(resourceID)传到后台，写进Session
            rightMain(treeNode.accessPath);

            if( treeNode.isParent ){
                $('#here_area').html('当前位置：'+treeNode.getParentNode().resourceName+'&nbsp;>&nbsp;<span style="color:#1A5CC6">'+treeNode.resourceName+'</span>');
            }else{
                $('#here_area').html('当前位置：系统&nbsp;>&nbsp;<span style="color:#1A5CC6">'+treeNode.resourceName+'</span>');
            }
        };




        $(document).ready(function(){
            $(document).ajaxStart(onStart).ajaxSuccess(onStop);
            /** 默认异步加载"业务模块"目录  **/
            loadMenu('YEWUMOKUAI', "dleft_tab1");
            // 默认展开所有节点
            if( zTree ){
                // 默认展开所有节点
                zTree.expandAll(true);
            }
        });

        function loadMenu(resourceType, treeObj){
            data = [{"accessPath":"","checked":false,"delFlag":0,"parentID":1,"resourceCode":"","resourceDesc":"","resourceGrade":2,"resourceID":3,"resourceName":"基础数据","resourceOrder":0,"resourceType":""},
                {"accessPath":"house_list.html","checked":false,"delFlag":0,"parentID":3,"resourceCode":"","resourceDesc":"","resourceGrade":3,"resourceID":7,"resourceName":"房源管理","resourceOrder":0,"resourceType":""},

            ];
            // 如果返回数据不为空，加载"业务模块"目录
            if(data != null){
                // 将返回的数据赋给zTree
                $.fn.zTree.init($("#"+treeObj), setting, data);
//              alert(treeObj);
                zTree = $.fn.zTree.getZTreeObj(treeObj);
                if( zTree ){
                    // 默认展开所有节点
                    zTree.expandAll(true);
                }
            }
        }

        //ajax start function
        function onStart(){
            $("#ajaxDialog").show();
        }

        //ajax stop function
        function onStop(){
            // 		$("#ajaxDialog").dialog("close");
            $("#ajaxDialog").hide();
        }
    </script>
</head>
<body onload="getDate01()">
<!--顶部-->
<div id="top">
    <div id="top_logo">
        <img alt="logo" src="${pageContext.request.contextPath}/static/adminlist/images/common/logo.jpg" width="274" height="49" style="vertical-align:middle;">
    </div>
</div>
<!-- 业务模块 -->
<div id="side">
    <div id="left_menu">
        <ul id="TabPage2" style="height:200px; margin-top:50px;">
            <li id="left_tab1" class="selected" onClick="javascript:switchTab('TabPage2','left_tab1');" title="业务模块">
                <img alt="业务模块" title="业务模块" src="${pageContext.request.contextPath}/static/adminlist/images/common/1_hover.jpg" width="33" height="31">
            </li>
        </ul>
    </div>

    <div id="left_menu_cnt">
        <div id="nav_module">
            <img src="${pageContext.request.contextPath}/static/adminlist/images/common/module_1.png" width="210" height="58"/>
        </div>
        <div id="nav_resource">
            <ul id="dleft_tab1" class="ztree"></ul>
        </div>
    </div>
</div>
<!-- 系统介绍 -->
<div id="top_nav">
    <span id="here_area">当前位置：系统&nbsp;>&nbsp;系统介绍</span>
</div>
<!--内容-->
<div id="main">
    <iframe  id="rightMain" width="100%" height="100%" />
</div>
</body>


</html>
