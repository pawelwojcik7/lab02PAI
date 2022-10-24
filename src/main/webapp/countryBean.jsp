<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page import="javax.servlet.http.HttpServletResponse" %>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.lab11.*" %>
<%@ page import="java.util.List" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="errorPage.jsp" %>

<html>
<head>
    <title>Country bean</title>
</head>
<body>

<%
   ArrayList<CountryBean> list = (ArrayList<CountryBean>)session.getAttribute("list");
   for(CountryBean country:list){
   out.print(country.getName());
   }
%>

</body>
</html>