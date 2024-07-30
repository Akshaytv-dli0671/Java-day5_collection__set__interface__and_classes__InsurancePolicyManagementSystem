package Collection_map;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String[] anagrams = {"eat", "tea", "tan", "ate", "nat", "bat"};
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        for (String str : anagrams) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted_strings=new String(chars);
            if (!map.containsKey(sorted_strings)) {
                map.put(sorted_strings, new ArrayList<>());
            }
            map.get(sorted_strings).add(str);

        }
        System.out.println(map);


    }

    
}


