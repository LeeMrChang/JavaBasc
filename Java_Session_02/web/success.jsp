<%--
  Created by IntelliJ IDEA.
  User: MrLee_86
  Date: 2020/1/7
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功页面</title>
</head>
<body>

    <h1><%=request.getSession().getAttribute("user") %>,欢迎登录！</h1>
    <%
     pageContext.get
    %>
</body>
</html>
