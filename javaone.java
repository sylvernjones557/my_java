import java.util.Scanner;
class Shapes{
public int length;
public int breadth;

public Shapes(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
}
}
class Rectangle extends Shapes{
 Rectangle(int length, int breadth) 
 {
  super(length, breadth);
 }
 public int Area()
 {
  return (length*breadth);
 }
   
 public int Perimeter()
 {
   return (2*(length+breadth));
 }
}
class Square extends Shapes{
 Square(int length) 
 {
  super(length, length);
 }
 public int Area()
 {
  return (length*length);
 }
   
 public int Perimeter()
 {
   return (4*length);
 }
}
class javaone {
    public static void main(String j[])
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter your choice as (1) for Square and (2) for Rectangle");
     int c = sc.nextInt();
     if(c == 1 )
     {
      System.out.println("Enter the length of the shape");
       int a = sc.nextInt();
      Square ss = new Square(a);
      System.out.println("The perimeter of the Square of side "  + a + " is " + ss.Perimeter() + " units");
      System.out.println("The area of the Square of side "  + a + " is " + ss.Area() + " units");
     }
     else if(c == 2)
     {
      System.out.println("Enter the length of the shape");
      int a = sc.nextInt();
      System.out.println("Enter the breadth of the shape");
      int b = sc.nextInt();
      Rectangle rr = new Rectangle(a,b);
      System.out.println("The perimeter of the Rectangle of side "  + a + " is " + rr.Perimeter() + " units");
      System.out.println("The area of the Recatngle of side "  + a + " is " + rr.Area() + " units");
     }
     else
     {
      System.out.println("WRONG OPTION.....");
     }
     sc.close();
     }

}

