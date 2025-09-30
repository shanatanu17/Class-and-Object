import java.util.*;


class FindMax
{
   //instance var
   int m[];


   // method use to set values to instance array(class level array)
   void set(int arr[])
    {
       m = arr;
    }


   // method use to find out the maximum value from array
   int get()
   {
     int max = Integer.MIN_VALUE;

     for(int i=0;i<m.length;i++)
      { 
         if(m[i] > max)
          {
            max = m[i];
          }
      }

     return max;

   }




}






public class Main_Class_To_Find_Max
{
   public static void main(String ss[])
   { 
      Scanner sc = new Scanner(System.in);

      FindMax obj = new FindMax();   

     
      int arr[] = new int[5];

      System.out.println("Enter the array elements ");
      for(int i=0;i<arr.length;i++)
       {
           arr[i] = sc.nextInt();
       }
          



      // call to set and get 

      obj.set(arr);

      int maximum_element = obj.get();

      System.out.println("Maximum element in array is " + maximum_element); 
 
      


   }



}