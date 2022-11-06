package com.example.lab11;

import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ListServlet", urlPatterns = {"/ListServlet"})
public class ListServlet extends HttpServlet {

    private final Statement statement;

    //language=sql
    private static final String query = "SELECT * FROM Country WHERE Continent = 'Europe'";

    @SneakyThrows
    public ListServlet() {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?serverTimezone=UTC", "root", "");
        this.statement = connection.createStatement();

    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {

        ResultSet rs = statement.executeQuery(query);
        HttpSession session = request.getSession(true);
        CountryBean country;
        ArrayList<CountryBean> list = new ArrayList<CountryBean>();
        while (rs.next()) {
            country = new CountryBean();
            //pobranie danych i przypisanie ich do CountryBean
            country.setName(rs.getString("name"));
            country.setCode(rs.getString("code"));
            country.setPopulation(rs.getLong("population"));
            country.setSurfaceArea(rs.getLong("surfaceArea"));
            list.add(country);

        }
        session.setAttribute("list", list);
        response.sendRedirect("countryBean.jsp");

    }

    @SneakyThrows
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        processRequest(req, resp);
    }

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }


}
