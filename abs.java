abstract class sound
{
 abstract public void noise();
 abstract public void sounds();
}
class Dog extends sound
{
 public void noise()
 {
  System.out.println("This animal gives noise");
 }
 public void sounds()
 {
  System.out.println("This animal barks");
 }
}
class Animal extends Dog
{
 int height;
 int weight;
 public void pet()
 {
   System.out.println("This animal is a pet dog");
 }
 public void define()
 {
  System.out.println("This dog has an height of " + height + " cm and weight of " + weight + " kgs ");
 }
}
class abs
{
 public static void main(String h[])
 {
  Animal aa = new Animal();
  aa.height = 100;
  aa.weight = 30;
  aa.pet();
  aa.define();
  aa.noise();
  aa.sounds();
 }
}
  
