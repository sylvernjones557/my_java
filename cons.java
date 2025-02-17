import java.util.Scanner;
class Add
{
 Add(int a , int b)
 {
  System.out.println("The sum of the digits " + a + " " +  b + " is "  + (a+b));
 }
 Add(int a,int b,int c)
 {
  System.out.println("The sum of the digits " + a + " " + b  + " " + c + " is "  + (a+b+c));
 }
}
class cons
{
 public static void main(String g[])
 {
  Scanner sc = new Scanner(System.in);
  Add aa = new Add(2,4,5);
  Add bb = new Add(8,9);
}
}
