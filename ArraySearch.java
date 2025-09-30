import java.util.*;

class findelement
{
   int a[];

   Scanner sc = new Scanner(System.in);


   void inputArray(int arr[])
    { 
       a = new int[arr.length];
 
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the array elements");
       for(int i=0;i<a.length;i++)
        { 
           a[i] = sc.nextInt();
        }
    } 

 
    public boolean searchElement(int arr[])
     {  
       System.out.println("Enter the key element to search ");
       int key = sc.nextInt();

       for(int i=0;i<a.length;i++)
        {
           if(a[i] == key)
            { 
               return true;
            }
        }

        return false;
     }
}



public class ArraySearch
{
  public static void main(String ss[])
  { 
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the array size");
     int n = sc.nextInt();
 
     findelement obj = new findelement();

     int arr[] = new int[n];
 
     obj.inputArray(arr);

     Boolean ans = obj.searchElement(arr);

     System.out.println(ans);

           

     
 
 
  }
}
