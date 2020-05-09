<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<div>
<h2>Hello World!</h2>
</div>
<form action="${pageContext.request.contextPath}/test.action" method="post">
    <div style="color: red">
        ${error}
    </div>
    <div>
        <input name="username" type="text" placeholder="请输入用户名">
    </div>
    <div>
        <input type="submit" value="提交">
    </div>
</form>
</body>
</html>
