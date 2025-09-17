import java.util.*;

class Swap
{
   int a;
   int b;
   void swapno(int x,int y)
   {
      a = x;
      b = y;
 
      x = x+y;
      y = x-y;
      x = x-y;

      System.out.println(x);
      System.out.println(y);
   
   }

 

   

}


public class SwapNumber
{
 public static void main(String ss[])
 { 
 
   Scanner sc = new Scanner(System.in);

   System.out.println("Enter values for a and b");
   int x = sc.nextInt();
   int y = sc.nextInt(); 

   Swap obj = new Swap();

   obj.swapno(x,y);

   

   

 }

}


