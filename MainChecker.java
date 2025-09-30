class LeapYearChecker
 {
    
    void check(int year)
     {
        
        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) 
         {
              System.out.println("Leap");
         } 
       else
         { 
            System.out.println("NOt Leap");

         }
     }
 }

 
 public class MainChecker
  {
     public static void main(String ss[])
      {  
         LeapYearChecker obj = new  LeapYearChecker();

         int year = 1938;
         obj.check(year);
 
      }
  }