class Assign
{

  public void show()
    { 
      System.out.println("I am in I.I");
    }
   

 
  {
    System.out.println("First Instance Initializer called ");
    int a = 10;  
    System.out.println("a value Inside of block is " + a );

    show();
  }  

  
  
 
}



public class Instance_Initializer
{
  public static void main(String ss[])
   {  
     Assign obj = new Assign();
   }
}