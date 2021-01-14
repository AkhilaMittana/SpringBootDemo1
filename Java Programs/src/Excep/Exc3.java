package Excep;
import java.util.*;
public class Exc3 {

	public static void main(String[] args) {
		String str= null;
		String str1="Hello";
		try {
			System.out.println(str.equals(str1));
			}
		 catch(NullPointerException e) {
        	 System.out.println("Null value");
         }
		catch(ArithmeticException e) {
       	 System.out.println("Null value");
        }
         catch(Exception e) {
        	 System.out.println("Null value");
         }
		System.out.println("Execution completed");
	}

}
