package datastructure.unorderedlist;
import java.io.*;
import java.util.*;
public class UnorderedList<T> {
    private Node<T> head;

    // Inner class representing a node in the linked list
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data) {
        // Create a new node with the given data
        Node<T> newNode = new Node<>(data);

        // If the list is empty, set the new node as the head
        if (head == null) {
            head = newNode;
        } else {
            // Traverse to the last node and add the new node there
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(T data) {
        // If the list is empty, return
        if (head == null) {
            return;
        }

        // If the data to remove is in the head node, update the head
        if (head.data.equals(data)) {
            head = head.next;
            return;
        }

        // Traverse the list to find the node to remove
        Node<T> current = head;
        Node<T> prev = null;
        while (current != null && !current.data.equals(data)) {
            prev = current;
            current = current.next;
        }

        // If the node is found, update the references to remove it
        if (current != null) {
            prev.next = current.next;
        }
    }

    public boolean search(T data) {
        // Traverse the list to search for the data
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void saveToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            // Open a file writer for the specified filename
            // The try-with-resources statement ensures that the writer will be closed automatically
            // after the try block, regardless of whether an exception occurs or not

            // Traverse the list and write each data to the file
            Node<T> current = head;

            while (current != null) {
                // Write the data of the current node to the file
                writer.println(current.data);

                // Move to the next node
                current = current.next;
            }
        } catch (FileNotFoundException e) {
            // If the specified file is not found, print the stack trace
            e.printStackTrace();
        }
    }
}

