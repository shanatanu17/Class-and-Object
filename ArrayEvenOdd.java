import java.util.*;

class findevenodd
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

   
   int countEven()
    { 
       int evencount = 0;
       for(int i=0;i<a.length;i++)
        { 
           if(a[i] % 2 == 0)
            { 
              evencount++;
            }
        }

       return evencount;
    }


    int oddCount()
     { 
        int oddcount = 0;
        for(int i=0;i<a.length;i++)
         { 
           if(a[i] % 2 != 0)
            { 
               oddcount++;
            }
         }
      return oddcount;
     }
   




}


public class ArrayEvenOdd
{
  public static void main(String ss[])
  {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the size for array");
     int n = sc.nextInt();     

     int arr[] = new int[n];

     findevenodd obj = new findevenodd();

     obj.inputArray(arr);

     int evencnt = obj.countEven();
     int oddcnt = obj.oddCount();

     System.out.println("Total no of even elements are " + evencnt);
     System.out.println( "Total no of odd elements are "+ oddcnt);




     

  
 
  }
}