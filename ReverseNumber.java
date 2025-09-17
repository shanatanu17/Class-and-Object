import java.util.*;

class Reverse
{
   int reverse(int no)
    {
       int rev = 0;

       while(no != 0)
        {
           int ld = no % 10;
           rev = rev * 10 + ld;
           no = no / 10; 
        }

      return rev;
    }
}





public class ReverseNumber
{
   public static void main(String ss[])
    {
       Scanner sc = new Scanner(System.in);

       int no = sc.nextInt();

       Reverse obj = new Reverse();

       int ans = obj.reverse(no);

       System.out.println("The  reverse of a no is "+ ans);

    }
}