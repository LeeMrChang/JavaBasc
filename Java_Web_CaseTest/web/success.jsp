<%--
  Created by IntelliJ IDEA.
  User: MrLee_86
  Date: 2020/1/10
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功！</title>
</head>
<body>

    <div>
        ${contact.username},欢迎您
    </div>
    <div align="center">
        <a href="${pageContext.request.contextPath}/servletList">查询所有用户信息
        </a>
    </div>
</body>
</html>
