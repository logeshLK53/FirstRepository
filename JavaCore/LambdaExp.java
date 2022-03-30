package JavaCore;

import java.util.ArrayList;
import java.util.List;

interface Hello
{
    String say();
}
interface Hai
{
    void print(String name);
}
interface Adding
{
    int add(int a, int b);
}
public class LambdaExp {
    public static void main(String[] args) {
        //no parameter
        Hello s=()->{
             return "Poda";
        };
        System.out.println(s.say());
        //single parameter
        Hai h = (name)->{
            System.out.println("I am "+name);
        };
        h.print("LK");
//double parameter
        Adding ad=(a, b) -> {
            return a+b;
        };
        System.out.println(ad.add(5, 3));

         List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(2);
        list.add(53);
        list.add(8);
        list.sort((a, b) -> {
            if (a < b) {
                return -1;
            }
            return 0;
        });
       // list.forEach(System.out::println);
        list.forEach(e->
        {
            System.out.print(e+",");
        });

    }
}
