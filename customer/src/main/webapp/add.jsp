<%--
  User: Askyi
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加</title>
</head>
<body>
<form action="insert" method="post">
    <table>
        <tr>
            <td>姓名：</td>
            <td>
                <label>
                    <input type="text" name="stuName">
                </label>
            </td>
        </tr>

        <tr>
            <td>性别：</td>
            <td>
                <label>
                    <select name="stuGender">
                        <option value="男">男</option>
                        <option value="女">女</option>
                    </select>
                </label>
            </td>
        </tr>

        <tr>
            <td>年龄：</td>
            <td>
                <label>
                    <input type="text" name="stuAge"/>
                </label>
            </td>
        </tr>

        <tr>
            <td>学历：</td>
            <td>
                <label>
                    <select name="stuEdu">
                        <option value="本科">本科</option>
                        <option value="专科">专科</option>
                    </select>
                </label>
            </td>
        </tr>

        <tr>
            <td>班级：</td>
            <td>
                <label>
                <select name="stuClass">
                    <option value="10">10</option>
                    <option value="20">20</option>
                    <option value="30">30</option>
                </select>
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
