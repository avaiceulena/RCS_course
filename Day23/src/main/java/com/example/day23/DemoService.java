package com.example.day23;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

@Service
public class DemoService {

    public List<Employee> getEmployee(){
        Connection conn = Connect.connect();
        List<Employee> lst = Connect.getEmployees(conn);
        return lst;
    }

    public Employee getEmployees(int id) {
        Connection conn = Connect.connect();
        Employee e = Connect.getEmployees(conn, id);

        return e;
    }

//    public Employee getEmployee(int id) {
//        List<Employee> lst = new ArrayList<>();
//
//        lst.add(new Employee(1, "Janis", "Berzins", 1));
//        lst.add(new Employee(2, "Edgars", "Ozols", 4));
//        lst.add(new Employee(3, "Juris", "Klava", 3));
//
//        for(Employee e : lst){
//            if(e.id == id){
//                return e;
//            }
//        }
//        return null;
//    }
}
