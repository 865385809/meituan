<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>评论</title>
    <script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/static/ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/static/ueditor/ueditor.all.min.js"> </script>
    <!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
    <!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
    <script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/static/ueditor/lang/zh-cn/zh-cn.js"></script>
    <script type=text/javascript>
        UE.getEditor('Ueditor');
    </script>

    <link rel="stylesheet" media="screen" href="${pageContext.request.contextPath}/static/css/css.css" />
    <div style="display:none"></div>
</head>
<body>
    <form id="msform" action="${pageContext.request.contextPath}/commentsController/creatCommen" method="post">
        <fieldset>
            <h2 class="fs-title">评论</h2>
            <input type="text" name="comTitle" placeholder="标题" />
            <textarea name="comContext" cols="88" rows="11" id="Ueditor"></textarea>
            <input type="text" name="storeId" placeholder="商店ID" value="${storeId}"/>
            <input type="text" name="goodsId" placeholder="商品ID" value="${goodsId}"/>
            <input type="text" name="memberId" placeholder="用户ID " value="${member.mId}" />
            <input type="text" name="comPicture" placeholder="图片" value="/static/upload/1534145404.jpg"/>
            <input type="submit" name="next" class="next action-button" value="添加评论" />
        </fieldset>
    </form>
</body>
</html>
