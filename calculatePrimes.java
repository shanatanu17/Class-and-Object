import java.util.*;

class primes
{
   boolean check(int no)
    { 
       int count = 0;
 
       for(int i=1;i<=no;i++)
        {   
           if(no % i == 0)
            { 
                count++;
            }
        }

      

        if(count > 2)
         {
            return false;
         }
 
        return true;
    } 
}



public class calculatePrimes
{
 public static void main(String ss[])
 {
 
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter a number to check ");
  int no = sc.nextInt();


  primes obj = new primes();

  boolean ans = obj.check(no);

  System.out.println(ans);

 

  

  

 }

}