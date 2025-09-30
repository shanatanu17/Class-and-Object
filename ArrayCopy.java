import java.util.*;

class copyarray
{
   Scanner sc = new Scanner(System.in);
   int a[];
   void inputArray(int arr[])
    { 
      a = new int[arr.length];
 
      System.out.println("Enter the array elements");
      for(int i=0;i<a.length;i++)
       { 
         a[i] = sc.nextInt();
       }
    } 

     
    int[] copyArray() 
     { 
        int copyarr[] = new int[a.length];

        for(int i=0;i<a.length;i++)
         { 
            copyarr[i] = a[i];
         }
 
       return copyarr;
     }




}


public class ArrayCopy
{
   public static void main(String ss[])
    {
       Scanner sc =new Scanner(System.in);
 
       System.out.println("Enter the value for size");
       int n = sc.nextInt();

       int arr[] = new int[n];

       copyarray obj = new copyarray();

       obj.inputArray(arr);
       int ans[] = obj.copyArray();

       System.out.println("Print the copied array elements");
       for(int i=0;i<ans.length;i++)
        { 
           System.out.print(ans[i]+" ");
        }

        

       
 
 
 
    } 
}