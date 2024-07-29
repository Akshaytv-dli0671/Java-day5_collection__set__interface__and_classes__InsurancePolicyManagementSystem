package Collection_set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class First_nonDuplicate {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(7);
        list.add(8);
        list.add(5);
        LinkedHashSet set=new LinkedHashSet();
        for(int i:list){
            if(set.contains(i)){
                set.remove(i);
            }
            else{
                set.add(i);
            }
        }
        for(Object i: set){
            System.out.println(i);
            return;

        }
        
    }
}
