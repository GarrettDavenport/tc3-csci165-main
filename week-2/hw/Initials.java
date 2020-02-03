import java.util.Scanner;


public class Initials{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in); // Initializing Scanner
        System.out.println("Please enter your first and last name: ");
        String firstName = input.next(); // First
        String lastName = input.next(); // Last

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);

        char firstFirst = firstName.charAt(0); // Grabbing first char of first name
        char firstLast = lastName.charAt(0); // Grabbing first char of last name

        System.out.println("First Initial: " + firstFirst);
        System.out.println("Last Initial: " + firstLast);

        int codeFirst = firstFirst; // setting int variables to represent the chars and convert Unicode
        int codeLast = firstLast;

        // Converting char to string
        String str1 = String.valueOf(firstFirst);
        String str2 = String.valueOf(firstLast);

        System.out.println("Unicode first initial: " + codeFirst);
        System.out.println("Unicode last initial: " + codeLast);
        System.out.println("Unicode sum: " + (codeFirst + codeLast));

        // Concatenating initials as string
        System.out.println("Concatenated initials: " + str1 + str2);
        scanner.close();
        
   






    }// end of main
} // end of class