<%--
  Created by IntelliJ IDEA.
  User: kubas
  Date: 18.10.2022
  Time: 17:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Wprowadzono błędne dane!</h2>
<p>Pojawił się następujący błąd:
  <%= exception.getMessage() %>. <br />
</p>
<a href="calcWithBean.jsp">Powrot do kalkulatora</a>
</body>
</html>
