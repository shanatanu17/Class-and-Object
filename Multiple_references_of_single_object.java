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
    System.out.println("Multiplication of a and b " + (a*b));
  }

}




public class Multiple_references_of_single_object
{
   public static void main(String ss[])
   {
      Multiplyy m1 = new Multiplyy();
	  m1.mul(10,20);
	  Multiplyy m2 = m1;
	  
	  m2.mul(5,4);
	  m2.print();
	  
	  
   
   
   }
}