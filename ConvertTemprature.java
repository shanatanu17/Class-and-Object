import java.util.*;


class TemparatureConversion
{
   int covertToFahrenheit(int temp)
    {
        int f = ((9 * temp)/5) + 32;
        return f;
    }
}




public class ConvertTemprature
{
   public static void main(String ss[])
   {
     Scanner sc  = new Scanner(System.in);
     int temp = sc.nextInt();

 
     TemparatureConversion obj = new TemparatureConversion();

    int ans =  obj.covertToFahrenheit(temp);
 
    System.out.println("Celcius to farhneit conversion is "+ans);

     
  
     

     

   }
}