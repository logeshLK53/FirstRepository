package JavaCore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumericStreams {
    public static void main(String[] args) {
        Collection<Integer> coll = new ArrayList<>();
        coll.add(5);
        coll.add(3);
        coll.add(8);
        coll.add(48);

        List<Integer> list = new ArrayList<>();
        list.addAll(coll);
        list.add(35);
        Stream<Integer> st = list.stream();

        List<Integer> l = st.filter(e -> (e % 2 == 0)).collect(Collectors.toList());
        l.forEach(System.out::println);
        l.clear();
        l.add(8);
        // Stream<Integer> ps = l.stream().parallel();
        Stream<Integer> s = l.stream();
        s.forEach(new ccon()); // Factorial
        //s.forEach(new ccon1()); // fibonacci

    }  
}
class ccon implements Consumer<Integer> {
    int res = 1;
    @Override
    public void accept(Integer t) {
        while(t > 0) {
            res *= t;
            t--;
        }
        System.out.println(res);
    }

}

class ccon1 implements Consumer<Integer> {
    @Override
    public void accept(Integer t) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 1; i <= t; i++) {
            int curr = list.get(i);
            int pre = list.get(i - 1);
            int next = curr + pre;
            list.add(next);
        }
        list.forEach(e -> System.out.println(e));
    }

}