package datastructure.hashingfunction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashingFunction {

    private static final int NUM_SLOTS = 10;
    private Map<Integer, List<Integer>> hashMap;

    public HashingFunction() {
        hashMap = new HashMap<>();
        for (int i = 0; i < NUM_SLOTS; i++) {
            hashMap.put(i, new LinkedList<>());
        }
    }

    public void insertNumbersFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                int slot = number % NUM_SLOTS;
                List<Integer> slotList = hashMap.get(slot);
                slotList.add(number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void searchNumber(int number) {
        int slot = number % NUM_SLOTS;
        List<Integer> slotList = hashMap.get(slot);
        if (slotList.contains(number)) {
            slotList.remove((Integer) number);
            System.out.println("Number " + number + " found and removed from slot " + slot);
        } else {
            slotList.add(number);
            System.out.println("Number " + number + " not found and added to slot " + slot);
        }
    }

    public void saveNumbersToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int slot = 0; slot < NUM_SLOTS; slot++) {
                List<Integer> slotList = hashMap.get(slot);
                for (int number : slotList) {
                    writer.write(String.valueOf(number));
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}