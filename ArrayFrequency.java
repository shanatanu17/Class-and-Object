import java.util.*;

class Findfreq
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


   void countFrequency()
    { 
       int n = a.length;

       for(int i=0;i<n;i++)
        {
          int count = 1;
          for(int j=(i+1);j<n;j++)
           { 
              if(a[i] != -1)
               { 
                if(a[i] == a[j])
                 {
                  count++;
                  a[j] = -1;
                 }
               }
           }
           

          if(a[i] != -1)
           {            
            System.out.println("count for " + a[i] +" is " + count);
           }
        }
    }



}




public class ArrayFrequency
{
  public static void main(String ss[])
  { 
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the array size");
    int n = sc.nextInt();


    int arr[] = new int[n];

    Findfreq obj = new Findfreq();

    obj.inputArray(arr);

    obj.countFrequency();

    
 

  }
}