class Multiply
{
  int a,b;
  
  void mul(int x,int y)
  {
    a = x;
	b = y;
  }
  
  
  void print()
  {
    System.out.println("multiplication of a and b " + (a*b));
  }

}



public class Object_without_reference
{
  public static void main(String ss[])
  {
     
	 // here,  we dont create any reference var so , whenever we create a ---> new Multiply() that every
	 // time in memory new object is created .... and as we know instance varibales get initialized for every object which we created and get default
	 // values as 0 . so , bcz of that a and b set to 0 and in multiplication we get 0...
	 new Multiply().mul(10,20);
	 new Multiply().print();
  
  
  }
}