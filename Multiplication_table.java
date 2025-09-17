

class Multiply
{
   void printTable(int no)
     {
       for(int i=1;i<=10;i++)
        {
          System.out.println(no * i);
        }
     }
}


public class Multiplication_table
{
   public static void main(String ss[])
   {
      int no = 32;
      Multiply obj = new Multiply();

      obj.printTable(no);
   }
}