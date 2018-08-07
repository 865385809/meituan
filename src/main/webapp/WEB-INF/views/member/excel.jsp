<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表格的导入导出</title>
    <script type="text/javascript">
        $(document).ready(function(){
            $('#btn').click(function(){
                if(checkData()){
                    $('#form1').ajaxSubmit({
                        url:'uploadExcel/ajaxUpload.do',
                        dataType: 'text',
                        success: resutlMsg,
                        error: errorMsg
                    });
                    function resutlMsg(msg){
                        alert(msg);
                        $("#upfile").val("");
                    }
                    function errorMsg(){
                        alert("导入excel出错！");
                    }
                }
            });
        });

        function checkData(){
            var fileDir = $("#upfile").val();
            var suffix = fileDir.substr(fileDir.lastIndexOf("."));
            if("" == fileDir){
                alert("选择需要导入的Excel文件！");
                return false;
            }
            if(".xls" != suffix && ".xlsx" != suffix ){
                alert("选择Excel格式的文件导入！");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
    <form method="POST"  enctype="multipart/form-data" id="form1" action="${pageContext.request.contextPath}/excelController/upLoadPayerCreditInfoExcel">
                上传文件:<input id="upfile" type="file" name="upfile"><br>
                <input type="submit" value="提交" onclick="checkData()"><br>
                <input type="button" value="ajax方式提交" id="btn" name="btn" >
    </form>

    <br>
    <a href="${pageContext.request.contextPath}/excelController/excelExport">导出</a>
<script type="text/javascript">
    function exportExcel(){
        var myurl="${context}/assetInLibrary/export";
        var form=$("<form>");
        form.attr("style","display:none");
        form.attr("method","post");
        form.attr("action",myurl);
        $("body").append(form);
    }
</script>
</body>
</html>
