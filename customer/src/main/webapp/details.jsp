<%--
  User: Askyi
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <title>详情</title>
</head>
<body>
    <table align="center" border="1" style="text-align: center">

        <tr>
            <th>学号</th>
            <th>姓名</th>
            <th>扣分</th>
            <th>理由</th>
            <th>日期</th>
        </tr>
    <c:forEach items="${credit}" var="c">
        <tr>
            <td>${stu.stuNum}</td>
            <td>${stu.stuName}</td>
            <td>${c.creScore}分</td>
            <td>${c.creReason}</td>
            <td><fmt:formatDate pattern="yyyy年MM月dd日" value="${c.creDate}" /></td>
        </tr>
    </c:forEach>
        <c:if test="${credit.size()<1}">
            <tr><td colspan="5">无扣分情况！</td></tr>
        </c:if>
    </table>

</body>
</html>
