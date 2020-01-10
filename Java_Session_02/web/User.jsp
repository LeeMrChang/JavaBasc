<%@ page import="java.util.List" %>
<%@ page import="com.lee.domain.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: MrLee_86
  Date: 2020/1/9
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户案例</title>
</head>
<body>

   <%
       List list = new ArrayList();
       list.add(new User("刘小",20,new Date()));
       list.add(new User("黎明",23,new Date()));
       list.add(new User("李黑",28,new Date()));
       list.add(new User("李黑",28,new Date()));
       list.add(new User("李黑",28,new Date()));
       list.add(new User("李黑",28,new Date()));

       request.setAttribute("list",list);
   %>

    <table border="1" width="500" align="center">
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>生日</th>
        </tr>
        <c:forEach items="${list}" var="user" varStatus="s">

            <c:if test="${s.count %2 == 1}">
                <tr bgcolor="aqua">
                    <th>${s.count}</th>
                    <th>${user.username}</th>
                    <th>${user.age}</th>
                    <th>${user.birthday}</th>
                </tr>
            </c:if>
            <c:if test="${s.count %2 == 0}">
                <tr bgcolor="#7fffd4">
                    <th>${s.count}</th>
                    <th>${user.username}</th>
                    <th>${user.age}</th>
                    <th>${user.birthday}</th>
                </tr>
            </c:if>

        </c:forEach>

    </table>

</body>
</html>
