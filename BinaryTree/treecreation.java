// !mark 2: also gives root of your Binary tree
// import java.util.Scanner;

// class Node {
// int data;
// Node left, right;

// public Node(int data) {
// this.data = data;
// left = null;
// right = null;
// }
// }

// public class treecreation {
// static Scanner sc = new Scanner(System.in);

// static Node create() {
// System.out.println("Enter data (-1 to stop): ");
// int data = sc.nextInt();
// if (data == -1) {
// return null;
// }

// Node newNode = new Node(data);
// System.out.println("Enter left child of " + data);
// newNode.left = create();
// System.out.println("Enter right child of " + data);
// newNode.right = create();

// return newNode;
// }

// public static void main(String[] args) {
// System.out.println("Create your binary tree.");
// Node newNode = create();
// if (newNode != null) {
// System.out.println("Your tree has been created. Root = " + newNode.data);
// } else {
// System.out.println("No tree created.");
// }
// }
// }

// ! mark 1
// import java.util.Scanner;

// class Node { // ? this class is only accessible within this package
// int data;
// Node left, right;

// public Node(int data) {
// this.data = data;
// right = null;
// left = null;
// }
// }

// public class treecreation {
// static Scanner sc = new Scanner(System.in);

// static Node creation() { // * here, Node acts as return type of this
// function.
// System.out.println("Enter data (-1 to stop): ");
// int data = sc.nextInt();
// if (data == -1) {
// return null;
// }
// Node newNode = new Node(data); // * Data type of newNode is Node
// System.out.println("Enter left child of " + data + ": ");
// newNode.left = creation();
// System.out.println("Enter right child of " + data + ": ");
// newNode.right = creation();

// return newNode; // * a function should havea return type, in this case :
// newNode;
// }

// public static void main(String[] args) {
// System.out.println("Create your binary tree.");
// Node treeRoot = creation(); // ! you can also write only creation(); but it
// would not store the ROOT of your TREE. so we create a variable of Node
// System.out.println("Binary tree created successfully");
// }
// }
