import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class hw22
{
	public static void main(String[] args)
	{
		// base variables
		FileInputStream fileIn = null;
		Scanner fileScan = null;
		PrintWriter fileOut = null;
		
		String codes = "*BEA@FK%RM";
		String digits = "0123456789";
		

		// try open numbers.txt
		try
		{
			fileIn = new FileInputStream("numbers.txt");
			fileScan = new Scanner(fileIn);
		}// end try open file
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found..");
			System.exit(0);
		}
		// try connect to new file
		try
		{
			fileOut = new PrintWriter(new FileOutputStream("encodedNumbers.txt"));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error opening file encodedNumbers.txt");
			System.exit(0);
		}

		while(fileScan.hasNext())
		{
			String answer = "";
			String answerNew = null;
			String answerNewZero = null;

			String fileDigits = fileScan.nextLine();
			
			// convert file digits string to int for the purposes of determing whether numbers are odd or even.
			int conversion = Integer.parseInt(fileDigits);

			// find last digit for determination of even or odd
			int lastDigit = conversion % 10;
			//find first digit for determination of even or odd
			int firstDigit = 0;
			firstDigit = conversion;
			while(firstDigit >= 10)
			{
				firstDigit = firstDigit / 10;

			}// end of first digit

			// loop through text file and encode digits
			for (int index = 0; index < fileDigits.length(); ++index)
			{
				answer += codes.charAt(digits.indexOf(fileDigits.charAt(index)));
			}

			if (firstDigit % 2 == 0 && lastDigit % 2 == 0)
			{
				String codeMinusFirstLast = answer.substring(1,answer.length()-1);
				answer = "$" + codeMinusFirstLast + "$";
				
			}// end of if even

			else if (firstDigit % 2 != 0 && lastDigit % 2 != 0)
			{
				String codeMinusFirstLast = answer.substring(1,answer.length()-1);
				answer = 'X' + codeMinusFirstLast + 'X';
				
				
			}// end of if odd

			if (lastDigit == 0)
			{
				String codeMinusLast = answer.substring(0,answer.length()-1);
				answer = codeMinusLast + '#';
				
			}// end of if last = 0
			
			// send loop / encryption to file
			System.out.println(answer);
			fileOut.println(answer);
			fileOut.flush();

		}// end of fileScan
	}// end of main
}// end of class