<html>
<head>
    <meta charset="UTF-8">
    <title >aaa</title>
    <script type="text/javascript">
        function arraymax(){
            var i,max=this[0];
            for (i = 0; i <this.length ; i++) {
                if(max<this[i]){
                    max=this[i];
                }
            }
            return max;
        }
        function arrayprint(){
            for (var i = 0; i <this.length ; i++) {
                document.write(this[i]+"&nbsp");
            }
            document.write("<br />")
        }
        Array.prototype.max=arraymax;
        Array.prototype.print=arrayprint;
        var array=new Array(32,8,-12,156,78);
        document.write("数组元素值：");
        array.print();
        document.write("数组中最大的元素值为："+array.max());
    </script>
</head>
<body>

<%--<center>--%>
<%--<form action="/getParameter" method="post">--%>
<%--    用户注册<br>--%>
<%--    姓名<input type="text" name="name"><br>--%>
<%--    密码<input type="password" name="password"><br>--%>
<%--    年龄<input type="text" name="age"><br>--%>
<%--    <input type="submit" value="注册">--%>
<%--<input type="reset" value="重置">--%>
<%--</form>--%>
<%--</center>--%>

</body>
</html>
