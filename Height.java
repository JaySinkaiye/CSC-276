import java.util.Scanner;

public class Height
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num1;
		System.out.println("Enter your height: ");
		num1 = input.nextInt();
		System.out.println("Your height is " + num1/12 + " feet " + num1%12 + " inches.");
		input.close();
	}
}