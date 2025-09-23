import java.util.*;

class Merge
{
  Scanner sc = new Scanner(System.in);
 
  int a1[];
  int a2[];
  int ans[];
 
  void  inputArray(int arr1[] , int arr2[])
   { 
     a1 = new int[arr1.length];
     a2 = new int[arr2.length];

     for(int i=0;i<arr1.length;i++) 
      { 
        a1[i] = sc.nextInt();
      }

     for(int i=0;i<arr2.length;i++) 
      { 
        a2[i] = sc.nextInt();
      }
   }


   int[] mergeArrays()
    { 
       ans = new int[a1.length + a2.length];

       int i = 0;
       int j = a1.length;

       for(int m=0;m<a1.length;m++)
        {
           ans[i] = a1[m];
           i++;
        }

       for(int m = 0;m<a2.length;m++)
        {
           ans[j] = a2[m];
           j++;
        }

       

       return ans;
    }




}



public class ArrayMerge
{
   public static void main(String ss[])
    { 
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the size for array 1");
       int n1 = sc.nextInt();

       System.out.println("Enter the size for array 2");
       int n2 = sc.nextInt();

       int arr1[]= new int[n1];
       int arr2[]= new int[n2];

       
       Merge obj = new Merge();

       obj.inputArray(arr1,arr2);

       int ans[] = obj.mergeArrays();

       System.out.println("Print the merge array");
       for(int i=0;i<ans.length;i++)
        {
          System.out.print(ans[i]+" ");
        }
       
       

       
 
 
 
    }
}