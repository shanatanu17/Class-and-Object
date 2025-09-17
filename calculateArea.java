import java.util.*;

class Area
{
   int circleArea(int rad)
    {
      int area = (int)(3.14 * rad * rad);
      return area;
    }
}




public class calculateArea
{
  public static void main(String ss[])
   {
     Scanner sc = new Scanner(System.in);
     int rad = sc.nextInt();

     Area obj = new Area();
     
     int ans = obj.circleArea(rad);

     System.out.println("Area of a circle is " + ans);
 
   
   }



}