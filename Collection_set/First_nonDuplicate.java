package Collection_set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class First_nonDuplicate {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(5);
        LinkedHashSet<Integer> set=new LinkedHashSet();
        LinkedHashSet<Integer>duplicate=new LinkedHashSet<>();

        for(int i:list){
            if(set.contains(i)){
                duplicate.add(i);
            }
            else{
                set.add(i);
            }
        }
        for(Integer i: set){
            if(duplicate.contains(i)==false){
                System.out.println(i);
                return;
            }

        }

    }
}
