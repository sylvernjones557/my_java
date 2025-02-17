interface circle
{
 public void area();
 public void perimeter();
}
class cube
{
 public void volume()
 {
  System.out.println("The volume of the cube is 81 cubic.meters");
 }
}
class shapes extends cube implements circle
{
 public void area()
{
 System.out.println("The area of the circle is 45 sq.cms");
}
 public void perimeter()
 {
  System.out.println("The perimeter of the circle is 56 meters");
 }
public static void main(String h[])
{
  shapes s = new shapes();
  s.area();
  s.perimeter();
  s.volume();
}
}
 