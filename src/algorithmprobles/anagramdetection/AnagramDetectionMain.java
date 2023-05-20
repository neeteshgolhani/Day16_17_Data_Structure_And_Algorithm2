package algorithmprobles.anagramdetection;

import static algorithmprobles.anagramdetection.AnagramDetection.areAnagrams;

public class AnagramDetectionMain {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "dcba";

        // Check if the two strings are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }
    }

}
