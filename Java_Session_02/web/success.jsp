<%--
  Created by IntelliJ IDEA.
  User: MrLee_86
  Date: 2020/1/7
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>登录成功页面</title>
</head>
<body>

    <h1><%=request.getSession().getAttribute("user") %>,欢迎登录！</h1>
    <%

    %>
    <c:if test="true">
        我是真的....
    </c:if>

    <c:forEach begin="1" end="10" var="i" step="2" varStatus="s">

    </c:forEach>
</body>
</html>
