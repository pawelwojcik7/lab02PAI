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

    private Class<?> aClass;
    private Connection connection;
    private Statement statement;

    //language=SQl
    private static final String query = "SELECT * FROM Country WHERE Continent = 'Europe'";

    @SneakyThrows
    public ListServlet() {

        this.aClass = Class.forName("com.mysql.cj.jdbc.Driver");
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?serverTimezone=UTC", "root", "");
        this.statement = this.connection.createStatement();

    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {

        ResultSet  rs = statement.executeQuery(query);
        List<CountryBean> list = new ArrayList<>();
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        while (rs.next()) {
            CountryBean bean = CountryBean.builder()
                    .code(rs.getString("code"))
                    .name(rs.getString("name"))
                    .population(rs.getLong("population"))
                    .build();
            list.add(bean);
        }

        session.setAttribute("list", list);
       // session.setAttribute("writer", out);
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
