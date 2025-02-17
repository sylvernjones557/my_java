import java.util.Scanner;

class Fact {
    public static int fact(int d) {
        int fac_num = 0;
        int i = 0;
        while (i <= d) {
            fac_num = fac_num + i;
            i = i + 1;
        }
        return fac_num;
    }
}

class Amstrong {
    public static void AMS(int n) {
        int org_num = n;
        int sum = 0;
        int digit;
        while (n > 0) {
            digit = n % 10;
            sum = sum + (digit * digit * digit);
            n /= 10;
        }
        if (sum == org_num)
            System.out.println("The given number is an Armstrong number");
        else
            System.out.println("The number is not an Armstrong number");
    }
}

class Multiplication {
    public static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}

class oper {
    public static void main(String y[]) {
        // Start measuring execution time
        long startTime = System.nanoTime();

        Fact ff = new Fact();
        Amstrong aa = new Amstrong();
        Multiplication mm = new Multiplication();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        System.out.println("The factorial of the number " + n + " is " + ff.fact(n));
        aa.AMS(n);
        mm.table(n);
        
        // Stop measuring execution time
        long endTime = System.nanoTime();
        
        // Calculate execution time in milliseconds
        double executionTime = (endTime - startTime) / 1_000_000.0;
        
        System.out.println("\nTotal Execution Time: " + executionTime + " ms");

        sc.close();
    }
}
