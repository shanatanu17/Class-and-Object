import java.util.*;


class power
{
   int powercal(int b,int pw)
    {
       int p = 1;

       for(int i=1;i<=pw;i++)
         {
           p = p * b;
         }

       return p;
    } 

}




public class CalculatePower
{
   public static void main(String ss[])
   {
     Scanner sc = new Scanner(System.in);
 
     System.out.println("Enter a base");
     int base = sc.nextInt();

     System.out.println("Enter a power");
     int pw = sc.nextInt();


     power obj = new power();

     int ans = obj.powercal(base,pw);
     
     System.out.println(ans); 


 
   
   } 
 



}