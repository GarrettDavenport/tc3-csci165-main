import java.util.Scanner;

public class hw21
{
	public static void main(String[] args)
	{
		// Base vars
		Scanner keyboard = new Scanner(System.in);
		String codes = "*BEA@FK%RM";
		String digits = "0123456789";
		String answer = "";
		
		// User input
		System.out.println("\tEnter a sequence of base 10 digits: \n");
		int userDigit = keyboard.nextInt();

		// Convert the int to string
		String userDigitString = Integer.toString(userDigit);
		// Catch last digit of entered number
		int lastDigit = userDigit % 10;
		
		// Catch first digit of entered number
		int firstDigit = 0;
		firstDigit = userDigit;

		while(firstDigit >= 10)
		{
			firstDigit = firstDigit / 10;
		}

		// Loop assigning values 0-9 to String codes
		for (int index = 0; index < userDigitString.length(); ++ index)
		{

			answer += codes.charAt(digits.indexOf(userDigitString.charAt(index)));
		
			
		}// end of main for loop

		if (firstDigit % 2 == 0 && lastDigit % 2 == 0)
		{
			// Drop the first and last characters of the answer & add ''
			String codeMinusFirstLast = answer.substring(1, answer.length()-1);
			String answerNew = '$' + codeMinusFirstLast + '$';
			System.out.println(answerNew);
			
		}
		else if (firstDigit % 2 != 0 && lastDigit % 2 != 0)
		{
			String codeMinusFirstLast = answer.substring(1, answer.length()-1);
			String answerNew = 'X' + codeMinusFirstLast + 'X';
			System.out.println(answerNew);
		}
		if ( lastDigit == 0)
		{
			String codeMinusLast = answer.substring(0, answer.length()-1);
			String answerNew = codeMinusLast + '#';
			System.out.println(answerNew);
		}
		else if (firstDigit % 2 == 0 && lastDigit % 2 != 0 || firstDigit % 2 != 0 && lastDigit % 2 == 0)
		{
			System.out.println(answer);
		}
		//System.out.println(answer);	



		
	} // end of main

}// end of class