import java.util.*;


class cal
{
   void calculate(int p,int n,int r)
    {
      int si = p*n*r/100;
      System.out.println("SI is " + si);
    }
}




public class SimpleInterest
{
   public static void main(String ss[])  
   {
      Scanner sc = new Scanner(System.in);

      cal obj = new cal();

      int p = sc.nextInt();
      int n = sc.nextInt();
      int r = sc.nextInt();

      obj.calculate(p,n,r);
   }
}