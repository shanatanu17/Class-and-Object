import java.util.*;

class SquareFinder
{
  int square(int no)
   { 
     int sq = no * no;
     return sq;
   }
}






public class FindSquare
{
  public static void main(String ss[])
   {
     Scanner sc = new Scanner(System.in);
 
     int no = sc.nextInt();

     
     SquareFinder obj = new SquareFinder();
     int ans = obj.square(no);

      System.out.println( "Square of a number is "+ ans);
     
   

 
   }
}