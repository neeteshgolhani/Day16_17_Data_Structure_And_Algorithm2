package datastructure.numberofbst;

import java.util.Scanner;

import static datastructure.numberofbst.BstCount.countBST;

public class BstCountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            // Read the number of nodes for each test case
            int n = scanner.nextInt();

            // Find the count of BSTs and print the result
            int count = countBST(n);
            System.out.println(count);
        }

        scanner.close();
    }
}