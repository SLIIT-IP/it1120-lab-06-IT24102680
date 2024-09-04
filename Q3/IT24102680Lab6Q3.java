import java.util.Scanner;

public class IT24102680Lab6Q3{

  public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	int count = 0;
	double sumOfSquares = 0.0;

	System.out.print("Enter positive integers (terminate input with -99)\n");
	while (true)
 	{
	  System.out.print("Enter a number:");
  	  int number = input.nextInt();
  
  	  if (number == -99)
	  {
    	    break; // Terminate input if -99 is entered
    	  }

  	  if(number<0)
	  {
    	    System.out.println("Invalid input. Please enter a positive integer or -99 to terminate.");
	    continue; // Skip the current iteration and ask for input again
 	  }

 	  sumOfSquares += Math.pow(number,2);
 	  count++;
	}

	double rms = Math.sqrt(sumOfSquares/count);

	System.out.print("\nThe Root Mean Square (RMS) is: " +rms);

  }
}