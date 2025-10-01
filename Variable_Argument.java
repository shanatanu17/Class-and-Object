class Temp
{
  void add(String name , int ...x)
   {  
     System.out.println("Name is " + name);
  
     int sum = 0;
     for(int i=0;i<x.length;i++)
      { 
        sum = sum + x[i];
      }

     System.out.println(sum);

   }




}



public class Variable_Argument
{
  public static void main(String ss[]) 
  {  
    Temp t = new Temp();

    t.add("shantanu" , 1,2,3,4,5);
    t.add("shantanu", 10,20,30);
    t.add("shantanu",1,2);
    t.add("shantanu");
    
 
 
  }




}