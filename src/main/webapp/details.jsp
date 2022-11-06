<%@ page import="com.example.lab11.CountryBean" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Details of Country</title>
</head>
<body>
<% ArrayList<CountryBean> list =
        (ArrayList<CountryBean>)session.getAttribute("list");
  CountryBean country = (list.get(Integer.parseInt(request.getParameter("i"))));
  out.println("Details of "+country.getName()+"<br>");
  out.println("Country code: "+ country.getCode()+"<br>");
  out.println("Population: "+country.getPopulation()+"<br>");
  out.println("Surface area: "+country.getSurfaceArea()+"<br>");
  out.println("<a href='countryBean.jsp?'>Country List</a>");


%>
</body>
</html>
