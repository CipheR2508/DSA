import java.util.Scanner;

class sumofdig {
    // Recursive method to calculate the sum of digits
    static int sumd(int num) {
        // Base case
        if (num == 0) {
            return 0;
        }
        // Recursive case: Add the last digit and recurse with the rest of the number
        return num % 10 + sumd(num / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt(); // Example input
        sc.close();
        int result = sumd(num); // Call the recursive method
        System.out.println("The sum of digits of " + num + " is: " + result);
    }
}
