import java.util.Scanner;

class Node { // ? this class is only accessible within this package
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        right = null;
        left = null;
    }
}

public class tree_creation {
    static Scanner sc = new Scanner(System.in);

    static Node creation() { // * here, Node acts as return type of this function.
        System.out.println("Enter data (-1 to stop): ");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        Node newNode = new Node(data); // * Data type of newNode is Node
        System.out.println("Enter left child of " + data + ": ");
        newNode.left = creation();
        System.out.println("Enter right child of " + data + ": ");
        newNode.right = creation();

        return newNode; // * a function should havea return type, in this case :
    }

    public static void main(String[] args) {
        System.out.println("Create your binary tree.");
        @SuppressWarnings("unused")
        Node treeRoot = creation(); // ! you can also write only creation(); but it
        // would not store the ROOT of your
        // TREE. so we create a variable of Node
        System.out.println("Binary tree created successfully");
    }
}