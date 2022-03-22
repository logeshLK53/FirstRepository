package Interface;

import java.util.ArrayList;

public class Circle implements Printable , Sortable {

    @Override
    public void print(ArrayList<Employee> list) {
        for(Employee e:list)
        {
        System.out.println(e.name+" "+e.age);
        }
    }
    @Override
    public void sort(ArrayList<Employee> list)
    {
    }
}
