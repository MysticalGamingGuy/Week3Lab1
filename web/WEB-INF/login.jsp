<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
<h1>Login</h1>
<form method="post" action="loginservlet">
    <input name="user" type="text" placeholder="Username"> <br>
    <input name="pass" type="password" placeholder="Password"> <br>
    <input type="submit" value="Login">
    <p>${message}</p>
</form>
<c:import url="/includes/footer.html" />

