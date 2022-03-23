package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name,role;
        int age;
        System.out.println("Welcome to Employee Management System : ");
        File f=new File("FileHandling/EmpFile.txt");
        int continueOrNot=1;
        do
        {
            System.out.println("1.Add Employee");
            System.out.println("2.Print Employee");

            int opt=scan.nextInt();
            switch(opt)
            {
                case 1:
                {
                    System.out.println("Enter Name : ");
                    name=scan.next();
                    System.out.println("Enter Age : ");
                    age=scan.nextInt();
                    System.out.println("Enter Role : ");
                    role=scan.next();
                
                    FileWriter fWriter;
                    try {
                        fWriter = new FileWriter(f,true);
                        fWriter.append(name+" ");
                        fWriter.append(age+" ");
                        fWriter.append(role+" ,");
                        fWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }  
                }
                break;
                case 2:
                {
                    FileReader fReader;
                    try {
                        fReader = new FileReader(f);
                        while(true) {
                            int val = fReader.read();
                            if(val == -1) {
                                break;
                            }
                            if(val==44)
                            {
                               System.out.println();
                            }
                            else
                            {
                            System.out.print((char) val);
                            }
                            }
                            fReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println();
                }
                break;
                default:
                    System.out.println("You entered wrong option.");
            }
            System.out.println("Do you want to Continue \n 1.Yes \n 2.No");
            continueOrNot=scan.nextInt();
        }while(continueOrNot==1);
    }
}
