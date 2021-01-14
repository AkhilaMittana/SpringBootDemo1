package Excep;

import java.util.*;
class Exc2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the  array");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the "+n+" elements");
try{
for(int i=0;i<=n;i++)
 {
   a[i]=sc.nextInt();
 }
  }
catch(ArrayIndexOutOfBoundsException e)
 {
   System.out.println("Array out of bound");
 }
catch(ArithmeticException e)
{
System.out.println("Arithmetic error");
}
for(int i=0;i<n;i++){
System.out.println("The array "+a[i]);
}
System.out.println("Exception completed");
}

}
