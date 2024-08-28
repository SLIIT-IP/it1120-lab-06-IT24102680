import java.util.Scanner;

public class IT24102680Lab6Q1
{
  public static void main(String[] args)
  {
	Scanner input = new Scanner(System.in);
	double number;

	System.out.print("Enter a number: ");
	number = input.nextDouble();

	double square = (number*number);
	double squareroot = Math.sqrt (number);

	System.out.println("The square of " +number +" is : " +square);
	System.out.println("The square root of " +number +" is : " +squareroot);

  }
}