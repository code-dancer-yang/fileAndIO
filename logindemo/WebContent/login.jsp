<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
<%


 Object username= request.getSession().getAttribute("username");
if(username!=null){
	    response.sendRedirect(request.getContextPath()+"/success.jsp");
}



%>

    <script>
        window.onload = function(){
            document.getElementById("img").onclick = function(){
                this.src="/logindemo/checkCodeServlet?time="+new Date().getTime();
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

    <form action="/logindemo/login" method="post">
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
                <td colspan="2"><img id="img" src="/logindemo/checkCodeServlet"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="登录"></td>
            </tr>
        </table>


    </form>


    <div><%=request.getAttribute("msg_checkCode") == null ? "" : request.getAttribute("msg_checkCode")%></div>
    <div><%=request.getAttribute("msg_user") == null ? "" : request.getAttribute("msg_user") %></div>

</body>
</html>