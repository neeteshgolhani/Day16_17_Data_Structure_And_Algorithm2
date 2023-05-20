package datastructure.siplebalanceparanthesis;
import java.util.Stack;
class BalancedParentheses {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>(); // Create a stack to store opening parentheses

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i); // Get the current character from the expression
            if (ch == '(') { // If it's an opening parenthesis
                stack.push(ch); // Push it onto the stack
            } else if (ch == ')') { // If it's a closing parenthesis
                if (stack.isEmpty() || stack.pop() != '(') { // Check if the stack is empty or the top
                    // of the stack is not an opening parenthesis
                    return false; // If so, the expression is unbalanced, return false
                }
            }
        }
        return stack.isEmpty(); // If the stack is empty, the expression is balanced, otherwise it's unbalanced
    }
}