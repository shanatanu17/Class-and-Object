class Multiplyy
{
  int a,b;
  void mul(int x,int y)
   {
     a = x;
	 b = y;
   }
   
   void print()
   {
      System.out.println("Multiplication of a and b  is  " + (a*b));
   }
}


public class object_with_reference
{
   public static void main(String ss[])
   {
      Multiplyy m1 = new Multiplyy();
	  m1.mul(10,20);
	  m1.print();
   }
}