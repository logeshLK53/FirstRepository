package Interface;

import java.util.ArrayList;


public class Employee1 {
        String name;
        int age;

      public Employee1(String name,int age)
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
        Employee1 e1=new Employee1("lk", 23);
        Employee1 e2=new Employee1("Kowsi", 21);
        ArrayList<Employee1> list=new ArrayList<>();
        list.add(e1);
        list.add(e2); 
        Circle c=new Circle();
        c.print(list);
    }
}
 class Circle implements Printable  {

    @Override
    public void print(ArrayList<Employee1> list) {
        for(Employee1 e:list)
        {
        System.out.println(e.name+" "+e.age);
        }
    }
}
 interface Printable {
    void print(ArrayList<Employee1> list);
}