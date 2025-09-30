import java.util.*;

class Reversearray
{
   int a[];
   Scanner sc= new Scanner(System.in);
 
   void inputArray(int arr[])
    { 
       a = new int[arr.length];

       System.out.println("Enter the array elements");
       for(int m=0;m<a.length;m++)
        { 
           a[m] = sc.nextInt();
        }
    }

 
    void reverseArray()
     { 
        int i = 0;
        int j = a.length-1;


        while(i <= j)
         { 
            // swap i and j th position elements
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            // increment i and decreament j.
            i++;
            j--;
         }

        System.out.println("Print the array elements after reversing the array");
        for(int m=0;m<a.length;m++)
         { 
            System.out.print(a[m]+" ");
         }
 
     }



}


public class ArrayReverse
{
   public static void main(String ss[])
   { 
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the size of array");
     int n = sc.nextInt();

     int arr[] = new int[n];

     Reversearray obj = new Reversearray();

     obj.inputArray(arr);

     obj.reverseArray();
   
 
   }
}