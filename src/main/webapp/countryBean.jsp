<%@ page import="com.example.lab11.CountryBean" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Kraje Europy</title>
</head>
<body>
<h1>Kraje Europy</h1>
<% ArrayList<CountryBean> list = (ArrayList<CountryBean>) session.getAttribute("list");
    for (CountryBean country : list) {
        out.println(country.getName());
        out.println("<a href='details.jsp?i=" + list.indexOf(country) + "'>Details</a>");
        out.println("<br>");
    }

%>


</body>
</html>
