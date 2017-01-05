<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<c:if test="${!empty errorMsg}">
    <h3>${errorMsg}</h3>
</c:if>
<form action="login" method="post">
    <h2>欢迎登陆</h2>
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
        <input type="submit" value="登陆/注册">
    </p>
</form>
</body>
</html>