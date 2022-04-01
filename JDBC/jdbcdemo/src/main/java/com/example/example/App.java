package JDBC.jdbcdemo.src.main.java.com.example.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class App {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Employeedb","root","root");
            String query = "select * from EmpData";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                System.out.print("Name: " + rs.getString("Name")+" ");
                System.out.print("Age: " + rs.getInt("age")+" ");
                System.out.print("Salary: " + rs.getInt("salary")+" ");
                System.out.println("Role: " + rs.getString("role"));
            }
            con.close();
        } catch(SQLException se) {
            System.out.println(se.getMessage());
        }


    }
}