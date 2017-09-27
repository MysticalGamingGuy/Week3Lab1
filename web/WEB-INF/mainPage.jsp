<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
<h1>Main Page</h1>
<p>Hello, ${user.username} <a href="loginservlet?message=Logged Out">Logout</a></p>
<c:import url="/includes/footer.html" />
