import java.util.*;

class FindIntersection
{
  Scanner sc = new Scanner(System.in);
  int a1[];
  int a2[];

  void inputArrays(int arr1[] , int arr2[])
  {  
     a1 = new int[arr1.length]; /
     System.out.println("ENter the array 1 elements");
     
     for(int i=0;i<a1.length;i++)
      { 
        a1[i] = sc.nextInt();
      }

 
     a2 = new int[arr2.length]; 
     System.out.println("ENter the array 2 elements");
     
     for(int i=0;i<a2.length;i++)
      { 
        a2[i] = sc.nextInt();
      }
  } 
  

  void findIntersection()
  {  
     Arrays.sort(a1);
     Arrays.sort(a2);


     int i=0;
     int j=0;

     while(i < a1.length && j < a2.length)  
      { 
         if(a1[i] == a2[j])
          {
             System.out.println("Common elements are " + a1[i]);
             i++;
             j++;
          }

         else if(a1[i] > a2[j])
          { 
             j++;
          }
        else
          {
             i++;
          }
      }     
    
  }

}




public class ArrayIntersection
{
   public static void main(String ss[])
   {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the array 1 length");
      int n1 = sc.nextInt();
      int arr1[] = new int[n1];

      System.out.println("Enter the array 2 length");
      int n2 = sc.nextInt();
      int arr2[] = new int[n2];
 
      FindIntersection obj = new FindIntersection();

      obj.inputArrays(arr1,arr2);

      obj.findIntersection(); 
   }
}