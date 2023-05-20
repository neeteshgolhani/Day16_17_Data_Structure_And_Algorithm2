package datastructure.siplebalanceparanthesis;

import static datastructure.siplebalanceparanthesis.BalancedParentheses.isBalanced;

public class BalancedParanthesesMain {
    public static void main(String[] args) {
        String expression = "(5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)";
        boolean isExpressionBalanced = isBalanced(expression); // Check if the expression is balanced
        System.out.println("Arithmetic Expression is balanced: " + isExpressionBalanced); // Print the result
    }
}
