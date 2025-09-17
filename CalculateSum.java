import java.util.*;


class Calculate
{
   int calsum(int no)
    { 
       int sum = 0;

       while(no != 0)
        { 
           int ld = no % 10;
           sum = sum + ld;
           no = no / 10;
        }

      return sum;
    }
  
}


public class CalculateSum
{
   public static void main(String ss[])
   {
      Scanner sc = new Scanner(System.in);

      int no = sc.nextInt();

      Calculate obj = new Calculate();
      int ans = obj.calsum(no);

      System.out.println("The sum of the given number is " +  ans);

   
   }
}