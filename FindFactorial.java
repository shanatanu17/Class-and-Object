import java.util.*;

class factorial
{
   int fact(int no)
    {
      int f = 1;

       for(int i=1;i<=no;i++)
        {
          f = f * i;
        }

       return f;
    }


}



public class FindFactorial
{
   public static void main(String ss[])
    {
       Scanner sc = new Scanner(System.in);
       int no =  sc.nextInt();

       factorial obj = new factorial();

       int ans = obj.fact(no);
       System.out.println("Factorial of a no is " + ans);

      

 
    }
}