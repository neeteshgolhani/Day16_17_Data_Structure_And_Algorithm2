package datastructure.orderedlist;
import java.io .*;
public class OrderedList<T extends Comparable<T>> {
    private Node<T> head;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);

        // If the list is empty or the new data is smaller than the head's data,
        // insert the new node at the beginning of the list
        if (head == null || data.compareTo(head.data) < 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> current = head;

            // Traverse the list to find the appropriate position to insert the new node
            while (current.next != null && data.compareTo(current.next.data) > 0) {
                current = current.next;
            }

            // Insert the new node in the correct position
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void remove(T data) {
        if (head == null) {
            return;
        }

        // If the head node contains the data, remove the head node
        if (head.data.equals(data)) {
            head = head.next;
            return;
        }

        Node<T> current = head;
        Node<T> prev = null;

        // Traverse the list to find the node with the specified data
        while (current != null && !current.data.equals(data)) {
            prev = current;
            current = current.next;
        }

        // If the node is found, remove it by updating the references
        if (current != null) {
            prev.next = current.next;
        }
    }

    public boolean search(T data) {
        Node<T> current = head;

        // Traverse the list to search for the specified data
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

            // Traverse the list and write each data to the file
            Node<T> current = head;
            while (current != null) {
                writer.println(current.data);
                current = current.next;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

