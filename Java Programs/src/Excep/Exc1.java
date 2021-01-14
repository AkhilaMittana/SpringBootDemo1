package Excep;

import java.util.*;
class Exc1
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
 // System.out.println("Enter two number");
  int x[] ={1,2,3,4};
 // x=sc.nextInt();
  //y=sc.nextInt();
  
  try{
   
      System.out.println(x[5]);
   }
     
   catch(Exception e)
   {
     System.out.println("Array out of bound");
   }
  /*catch(ArithmeticException e)
  { 
  System.out.println("Zero should not be in denominator");
 }*/
//System.out.println("the value "+x[4]);
System.out.println("Exception completed");
}
}
