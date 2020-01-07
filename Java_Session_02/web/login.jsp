
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
    <script>
        window.onload = function(){
            document.getElementById("msg").onclick = function () {
                var time = new Date().getTime();
                this.src = "/CheckcodeServlet?time="+ time;
            }
        }
    </script>
    <style>
        div{
           color: red;
        }
    </style>
</head>
<body>
   <form action="login" method="post">
       <table>
           <tr>
               <td>用户名</td>
               <td><input type="text" name="username"></td>
           </tr>
           <tr>
               <td>密码</td>
               <td><input type="password" name="password"></td>
           </tr>
           <tr>
               <td>验证码</td>
               <td><input type="text" name="checkCode"></td>
           </tr>
           <tr>
               <td colspan="2"><img src="CheckcodeServlet" id="msg"></td>
           </tr>
           <tr>
               <td colspan="2"><input type="submit" value="登录"></td>
           </tr>
       </table>
   </form>

    <div><%=request.getAttribute("login_error") == null ? "":request.getAttribute("login_error")%></div>
    <div><%=request.getAttribute("code_error") == null ? "":request.getAttribute("code_error")%></div>

</body>

</html>
