package CollectionsFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("LK", 53);
        map.put("Kowsi", 2912);
        map.put("Teju", 1234);

        System.out.println("LK = " + map.get("LK"));
        System.out.println(map.containsKey("Kowsi"));
        System.out.println(map.containsValue(1234));

        Collection<Integer> col = map.values();
        System.out.println(col);

        Set<String> set = map.keySet();
        System.out.println(set);

        map.forEach((k, v) -> {
            System.out.println("Key = " + k + ", Value = " + v);
        });
    }
}
