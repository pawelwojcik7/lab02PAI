
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="errorPage.jsp" %>



<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="calcWithBean.jsp" method="POST">
    <jsp:useBean id="loan" class="com.example.lab11.LoanBean" scope="session" />
    <jsp:setProperty name="loan" property="*" />
    Kwota pożyczki: <input name="kwota", value="<%=loan.getKwota()%>"><br>
    Kwota pożyczki: <input name="oprocentowanie", value="<%=loan.getOprocentowanie()%>"><br>
    Kwota pożyczki: <input name="ileRat", value="<%=loan.getIleRat()%>"><br>
    <input type = "submit" value="Wyślij" id = "wyslij" name="wyslij" ><br><br>
    <%=loan.getRata()%>
</form>


</body>
</html>