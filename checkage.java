import java.util.*;

class Voter
{
   void isEligible(int age)
    {
      if(age > 18)
       {
         System.out.println("Eligible for vote");
       }
      else
       {
         System.out.println("not Eligible for vote");
       }
    }

}





public class checkage
{
  public static void main(String ss[])
  {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter a age");
     int age = sc.nextInt();

     

     Voter obj = new Voter();
     obj.isEligible(age);
     
 
 
 
  }
}