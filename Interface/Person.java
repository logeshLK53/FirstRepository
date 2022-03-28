package Interface;

import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person>{
    String name;
    int height;
    int weight;

    Person(String name,int height,int weight)
    {
        this.name=name;
        this.height=height;
        this.weight=weight;
    }
    @Override
    public int compareTo(Person p)
    {
        return this.weight - p.weight;
    }

    public static void main(String args[])
    {
        ArrayList<Person> list= new ArrayList<>();
        list.add(new Person("LK",180, 55));
        list.add(new Person("Kowsi",160, 53));
        list.add(new Person("Pree",165, 59));

        Collections.sort(list);
        for(Person p: list)
        {
            System.out.println(p.name+" "+p.height+" "+p.weight);
        }
    }
}
