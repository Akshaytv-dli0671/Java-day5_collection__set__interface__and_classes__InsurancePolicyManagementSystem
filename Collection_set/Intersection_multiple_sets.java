package Collection_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Intersection_multiple_sets {
    public static void main(String[] args) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        HashSet<Integer> set3=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set3.add(3);
        set3.add(4);
        set3.add(5);
        for(Integer i:set1){
            if(set2.contains(i)==true && set3.contains(i)==true){
                System.out.println(i+" ");
            }
        }

    }
}
