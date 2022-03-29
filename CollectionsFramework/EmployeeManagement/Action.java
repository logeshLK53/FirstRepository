package CollectionsFramework.EmployeeManagement;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Action {

    public static Employee TakeInfoForEmployee(int id) {
        Scanner scan = new Scanner(System.in);  
        System.out.print("Enter Employee Name : ");
        String name = scan.nextLine();
        System.out.print("Enter your age : ");
        int age = scan.nextInt();
        System.out.print("Enter your Role : ");
        String role = scan.next();
        Employee emp = new Employee(id,name,age,role);
        return emp;
    }
    public static String deleteEmployeeById(Map<Integer,Employee> empMap) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Employee Id: ");
        int id = scan.nextInt();
        empMap.remove(id);

        return "Deleted Successfully";
    }

    public static void printAllEmployee(Map<Integer,Employee> empMap)
    {
        empMap.forEach((k, v) -> {
            System.out.println("Key = " + k + ", Value = " + v);
        });
    }

    public static void mapToFile(Map<Integer,Employee> empMap)
    {
        File file = new File("CollectionsFramework/EmployeeManagement/EmpFile.txt");
        try {
            FileWriter writer = new FileWriter(file,true);
            empMap.forEach((k,v) -> {
                try {
                    writer.append(v.id+" "+v.name+" "+v.age+" "+v.role+"\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            writer.close();
        } catch(IOException e) {
             e.getMessage();
    }
    }

    public static void fileToMap()
    {
        File file = new File("CollectionsFramework/EmployeeManagement/EmpFile.txt");
            try {
            FileReader reader = new FileReader(file);
            int ch;
            StringBuffer sb = new StringBuffer();
            int id=0,age=0;
            String name="",role="";
            while ((ch = reader.read()) != -1) {
               
                sb.append((char) ch);
                if(ch==32)
                {
                if(id==0)
                {
                    String str=sb.toString();
                    id=Integer.parseInt(str);
                }
                else if(name.equals(""))
                {
                    name=sb.toString();
                }
                else if(age==0)
                {
                    String str=sb.toString();
                    age=Integer.parseInt(str);
                }
                else
                {
                    role=sb.toString();
                }
                Employee emp = new Employee(id,name,age,role);
                Main.empMap.put(id,emp);
                Main.id = id;
                System.out.println(id+" "+name+" "+age+" "+role);
                id=0;
                age=0;
                name="";
                role="";
                sb = new StringBuffer();
            }
            }
            reader.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
