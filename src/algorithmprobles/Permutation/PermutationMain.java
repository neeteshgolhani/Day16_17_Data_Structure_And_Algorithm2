package algorithmprobles.anagramdetection.Permutation;
import java.util .*;

import static algorithmprobles.anagramdetection.Permutation.Permutation.*;

public class PermutationMain {
    public static void main(String[] args) {
        String str = "abc";

        // Get the permutations using the iterative method
        Set<String> iterativeResult = iterativePermutations(str);

        // Get the permutations using the recursive method
        Set<String> recursiveResult = recursivePermutations(str);
        // Print the permutations
        System.out.println("Iterative permutations: " + iterativeResult);
        System.out.println("Recursive permutations: " + recursiveResult);

        // Check if the sets of permutations are equal
        System.out.println("Are the results equal? " + areEqual(iterativeResult, recursiveResult));
    }
}



