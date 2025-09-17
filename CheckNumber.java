import java.util.*;

class NumberCheck
{
   void isEven(int no)
    {  
       if(no % 2 == 0)
        {
          System.out.println("Even no");
        }
       else
        {
           System.out.println("Odd no");
        }
 
 
    }
}





public class CheckNumber
{
   public static void main(String ss[])
   { 
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a number to check");
      int no = sc.nextInt();

      NumberCheck obj = new NumberCheck();

      obj.isEven(no);
  
      
      

 
 
   }
}
