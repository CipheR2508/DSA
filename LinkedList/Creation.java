import java.util.Scanner;

public class Creation {
    // ! structure of a Node
    static class Node {
        int data;
        Node next;

        Node(int data) // ! Constructor
        {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null; // ! address of initial node.

    public void create() {
        int data, n;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter data: ");
            data = sc.nextInt(); // ! pass this data inside the constructor.

            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            System.out.print("If you want to continue press 1: ");
            n = sc.nextInt();
        } while (n == 1);
        sc.close();
    }

    public void traverse() {
        Node temp = head;

        if (head == null) {
            System.out.println("LinkedList does not exist.");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;

            }
        }
    }

    public static void main(String[] args) {
        Creation list = new Creation();
        list.create();
        list.traverse();
    }
}