class check
{
  static int a = 10;
  int b = 20;


  public static void disp()
   { 
     a = 200;
     b = 300;
     
     System.out.println(" a = " + a  + " b =  " +   b);
    }




}



public class Check_static
{
  public static void main(String ss[])
   { 
     check obj = new check();

     obj.disp();
     
 

 
 
 
   }
}