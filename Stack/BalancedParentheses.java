package Stack;

import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String str = "((()))";
        boolean isbalanced = checkBalancedPs(str);

        if (isbalanced) {
            System.out.println("The string is balanced.");
        } else {
            System.out.println("The string is not balanced.");
        }
    }

    public static boolean checkBalancedPs(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}