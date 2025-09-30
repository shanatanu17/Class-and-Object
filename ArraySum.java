import java.util.*;

class findsum
{
   int a[];
  
   void inputArray(int arr[])
   {  
     a = new int[arr.length];

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the array elements");

     for(int i=0;i<a.length;i++)
      { 
         a[i] = sc.nextInt();
      }
   }


   int calculateSum(int arr[])
   { 
       int sum = 0;
       for(int i=0;i<a.length;i++)
       {
          sum = sum + a[i];
       } 

       return sum;
   }


}





public class ArraySum
{
   public static void main(String ss[])
   {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the size of array");
      int n = sc.nextInt();

      int arr[] = new int[n];


      findsum obj = new findsum();


      obj.inputArray(arr);
      int sum =  obj.calculateSum(arr);

      System.out.println("Array elements sum is " +sum);
 
 
 
   }
}