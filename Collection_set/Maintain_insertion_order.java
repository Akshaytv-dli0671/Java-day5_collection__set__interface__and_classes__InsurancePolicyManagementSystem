package Collection_set;

import java.util.LinkedHashSet;

public class Maintain_insertion_order {
    public static void main(String[] args) {
        LinkedHashSet<String> set=new LinkedHashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("apple");
        set.add("orange");
        System.out.println(set);
    }
}
