import java.util.*;
public class main
{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("Your age is "+age);
		System.out.println("How much years do you want to calculate?");
		int years = sc.nextInt();
		int ageFuture = age+years;
		System.out.println("Your age in "+years+" years will be "+ageFuture);
	}
}
