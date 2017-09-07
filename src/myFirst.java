import java.util.Scanner;

public class myFirst 
{
	

	public static void main(String[] args) 
	{
		/*This is a
		 * multiline comment
		 */
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an amount in double number");
		double amount = keyboard.nextDouble();
		
		int remainingAmount = (int)(amount*100);
		
		//finding the number of 1 dollar
		int numberOfOneDollars = remainingAmount / 100;
		
		remainingAmount %= 100;
		int numberOfQuarters = remainingAmount / 25;
		
		remainingAmount %= 25;
		int numberOfDimes = remainingAmount / 10;
		
		remainingAmount %= 10;
		int numberOfNickels = remainingAmount / 5;
		
		remainingAmount %= 5;
		int numberOfCents = remainingAmount;
		
		System.out.println("The amount " + amount + " that you entered consist of: ");
		System.out.println("     " + numberOfOneDollars+" in one dollar");
		System.out.println("     " + numberOfQuarters+" in quarters");
		System.out.println("     " + numberOfDimes+" in dimes");
		System.out.println("     " + numberOfNickels+" in nickels");
		System.out.println("     " + numberOfCents+" in cents");
		keyboard.close();;


	}

}
