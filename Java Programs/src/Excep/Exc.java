package Excep;

import java.util.*;
class Exc
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter two number");
  int x,y,z=0;
  x=sc.nextInt();
  y=sc.nextInt();
  
  try{
     z=x/y;
     }
  catch(Exception e)
   {
     System.out.println("You should not divide with zero");
   }
  /*catch(ArithmeticException e)
  { 
  System.out.println("Zero should not be in denominator");
 }*/
System.out.println("the value "+z);
System.out.println("Exception completed");
}
}
