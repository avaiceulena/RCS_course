package com.example.day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Connect {

    public static Connection connect(){
        String url = "jdbc:sqlite:/Users/agnesevaiceulena/Documents/RCS/RCS_Java/SQL_Day22/employees_22.db";
        Connection conn = null;

        try{
            conn = DriverManager.getConnection(url);
            System.out.println("Success!");
        }catch(Exception e){
            System.out.println("Connection failed");
        }
        return conn;
    }

    public static Employee getEmployees(Connection conn, int id){
        String sql = "SELECT * FROM employee WHERE id=" + id;
        Employee emp = new Employee();

        try{
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while(rs.next()){
                emp = new Employee(rs.getInt("id"), rs.getString("firstName"),
                        rs.getString("lastName"), rs.getInt("workExperience"));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return emp;
    }

    public static List<Employee> getEmployees(Connection conn){
        String sql = "SELECT * FROM employee";
        List<Employee> emp = new ArrayList<>();

        try{
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while(rs.next()){
                emp.add(new Employee(rs.getInt("id"), rs.getString("firstName"),
                        rs.getString("lastName"), rs.getInt("workExperience")));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return emp;
    }

}
