package LinkedList;

import java.util.LinkedList;
public class Reverse_in_groups {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);

        int k = 3;

        linkedList = reverseInGroups(linkedList, k);
        
        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);
    }

    public static LinkedList<Integer> reverseInGroups(LinkedList<Integer> list, int k) {
        if (list == null || k <= 1) {
            return list;
        }

        LinkedList<Integer> result = new LinkedList<>();
        int size = list.size();

        for (int i = 0; i < size; i += k) {
            LinkedList<Integer> temp = new LinkedList<>();
            for (int j = 0; j < k && (i + j) < size; j++) {
                temp.addFirst(list.get(i + j));
            }
            result.addAll(temp);
        }

        return result;
    }
}
