package Collection_map;
import java.util.*;
public class Values_sort {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 50);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put("Mango", 10);
        System.out.println("Given map: " + map);
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        System.out.println("Sorted map: " + list);
    }
}
