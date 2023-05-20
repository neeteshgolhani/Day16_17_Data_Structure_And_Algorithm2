package algorithmprobles.anagramdetection.Permutation;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Permutation {
    // Iterative method to find all permutations of a string
    public static Set<String> iterativePermutations(String str) {
        Set<String> permutations = new HashSet<>();
        // If the input string is null or empty, return a set with one empty string
        if (str == null || str.length() == 0) {
            permutations.add("");
            return permutations;
        }
        // Convert the string to a char array
        char[] chars = str.toCharArray();
        // Use a stack to keep track of the permutations
        Stack<String> stack = new Stack<>();
        // Push the first character onto the stack
        stack.push(String.valueOf(chars[0]));
        // For each subsequent character
        for (int i = 1; i < chars.length; i++) {
            // Pop all permutations from the stack that have length equal to the current index
            while (!stack.isEmpty() && stack.peek().length() == i) {
                String permutation = stack.pop();
                // Generate new permutations by inserting the current character at every possible position
                for (int j = 0; j <= permutation.length(); j++) {
                    String newPermutation = permutation.substring(0, j) + chars[i] + permutation.substring(j);
                    stack.push(newPermutation);
                }
            }
        }
        // Add all remaining permutations on the stack to a set and return it
        while (!stack.isEmpty()) {
            permutations.add(stack.pop());
        }
        return permutations;
    }

    // Recursive method to find all permutations of a string
    public static Set<String> recursivePermutations(String str) {
        Set<String> permutations = new HashSet<>();
        // If the input string is null or empty, return a set with one empty string
        if (str == null || str.length() == 0) {
            permutations.add("");
            return permutations;
        }
        // Convert the string to a char array
        char[] chars = str.toCharArray();
        // Use a helper method to generate permutations
        recursivePermutationsHelper(chars, 0, permutations);
        return permutations;
    }

    // Helper method for recursive permutations
    private static void recursivePermutationsHelper(char[] chars, int index, Set<String> permutations) {
        // If we have reached the end of the array, add the current permutation to the set
        if (index == chars.length - 1) {
            permutations.add(String.valueOf(chars));
        } else {
            // For each index greater than or equal to the current index
            for (int i = index; i < chars.length; i++) {
                // Swap the current index with index i
                swap(chars, index, i);
                // Recursively generate permutations for the rest of the array
                recursivePermutationsHelper(chars, index + 1, permutations);
                // Swap back the characters to restore the original order
                swap(chars, index, i);
            }
        }
    }

    // Swap two characters in an array
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    // Function to check if two sets of strings are equal
    public static boolean areEqual(Set<String> set1, Set<String> set2) {
        // Check if the sets have different sizes
        if (set1.size() != set2.size()) {
            return false;
        }
        // Check if all strings in set1 are also in set2
        for (String s : set1) {
            if (!set2.contains(s)) {
                return false;
            }
        }
        // Check if all strings in set2 are also in set1
        for (String s : set2) {
            if (!set1.contains(s)) {
                return false;
            }
        }
        // If all tests passed, the sets are equal
        return true;
    }
}
