package Stack;
import java.util.Stack;
public class sort_stack {
        public static void sortedInsert(Stack<Integer> stack, int item) {
            if (stack.isEmpty() || item > stack.peek()) {
                stack.push(item);
            } else {
                int temp = stack.pop();
                sortedInsert(stack, item);
                stack.push(temp);
            }
        }

        public static void sortStack(Stack<Integer> stack) {
            if (!stack.isEmpty()) {
                int temp = stack.pop();
                sortStack(stack);
                sortedInsert(stack, temp);
            }
        }

        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();
            stack.push(30);
            stack.push(10);
            stack.push(50);
            stack.push(20);
            stack.push(40);

            System.out.println("Original Stack: " + stack);

            sortStack(stack);

            System.out.println("Sorted Stack: " + stack);
        }
    

}
