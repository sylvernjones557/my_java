import java.util.Scanner;

// Class to handle the status checking functionality
class MarkSheetStatus {

    // Method to check if a mark is a pass or fail
    public String checkStatus(int mark) {
        return mark >= 30 ? "Pass" : "Fail";
    }
}

public class Mark_sheet {
    public static void main(String[] args) {
        int noSubjects;
        String name, deptNo;

        Scanner sc = new Scanner(System.in);

        // Input student details
        System.out.println("Enter your name:");
        name = sc.nextLine();

        System.out.println("Enter your department number:");
        deptNo = sc.nextLine();

        System.out.println("Enter the number of subjects to record their marks:");
        noSubjects = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        // Initialize arrays
        String[] subjects = new String[noSubjects];
        int[] marks = new int[noSubjects];
        String[] status = new String[noSubjects];

        // Create an instance of the MarkSheetStatus class
        MarkSheetStatus checker = new MarkSheetStatus();

        // Input subject names and marks
        for (int i = 0; i < noSubjects; i++) {
            System.out.println("Enter the name of subject " + (i + 1) + ":");
            subjects[i] = sc.nextLine();

            System.out.println("Enter the mark of " + subjects[i] + " (out of 100):");
            marks[i] = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline

            // Determine the status (Pass/Fail)
            status[i] = checker.checkStatus(marks[i]);
        }

        // Display student details
        System.out.println("\nStudent Name: " + name);
        System.out.println("Student Department No: " + deptNo);

        // Display subject details in tabular format
        System.out.println("\nSubject Details:");
        System.out.printf("%-15s %-10s %-10s\n", "Subject", "Marks", "Status");
        System.out.println("--------------------------------------------");
        for (int j = 0; j < noSubjects; j++) {
            System.out.printf("%-15s %-10d %-10s\n", subjects[j], marks[j], status[j]);
        }

        sc.close(); // Close the scanner
    }
}
