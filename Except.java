import java.util.Scanner;
class Except{
    public static void bubble(int arr[],int choice)
    {
      int temp;
      int b = arr.length;
      for(int i=0;i<b-1;i++)
      {
        for(int j=0;j<b-i-1;j++)
        {
            if( (choice == 0 && arr[j] > arr[j+1]) ||  (choice == 1 && arr[j] < arr[j+1]) )
            {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
      }
    }
    public static void print(int arr[])
    {
        for(int num : arr)
        {
            System.out.print(num  +  " ");
        }
        System.out.println();
    }
    public static void main(String h[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter array length:");
       int n = sc.nextInt();
       int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the " + i + " number ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter your option (0) for ASCENDING ORDER and (1) for DESCENDING ORDER");
        int choice = sc.nextInt();
        if(choice == 0)
        System.out.println("The given values in ASCENDING ORDER is:");
        else
        System.out.println("The given values in DESCENDING ORDER is:");
        bubble(arr,choice);
        print(arr);
        sc.close();
    }
}

