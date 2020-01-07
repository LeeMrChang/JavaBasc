<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: MrLee_86
  Date: 2020/1/7
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el.jsp</title>
</head>
<body>

     <%
       request.setAttribute("name","张三");
       request.getSession().setAttribute("name","李四");
       session.setAttribute("name","wangwu");

         List list = new ArrayList();
         Map map = new HashMap();

     %>

  ${name}
  ${sessionScope.name}

</body>
</html>
