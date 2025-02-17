import java.util.Scanner;
class Shapes
{
 int length;
 int breadth;
 public Shapes(int a)
 {
  this.length = a;
  this.breadth = a;
 }
 public Shapes(int a,int b)
 {
  this.length = a;
  this.breadth = b;
 }
}

class Square extends Shapes{
    public Square(int a) {
        super(a);
    }
    public  int Area(){
     return length*breadth;
    }
    public int Perimeter(){
        return 4*length;
    }
}
class Rectangle extends Shapes{
    public Rectangle(int a,int b) {
        super(a);
    }
    public  int Area(){
     return length*breadth;
    }
    public int Perimeter(){
        return (2*(length+breadth));
    }
}
 class shapa{
    public static void main(String g[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape you want to find area and perimeter 1 for square 2 for rectangle");
        int num = sc.nextInt();
        if (num==1){
            System.out.println("Enter the length of the square:");
            int a = sc.nextInt();
            Square ss = new Square(a);
            System.out.println("The area and the perimeter of the square is :" + ss.Area() + " and " + ss.Perimeter());
        }
        else{
            System.out.println("Enter the length abd breadth of the Rectangle:");
            int c = sc.nextInt();
            int d = sc.nextInt();
            Rectangle rr = new Rectangle(c,d);
            System.out.println("The area and the perimeter of the Rectangle is :" + rr.Area() + " and " + rr.Perimeter());
        }
        
        sc.close();

    }
 }
 /*this program uses constructor overloading concept for class which inherited one among other */