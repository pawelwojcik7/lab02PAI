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
