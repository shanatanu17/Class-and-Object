class NumberCompare
{
   void compare(int a,int b)
   {
     if(a == b)
      {
          System.out.println("Both are equal");
      }
     else if(a < b)
      {
          System.out.println("a is lesser than b");
      }
     else
      {
          System.out.println("a is greater than b");
      }
   }

}



public class Check
{
   public static void main(String ss[])
   {
      NumberCompare obj = new NumberCompare();

      int a = 20;
      int b = 10;

      obj.compare(a,b);
   }


}