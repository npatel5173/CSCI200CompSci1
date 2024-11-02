import java.util.Scanner;

class Fraction
{
	public static void main(String[] args)
	{
    // declare a scanner object for input
		int num1, num2;
    Scanner scan = new Scanner(System.in);
    // prompt for numerator and read in - use print instead of println so the user will input on the same line as the prompt
    System.out.print("Enter the numerator: ");
    num1 = scan.nextInt();
    // prompt for denomator and read in - use print instead of println so the user will input on the same line as the prompt
    System.out.print("Enter the denominator: ");
    num2 = scan.nextInt();
    // compute the answer and store in a variable of type double
    double answer = (double) num1 / num2;
    // ouutput the answer
    System.out.println(answer);
  }
}