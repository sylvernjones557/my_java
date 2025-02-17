import java.util.Scanner;
class Basic_arith
{
 public static int add(int a,int  b)
  {
    return a+b;
  }
 public static int sub(int a,int b)
  {
   return a-b;
  }
 public static int mul(int a,int b)
  {
    return a*b;
  }
 public static int div(int a,int b)
  {
   return a/b;
  }
}
class Arith_oper
{
 public static void main (String f[])
 {
  Scanner sc = new Scanner(System.in);
  Basic_arith ba = new Basic_arith();
  System.out.println("Enter two numbers:");
  int a = sc.nextInt();
  int b = sc.nextInt();
  System.out.println("The sum,difference,product and the quotient of the numbers " + a + " and " + b + " is " + ba.add(a,b) + " \n " + ba.sub(a,b) + " \n " + ba.mul(a,b) + " \n " + ba.div(a,b));
}
}