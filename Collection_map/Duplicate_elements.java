package Collection_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicate_elements {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(4);
        list.add(6);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(1);
        for(Integer i: list){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }

        }
        System.out.println("Duplicates elements and counts:");
        for(Map.Entry<Integer,Integer> values: map.entrySet()){
            //print duplicates elements and their counts
            if(values.getValue()>1){
                System.out.println(values.getKey()+"->"+values.getValue());
            }
        }

    }
}
