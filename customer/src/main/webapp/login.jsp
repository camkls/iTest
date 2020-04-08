<%--
  User: Askyi
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>
    <form action="login" method="post">
        <table>
            <tr>
                <th>登陆</th>
            </tr>
            <tr>
                <td>
                    用户名：
                </td>
                <td>
                    <label>
                        <input type="text" name="username" >
                    </label>
                </td>
            </tr>
            <tr>
                <td>
                    密码：
                </td>
                <td>
                    <label>
                        <input type="text" name="password">
                    </label>
                </td>

            </tr>
            <tr>
                <td>
                    <input type="submit" value="登陆">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
