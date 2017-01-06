<%--
  Created by IntelliJ IDEA.
  User: lyr
  Date: 17-1-6
  Time: 下午3:25
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <c:if test="${!empty errorMsg}">
        <h3>${errorMsg}</h3>
    </c:if>
    <form action="register" method="post">
        <p>
            <label for="username">用户名</label>
            <input type="text" id="username" name="username">
        </p>
        <p>
            <label for="password">密码</label>
            <input type="password" id="password" name="password">
        </p>
        <p>
            <label for="email">Email</label>
            <input type="email" id="email" name="email">
        </p>
        <p>
            <input type="submit" value="注册">
        </p>
    </form>
</body>
</html>
