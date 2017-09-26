import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;
/*Ramisha Sarwar
 * 
 */
public class GuessingGame {
	public static void main (String[] args)
	{
		/*Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String s = input.next();
		System.out.println("Nice to meet you " + s);
		System.out.println("How old are you?");
		String r = input.next();
		System.out.println("You are " + r + " years old.");*/
		
		int answer = (int)(Math.random()*10 + 1);
		boolean isNumber = false;
		int guess = 0;
		while(guess != answer)
		{
			while(!isNumber)
			{
				try
				{
					System.out.println("Enter your guess");
					Scanner input = new Scanner(System.in);
					guess = input.nextInt();
					isNumber = true;
					if(guess == answer)
					{
						System.out.println("That is correct!");
					}
					else
					{
						System.out.println("That is not correct");
					}
				}
				catch (InputMismatchException e)
				{
					System.out.println("That was error type: "+ e);
					System.out.println("Please try again");
				}
			}
		}
	}

}
