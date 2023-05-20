package datastructure.hashingfunction;

public class HashingFunctionMain {
    public static void main(String[] args) {
        HashingFunction hashingFunction = new HashingFunction();
        String filename = "numbers.txt";
        hashingFunction.insertNumbersFromFile(filename);

        // User input to search a number
        int numberToSearch = 77;
        hashingFunction.searchNumber(numberToSearch);

        // Save the numbers to a file
        String outputFile = "output.txt";
        hashingFunction.saveNumbersToFile(outputFile);
    }
}
