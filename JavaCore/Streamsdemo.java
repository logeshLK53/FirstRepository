package JavaCore;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streamsdemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(17);
        list.add(19);
        list.add(-4);
        /*list.forEach(e -> {
            if(e % 2 == 0) {
                System.out.print(e + ", ");
            }
        });*/
       // list.stream().sorted().forEach(System.out::println);
       // list.stream().filter(e -> (e % 2 == 0)).collect(Collectors.toList()).forEach(System.out::println);
       /*int mi=list.stream().min((a,b)->{
           if(a>b)
           {
               return 1;
           }
           return -1;
       }).get();
       System.out.println(mi);*/
       int mi=list.stream().min(Integer::compare).get();
       int ma=list.stream().max(Integer::compare).get();
    System.out.println(mi+" "+ma);
    }
}
