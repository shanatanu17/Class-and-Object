// This code generates a NullPointerException , in this code we are going to find/use the length of the ans array
// where , the ans array actually contains a NULL value.
 
// so , during execution this code gives an exception...


class temp
{
  // this a[] takes the space in statck memory
  int a[];


  // these fucntions also get space in stack memory
  void setval(int arr[])
  {
    a = arr;
    a[3] = 1700;
  }

  
  //this returns a base address of array , so we need to take it in array thats why the return type is int[].
  int[] getval()
  {
    return a;
  }



}




public class Return_a_array_from_function_second
{
   public static void main(String ss[])
   { 
      
               // this line bcz of new keyword takes space in heap memory
               // s[] ---> takes space in stack memory it is a class level.

     int s[] = new int[]{1,2,3,4,5,6};

    

     System.out.println("Print the array elements");
     for(int i=0;i<s.length;i++)
      {
         System.out.print(s[i]+" ");
      }



     new temp().setval(s);


     // here , called the getval() and which returns a base address of array and for that new 
     // need to store it in a array.


     int ans[] = new temp().getval();

      System.out.println("Print the array elements after changes");
     for(int i=0;i<ans.length;i++)
      {
         System.out.print(ans[i]+" ");
      }

      


     


     
 
 
 
 
 

   }
}