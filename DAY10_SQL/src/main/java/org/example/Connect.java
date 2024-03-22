package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Connect {
    public static Connection connect(){
        String url = "jdbc:sqlite:/Users/agnesevaiceulena/Downloads/chinook.db";
        Connection conn = null;

        try{
            conn = DriverManager.getConnection(url);
            System.out.println("Success!");
        }catch(Exception e){
            System.out.println("Connection failed!");
        }
        return conn;
    }

    public static void ReadArtists(Connection conn){
        String sql = "SELECT * FROM artists";

        try{
            Connection conn = connect();
            Satement stm = new conn.createStatement();
            ResultSet rs = stm.getResultSet();

            while(rs.next()){
                System.out.println(rs.getString("Name"));
            }
        }catch (Exception e){

        }
    }
}
