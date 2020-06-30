/*WAP to take user inputs and print the account details
import java.util.*;
import java.lang.*;
class Details
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String s;
		int a,b;
		System.out.println("Enter username");
		s=sc.nextLine();
		System.out.println("Username :"+s);
		System.out.println("Enter acc no.");
		a=sc.nextInt();
		System.out.println("Acc_No:"+a);
		System.out.println("Enter acc balance");
		b=sc.nextInt();
		System.out.println("Acc_balance"+b);
		
	}
}