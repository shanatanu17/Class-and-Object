import java.util.*;

class findavg
{
   int a[];  

   void inputarray(int arr[])
    { 
       a = new int[arr.length];         

       Scanner sc = new Scanner(System.in);

       for(int i=0;i<a.length;i++)
        {
           a[i] = sc.nextInt();
        }
    }


    double findAverage(int arr[])
    { 
       double sum  = 0;
        
       for(int i=0;i<a.length;i++)
         {
           sum = sum + a[i];
         } 

       return sum / a.length; 
    }

}




public class ArrayAverage
{
   public static void main(String ss[])
   { 
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the array size");
      int n = sc.nextInt();

      int arr[] = new int[n];

      findavg obj = new findavg();

      obj.inputarray(arr);
      double avg =  obj.findAverage(arr);


      System.out.println("print the average "  + avg);



     

      
      
      

 
 
   }



}