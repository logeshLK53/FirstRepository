package Interface;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Employee implements Printable , Sortable {
        String name;
        int age;

      public Employee(String name,int age)
        {
            this.name=name;
            this.age=age;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
    public static void main(String args[])
    {
        Employee e1=new Employee("lk", 23);
        Employee e2=new Employee("Kowsi", 21);
        ArrayList<Employee> list=new ArrayList<>();
        list.add(e1);
        list.add(e2); 
        Circle c=new Circle();
        c.print(list);
    }
}
