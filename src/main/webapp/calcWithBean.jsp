<%--
  Created by IntelliJ IDEA.
  User: kubas
  Date: 18.10.2022
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="loan" class="com.example.lab11.LoanBean" scope="session" />
<jsp:setProperty name="loan" property="*" />
Kwota pożyczki: <input name="kwota", value="<%=loan.getKwota()%>">
Kwota pożyczki: <input name="oprocentowanie", value="<%=loan.getOprocentowanie()%>">
Kwota pożyczki: <input name="ileRat", value="<%=loan.getIleRat()%>">
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
