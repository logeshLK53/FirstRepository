package CollectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayAndLinkedLists {
    public static void main(String[] args) {
        //Array List
        ArrayList<Integer> l=new ArrayList<>();
        l.add(5);
        l.add(3);
        l.add(8);
        System.out.println(l.get(2));
        l.set(2, 53);
        System.out.println(l.get(2));
        System.out.println(l.isEmpty());
        System.out.println(l.size());
        System.out.println(l.contains(53));
        System.out.println(l.indexOf(3));
        for(int i=0;i<l.size();i++)
        {
            System.out.println(l.get(i));
        }
//Linked List
        LinkedList<String> ll=new LinkedList<>();
        ll.add("Loge");
        ll.add("Kumar");
        ll.add("LK");
        System.out.println(ll.get(2));
        ll.set(2, "Kowsi");
        System.out.println(ll.get(2));
        System.out.println(ll.isEmpty());
        System.out.println(ll.size());
        System.out.println(ll.contains("LK"));
        System.out.println(ll.indexOf("Loge"));
        for(int i=0;i<ll.size();i++)
        {
            System.out.println(ll.get(i));
        }
    }
}
