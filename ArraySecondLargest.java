import java.util.*;

class findseclargest
{
  Scanner sc = new Scanner(System.in);
  int a[];
 
  void inputArray(int arr[])
   { 
     a = new int[arr.length];

     for(int i=0;i<a.length;i++)
      { 
        a[i] = sc.nextInt();
      }
   }


   int findSecondLargest()
    {  
      int max = Integer.MIN_VALUE;

      for(int i=0;i<a.length;i++)
       {
          if(a[i] > max)
           {  
             max = a[i];
           }
       }

      int secondmax = -1;

      for(int i=0;i<a.length;i++)
       {  
         if(a[i] != max && a[i] > secondmax)
          {
            secondmax = a[i];
          }
       }

      return secondmax;
 
    }

}

 

public class ArraySecondLargest
{
  public static void main(String ss[])
   {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the size of array");
     int n = sc.nextInt();

     int arr[] = new int[n];

     findseclargest obj = new findseclargest();

     obj.inputArray(arr);

     int ans = obj.findSecondLargest();

     System.out.println("second largest element in array is  " + ans);
   }  
}