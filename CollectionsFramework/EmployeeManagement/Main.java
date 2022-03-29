package CollectionsFramework.EmployeeManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static int id=1;
    static Map<Integer,Employee> empMap=new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Employee Management System\n");
        System.out.println("Available Options :-");
        Action.fileToMap();
   
        while (true) {
            System.out.println("1. Add an Employee");
            System.out.println("2. Get all Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Exit");

            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Employee emp = Action.TakeInfoForEmployee(id);
                    empMap.put(id++, emp);
                    System.out.println("Added Successfully.");
                    break;
                case 2:
                    Action.printAllEmployee(empMap);
                    break;
                case 3:
                    System.out.println(Action.deleteEmployeeById(empMap));  
                    break;
                case 4: 
                    Action.mapToFile(empMap);
                    System.out.println("Thanks for using our Employee System\n");
                    System.exit(0);
                default:
                    System.out.println("Wrong Choice!\n");
                    break;
            }
        }
    }
}
