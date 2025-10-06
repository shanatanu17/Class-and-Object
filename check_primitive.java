public class check_primitive
{
  public static void main(String ss[])
   {
   
     check_primitive obj = new check_primitive();
     
     obj.method(10);
   }

  
/*
  public void method(int no)
   { 
     System.out.println("Int value is " + no);
   }
*/

  public void method(byte b)
   {
     System.out.println("byte value is " + b);
   }

  public void method(short s)
   { 
     System.out.println("SHort value is " + s);
   } 

  public void method(Integer i)
  {
     System.out.println("Integer value is " + i);
  } 

  
}