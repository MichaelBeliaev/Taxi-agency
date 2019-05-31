package com.taxiagency.dao;

import com.taxiagency.domain.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DriverJdbcDao  extends JdbcDao<Driver> implements DriverDao {
    private static final String url = "jdbc:mysql://localhost:3306/stormnet";
    private static final String user = "root";
    private static final String password = "root";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    @Override
    public List<Driver> findByName(String name) {
        String query = ("select id,name from drivers where name='"+name+"'");
        List<Driver> list = new ArrayList<>();
        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing query
            rs = stmt.executeQuery(query);

            while (rs.next())
            {
                Driver o=new Driver(rs.getString("id"));
                list.add(o);
            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try {
                con.close();
            } catch (SQLException se) { /*can't do anything */ }
            try {
                stmt.close();
            } catch (SQLException se) { /*can't do anything */ }
            try {
                rs.close();
            } catch (SQLException se) { /*can't do anything */ }
        }
        return list;
    }
}
