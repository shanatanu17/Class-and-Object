import java.util.*;

class removeele
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

   
   void removeDuplicate()
    { 
       int n = a.length;

       // 1. Remove elements   


       for(int i=0;i<n;i++)
        { 
          for(int j=(i+1);j<n;j++)
           { 
             if(a[i] == a[j])
              {
                 for(int k=j;k<n-1;k++)
                  {
                     a[k] = a[k+1];
                  }

                   n--;
                   j--;
              }
                   
           }
        }


        for(int i=0;i<n;i++)
      { 
         System.out.print(a[i]+" ");
      }


      
    }

    
     


}




public class ArrayRemoveDuplicate
{
  public static void main(String ss[])
   { 
     Scanner sc = new Scanner(System.in);
    
     System.out.println("Enter the size for array");
     int n = sc.nextInt();

     int arr[] = new int[n];

     removeele obj = new removeele();

     obj.inputArray(arr);

     obj.removeDuplicate();
    } 
}