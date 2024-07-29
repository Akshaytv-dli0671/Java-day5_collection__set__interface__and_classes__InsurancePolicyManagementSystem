package Collection_set;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Sorted_unique {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(5);
        TreeSet<Integer> set=new TreeSet<>(list);
        System.out.println(set);

    }
}
