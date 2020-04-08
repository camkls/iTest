<%--
  User: Askyi
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>首页</title>
</head>
<body>

        <table border="1" align="center" style="text-align: center;">
            <tr>
                <th>ID</th>
                <th>学号</th>
                <th>姓名</th>
                <th>性别</th>
                <th>年龄</th>
                <th>学历</th>
                <th>班级</th>
                <th>剩余学分</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${stuList}" var="student">
            <tr>
                <td>${student.stuId}</td>
                <td>${student.stuNum}</td>
                <td>${student.stuName}</td>
                <td>${student.stuGender}</td>
                <td>${student.stuAge}</td>
                <td>${student.stuEdu}</td>
                <td>${student.stuClass}</td>
                <td>${student.stuCredit}</td>
                <td>
                    <a href="details/${student.stuId}">  <input type="button" value="扣分情况详情"/></a>
                    <a href="penalties/${student.stuId}">  <input type="button" value="扣分"/></a>
                </td>
            </tr>
            </c:forEach>

            <tr>
                <td colspan="9"><a href="add"><input type="button" value="添加"/></a></td>
            </tr>
        </table>
</body>
</html>
