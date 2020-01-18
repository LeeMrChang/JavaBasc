<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <!-- 使用Edge最新的浏览器的渲染方式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同。
    width: 默认宽度与设备的宽度相同
    initial-scale: 初始的缩放比，为1:1 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>案例模板(Bootstrap)</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="js/bootstrap.min.js"></script>
    <style type="text/css">
        td, th {
            text-align: center;
        }
    </style>
</head>
<body>
<div class="container">
    <h3 style="text-align: center">用户信息列表</h3>
    <hr>
    <div style="float: left">
        <form class="form-inline">
            <div class="form-group">
                <label for="exampleInputName2">姓名</label>
                <input type="text" class="form-control" id="exampleInputName2">
            </div>
            <div class="form-group">
                <label for="exampleInputAddress2">籍贯</label>
                <input type="email" class="form-control" id="exampleInputAddress2">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail2">Email</label>
                <input type="email" class="form-control" id="exampleInputEmail2">
            </div>
            <button type="submit" class="btn btn-default">查询</button>
        </form>
    </div>

    <div style="float: right;margin: 5px;">
        <a class="btn btn-primary" href="${pageContext.request.contextPath}/add.jsp">添加联系人</a>
        <a class="btn btn-primary" href="javascript:;" id="delSelected">删除选中</a>
    </div>
    <form id="form" action="${pageContext.request.contextPath}/servletDeSelected" method="post">
        <table border="1" class="table table-bordered table-hover">
            <tr class="success">
                <th><input type="checkbox" id="one"></th>
                <th>编号</th>
                <th>姓名</th>
                <th>性别</th>
                <th>年龄</th>
                <th>籍贯</th>
                <th>QQ</th>
                <th>邮箱</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${pageBean.bean}" var="contact">
                <tr>
                    <td><input type="checkbox" name="uid" value="${contact.id}"></td>
                    <td>${contact.id}</td>
                    <td>${contact.username}</td>
                    <td>${contact.sex}</td>
                    <td>${contact.age}</td>
                    <td>${contact.address}</td>
                    <td>${contact.qq}</td>
                    <td>${contact.email}</td>
                    <td>
                        <a class="btn btn-default btn-sm"
                           href="${pageContext.request.contextPath}/servletFindContact?id=${contact.id}">修改</a>&nbsp;
                        <a class="btn btn-default btn-sm"
                           href="javascript:;" onclick="del('${contact.id}')">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </form>
    <hr>
    <div>
        <nav aria-label="Page navigation">
            <%--上一页--%>
            <ul class="pagination">
                <c:if test="${pageBean.currentPage == 1}">
                <li class="disabled">
                    </c:if>
                <c:if test="${pageBean.currentPage != 1}">
                    <li>
                </c:if>
                    <a href="${pageContext.request.contextPath}/getByPage?currentPage=${pageBean.currentPage -1}&pageSize=5"
                       aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>

                <c:forEach begin="1" end="${pageBean.totalPage}" var="i">
                    <c:if test="${pageBean.currentPage == i}">
                        <li class="active"><a
                                href="${pageContext.request.contextPath}/getByPage?currentPage=${i}&pageSize=5">${i}</a>
                        </li>
                    </c:if>
                    <c:if test="${pageBean.currentPage != i}">
                        <li><a href="${pageContext.request.contextPath}/getByPage?currentPage=${i}&pageSize=5">${i}</a>
                        </li>
                    </c:if>
                </c:forEach>
                    <%--下一页--%>
                <li>
                    <a href="${pageContext.request.contextPath}/getByPage?currentPage=${pageBean.currentPage +1}&pageSize=5" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
                <span style="font-size: 25px;margin-left: 10px">
                    共${pageBean.totalCount}条记录，共${pageBean.totalPage}页
                </span>
            </ul>
        </nav>
    </div>
</div>
</body>
<script>
    function del(id) {
        var flag = confirm("您确定要删除这条数据吗？");
        if (flag) {
            location.href = "${pageContext.request.contextPath}/servletDelete?id=" + id;
        }
    }

    window.onload = function () {
        document.getElementById("delSelected").onclick = function () {
            var flag = false;
            if (confirm("您确定要删除这些数据吗？")) {
                var cbs = document.getElementsByName("uid");
                for (var i = 0; i < cbs.length; i++) {
                    //当连列表的复选框全部与第一个复选框一致
                    if (cbs[i].checked) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    //表单提交
                    document.getElementById("form").submit();
                }
            }
        };
        //获取复选框的id
        document.getElementById("one").onclick = function () {
            var cbs = document.getElementsByName("uid");
            for (var i = 0; i < cbs.length; i++) {
                //当连列表的复选框全部与第一个复选框一致
                cbs[i].checked = this.checked;
            }
        }
    }

</script>
</html>