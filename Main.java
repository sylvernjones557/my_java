import java.util.Scanner;

class Main {
    public static void main (String h[]) {
        // Declare two integer variables
        int a, b;
        
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter two numbers
        System.out.println("Enter two number:");
        
        // Read the two numbers from the user
        a = sc.nextInt();
        b = sc.nextInt();
        
        // Calculate and print the sum of the two numbers
        System.out.println("The sum of the two numbers a and b is " + (a + b));
        // Close the Scanner object
        sc.close();
    }
}