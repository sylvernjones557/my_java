import java.util.Scanner;
class fibo
{ 
 public static void main(String l[])
 {
  int first = 0;
  int second = 1;
  int n;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number to print the fibonacci series upto that number");
  n = sc.nextInt();
  System.out.println("The fibonacci series upto " + n + " terms " + " are "  + first  + "  " + second);
  for (int i=0;i<=n;i++)
  {
   int next = first + second;
   System.out.print(next + " ");
   first = second;
   second = next;
  }
}
}
 
  
  
  