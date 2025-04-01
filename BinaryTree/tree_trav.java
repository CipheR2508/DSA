import java.util.Scanner;

// class Node { // ? this class is only accessible within this package
//     int data;
//     Node left, right;

//     public Node(int data) {
//         this.data = data;
//         right = null;
//         left = null;
//     }
// }
public class tree_trav {
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

        return newNode; // * a function should havea return type, in this case : newNode;
    }

    static void inorder(Node newNode) {
        if (newNode == null) // Add this check to prevent NullPointerException
            return;
        inorder(newNode.left);
        System.out.print(" " + newNode.data);
        inorder(newNode.right);
    }

    static void preorder(Node newNode) {
        if (newNode == null)
            return;
        System.out.print(" " + newNode.data);
        preorder(newNode.left);
        preorder(newNode.right);
    }

    static void postorder(Node newNode) {
        if (newNode == null)
            return;
        postorder(newNode.left);
        postorder(newNode.right);
        System.out.print(" " + newNode.data);
    }

    public static void main(String[] args) {
        System.out.println("Create your binary tree.");
        Node treeRoot = creation();
        System.out.print("preorder: ");
        preorder(treeRoot);
        System.out.println();
        System.out.print("postorder: ");
        postorder(treeRoot);
        System.out.println();
        System.out.print("inorder: ");
        inorder(treeRoot);
        System.out.println("\nBinary tree created successfully.");
    }
}