package Collection_set;

import java.util.*;

public class set_behavior {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);
        HashSet<Integer>set=new HashSet<>(list);
        LinkedHashSet<Integer>linked_set=new LinkedHashSet<>(list);
        TreeSet<Integer>tree_set=new TreeSet<>(list);

        System.out.println("Hashset:"+set+"\nLinkedHashset:"+linked_set+"\nTreeset:"+tree_set);


    }
}
