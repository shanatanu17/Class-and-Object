class Store_values
{

  int a;

  void display()  
  {
    System.out.println("Var a value is " + a);
  }

}


public class Instance_variable
{
  public static void main(String ss[])
   { 
 
     Store_values obj1 = new Store_values();
     Store_values obj2 = new Store_values();
     

     obj1.a = 10;
     obj2.a = 200;

     obj1.display();
     obj2.display();

   }
}