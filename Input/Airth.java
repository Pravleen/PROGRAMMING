/*Write a program that takes two numeric values from user and perform airthmetic operations*/
import java.util.*;
import java.lang.*;
class Airth
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a,b;
		System.out.println("Enter first number:");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		System.out.println("Sum is:"+(a+b));
		System.out.println("Difference is:"+Math.abs(a-b));
		System.out.println("Multiplication is:"+(a*b));
		System.out.println("Division is:"+(a/b));
	}
}