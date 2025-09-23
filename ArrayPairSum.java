import java.util.*;

class findpairs
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


    // find pairs
   void findPairs(int target)
    { 
       
       for(int i=0;i<a.length;i++)
        { 
          for(int j=(i+1);j<a.length;j++)
          { 
             if(a[i] + a[j] == target)
               { 
                  System.out.println(i + " , " + j );
               }
          }
        }
    }
}


public class ArrayPairSum
{
  public static void main(String ss[])
   { 
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter size of array");
     int n = sc.nextInt();

     int arr[] = new int[n];

     findpairs obj = new findpairs();

     obj.inputArray(arr);

     System.out.println("Enter the target element ");
     int target = sc.nextInt();

     obj.findPairs(target);
  }



}