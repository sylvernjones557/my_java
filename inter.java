interface sound
{
 public void noise();
}
class Animal 
{
 int height;
 int weight;
}
class charec extends Animal implements sound{
 public void noise()
{
 System.out.println("The animal gives noise");
}
public void dimension()
{
 System.out.println("This animal has an height of " + height + " cm and weight of " + weight + " kgs ");
}
}
class inter
{
 public static void main(String j[])
{
 charec cc = new charec();
 cc.height = 44;
 cc.weight = 90;
 cc.noise();
 cc.dimension();
}
}