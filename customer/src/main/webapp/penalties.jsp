<%--
  User: Askyi
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>扣分</title>
</head>
<body>
    <form action="/doPenalties/${stu.stuId}" method="post">
        <table>
            <tr>
                <td>姓名：</td>
                <td>${stu.stuName}</td>
            </tr>

            <tr>
                <td>剩余学分：</td>
                <td>${stu.stuCredit}分</td>
            </tr>

            <tr>
                <td>扣分值：</td>
                <td>
                    <label>
                        <input type="text" name="creScore"/>
                    </label>
                </td>
            </tr>
            <tr>
                <td>扣分原因：</td>
                <td>
                    <label>
                        <textarea name="creReason"></textarea>
                    </label>
                </td>
            </tr>
            <tr>
                <td><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form>
</body>
</html>
