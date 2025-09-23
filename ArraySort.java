import java.util.*;


class sort
{

   Scanner sc = new Scanner(System.in);
   int a[];
 
   void inputArray(int arr[])
    {
       a =new int[arr.length];

       System.out.println("Enter the array elements");
       for(int i=0;i<a.length;i++)
        { 
          a[i] = sc.nextInt();
        }
   } 
  
  
   void sortArray() 
    { 
       int n = a.length;

       for(int i=0;i<n;i++)
        { 
          for(int j=i;j<n-1;j++)
          { 
            if(a[j] > a[j+1])
             { 
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
             }
          }
        }


       System.out.println("Array elements after sorting a=the elements");
       for(int i=0;i<a.length;i++)
        { 
           System.out.print(a[i]+" ");
  
        }
  
 
    }
   
   



}




public class ArraySort
{
  public static void main(String ss[])
   { 
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter the size of array");
     int n = sc.nextInt();

     int arr[] = new int[n];
 
     sort obj = new sort();

     obj.inputArray(arr);

     obj.sortArray();

    

     

 
 
 
  }   
}



