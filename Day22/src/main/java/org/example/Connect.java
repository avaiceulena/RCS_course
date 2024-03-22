package org.example;
import com.google.gson.Gson;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Connect {
    public static List<Employee> getEmployees(){
        String url = "jdbc:sqlite:/Users/agnesevaiceulena/Documents/RCS/RCS_Java/SQL_Day22/employees_22.db";
        List<Employee> employees = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(url)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("firstName");
                String lastName = resultSet.getString("lastName");
                int workExperience = resultSet.getInt("workExperience");

                employees.add(new Employee(id, firstName, lastName, workExperience));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return employees;
    }

    public static void convertListToJson(){
        List<Employee> employees = getEmployees();
        Gson gson = new Gson();
        String json = gson.toJson(employees);
        System.out.println(json);
    }

}
