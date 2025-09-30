import java.util.*;

class checkpalindrome
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

  
    boolean isPalindrome()
     { 
        int i = 0;
        int j = a.length-1;

       while(i < j)
         { 
 
           if(a[i] != a[j])
            {
               return false;
            }

           i++;
           j--;
         }
       return true;
     }

   



}


public class ArrayPalindrome
{
   public static void main(String ss[])
   { 
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the size of array");
     int n = sc.nextInt();

     int arr[]  = new int[n];

     checkpalindrome obj = new checkpalindrome();

     obj.inputArray(arr);

     boolean ans = obj.isPalindrome();

     System.out.println("check array is palindrome or not---- >  "+ ans );




     
 
 
 
 
   }



}