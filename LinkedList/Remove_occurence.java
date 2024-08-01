package LinkedList;
import java.util.LinkedList;

public class Remove_occurence {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(2);
        int valueToRemove = 2;
        linkedList.removeIf(value -> value == valueToRemove);
        System.out.println("Updated LinkedList: " + linkedList);
    }
}

