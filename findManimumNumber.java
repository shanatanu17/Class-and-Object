import java.util.*;


class MaxFinder
{
   void findmax(int a,int b,int c)
    {
 
       if(a > b)
        {
           if(a > c)
            {
               System.out.println("a is greater");
            }
           else
            {
               System.out.println("c is greater");
            }
        }

       else
        { 
           if(b > c)
            {
              System.out.println("b is greater");
            }
           else
            {
               System.out.println("c is greater");

            }
     
        }
 
    }
}



public class findManimumNumber
{
   public static void main(String ss[])
    {
       Scanner sc = new Scanner(System.in);

       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();

        
       MaxFinder mx = new MaxFinder();

       mx.findmax(a,b,c);
       

       
      

 
    }
}