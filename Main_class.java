class calculator
{
   void add(int a,int b)
   {
      System.out.println("addition is " + (a+b));
   }
   
   void sub(int a,int b)
   {
      System.out.println("substraction is "+ (a-b));
   }
   
   void mul(int a,int b)
   {
      System.out.println("Mul is "  +(a*b));
   }
   
   void div(int a,int b)
   {
      System.out.println("division is " + (a/b));
   }
 
}



public class Main_class
{
  public static void main(String ss[])
	{
      calculator c1 = new calculator();
   
      c1.add(20,10);
      c1.sub(20,10);
      c1.mul(20,10);
      c1.div(20,10);
    }
}