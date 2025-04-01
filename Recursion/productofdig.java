import java.util.Scanner;

class productofdig {
    // Recursive method to calculate the sum of digits
    static int prod(int num) {
        // Base case
        if (num % 10 == 1) {
            return num;
        }
        // Recursive case: Add the last digit and recurse with the rest of the number
        return num % 10 * prod(num / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt(); // Example input
        sc.close();
        int result = prod(num); // Call the recursive method
        System.out.println("The product of digits of " + num + " is: " + result);
    }
}
