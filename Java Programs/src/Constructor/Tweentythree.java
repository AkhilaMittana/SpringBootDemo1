package Constructor;
import java.util.*;
public class Tweentythree {

	public static void main(String[] args) {
		
		double sum=0;
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter no.of terms");
		n=sc.nextInt();
		int i,x;
		for( i=1;i<=n;i++)
		{
			x=(Math.pow(i*i)/factorial(i));

			sum=sum+x;
		}
		System.out.println("Sum of the series "+sum);
		}
		static int factorial(int n)
		{
		 int fact;
		 if(n==1)
		   return 1;
		 else{
		     fact=n*factorial(n-1);
		     return fact;
		     }
		}
		

	}


