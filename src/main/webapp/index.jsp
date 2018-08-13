<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>转发到主页</title>
</head>
<body>
<!-- 转发到index.jsp，为了显示帖子表 -->
<META HTTP-EQUIV="Refresh" CONTENT="0;URL=${pageContext.request.contextPath}/storeController/homeSearch">
</body>
</html>
