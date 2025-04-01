import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    // Insertion Methods
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void insertAtPosition(int data, int pos) {
        Node newNode = new Node(data);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            for (int i = 1; i < pos - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
    }

    // Deletion Methods
    void deleteAtBeginning() {
        if (head != null) {
            head = head.next;
        }
    }

    void deleteAtEnd() {
        if (head == null || head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    void deleteAtPosition(int pos) {
        if (pos == 1 && head != null) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 1; i < pos - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null && temp.next != null) {
                temp.next = temp.next.next;
            }
        }
    }

    // Traversal Method
    void traverse() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty.");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice, data, position;

        do {
            System.out.println("\n--- Singly Linked List Menu ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete at Beginning");
            System.out.println("5. Delete at End");
            System.out.println("6. Delete at Position");
            System.out.println("7. Traverse");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at beginning: ");
                    data = sc.nextInt();
                    sll.insertAtBeginning(data);
                    break;
                case 2:
                    System.out.print("Enter data to insert at end: ");
                    data = sc.nextInt();
                    sll.insertAtEnd(data);
                    break;
                case 3:
                    System.out.print("Enter data to insert: ");
                    data = sc.nextInt();
                    System.out.print("Enter position to insert at: ");
                    position = sc.nextInt();
                    sll.insertAtPosition(data, position);
                    break;
                case 4:
                    sll.deleteAtBeginning();
                    System.out.println("Deleted the first element.");
                    break;
                case 5:
                    sll.deleteAtEnd();
                    System.out.println("Deleted the last element.");
                    break;
                case 6:
                    System.out.print("Enter position to delete from: ");
                    position = sc.nextInt();
                    sll.deleteAtPosition(position);
                    break;
                case 7:
                    sll.traverse();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 8);

        sc.close();
    }
}
