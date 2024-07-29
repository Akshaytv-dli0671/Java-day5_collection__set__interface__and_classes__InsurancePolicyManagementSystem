package Collection_map;
import java.util.*;
public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        HashMap<Character,Integer>map=new HashMap<>();
        for(Integer i=0;i<input.length()-1;i++){
            if(map.containsKey(input.charAt(i))){
                map.put(input.charAt(i),map.get(input.charAt(i))+1);
            }
            else{
                map.put(input.charAt(i),1);
            }
        }
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}
