package Collection_map;

import java.util.*;

public class first_non_repeatedElement {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        String str="abcabbd";
        for(char ch: str.toCharArray()){
            if(map.containsKey(String.valueOf(ch))){
                map.put(String.valueOf(ch),map.get(String.valueOf(ch))+1);
            }
            else{
                map.put(String.valueOf(ch),1);
            }
        }

        for(Map.Entry<String,Integer> values: map.entrySet()){
            if(values.getValue()==1){
                System.out.println(values.getKey());
                return;
            }
        }
    }
}
