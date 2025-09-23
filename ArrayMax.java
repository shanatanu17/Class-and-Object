import java.util.*;

class find
{ 
   int a[];
  
   // take array input
   void inputArray(int arr[])
    { 
       a = new int[arr.length];

       Scanner sc = new Scanner(System.in);
 
       System.out.println("Enter the array elements ");
       for(int i=0;i<arr.length;i++) 
        {
           a[i] = sc.nextInt();
        }
    }


    // find maximum element
    int findMax(int arr[])
     { 
        int max = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
         { 
            if(a[i] > max)
             {
                max = a[i];
             }
         }

       return max;
     } 

 
     // find minimum ele
     int findMin(int arr[])
      { 
         int min = Integer.MAX_VALUE;

         for(int i=0;i<a.length;i++)
          {
             if(a[i] < min)
              { 
                 min = a[i];
              }
          }
         
        return min;
      }




}




public class ArrayMax
{
   public static void main(String ss[])
    { 
       Scanner sc = new Scanner(System.in);
       find obj = new find();

       System.out.println("Enter the size of array");
       int n = sc.nextInt();

       int arr[] = new int[n];

       
       obj.inputArray(arr);
       int maximum  = obj.findMax(arr);
       int minimum = obj.findMin(arr);

       System.out.println("Maximum ele is " + maximum);
       System.out.println("Minimum ele is " + minimum);
    }
}