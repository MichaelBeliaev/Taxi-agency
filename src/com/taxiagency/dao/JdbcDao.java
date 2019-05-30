package com.taxiagency.dao;

import com.taxiagency.domain.Entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class JdbcDao <T extends Entity> implements Dao<T>{

    private static final String url = "jdbc:mysql://localhost:3306/stormnet";
    private static final String user = "root";
    private static final String password = "root";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    @Override
    public void save(T obj) {
/*
        String query = "insert into drivers (id, name) VALUES";

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing query
            rs = stmt.executeUpdate(query);

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try {
                con.close();
            } catch (SQLException se) { se.printStackTrace();}
            try {
                stmt.close();
            } catch (SQLException se) { se.printStackTrace(); }
            try {
                rs.close();
            } catch (SQLException se) { se.printStackTrace(); }
        }*/
    }


    @Override
    public void update(T obj) {

    }

    @Override
    public void upsert(T obj) {

    }

    @Override
    public void delete(T obj) {

    }

    @Override
    public T findById(String id) {
        String query = ("select name from drivers where id="+id);
        T result = null;

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing query
            rs = stmt.executeQuery(query);

            result = (T) rs.getObject(1);

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
        return result;
    }

    @Override
    public List<T> findAll() {
        return null;
    }
}


