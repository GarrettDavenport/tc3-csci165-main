import java.util.Scanner;
import java.lang.Math;




public class Primitives{


    public static void main(String[] args){

        // Question #1 initializing java primitives. 
        byte b = 10;
        short s = 32767;
        int a = 12345678;
        long l = 9223372036854775807L;
        double d = 5.5;
        float f = 5.5f;
        char c = 'a';
       
        
        // printing each value
        System.out.println("Printing Primitive Values" + "\n");
        System.out.printf ("This is a Byte %d", b,"/n");
        System.out.println();
        System.out.printf ("This is a Short %d", s, "/n");
        System.out.println();
        System.out.printf ("This is an Int %d", a, "/n");
        System.out.println();
        System.out.printf ("This is a Long %d", l, "/n");
        System.out.println();
        System.out.printf ("This is a Double %.2f", d, "/n");
        System.out.println();
        System.out.printf ("This is a Float %.2f", f, "n");
        System.out.println();
        System.out.printf ("This is a Char %c", c, "/n/n/n" );
        System.out.println();
        // Demonstrating character and numeric values of chars using ascii
        for(int i = 0 ; i <= 127;i++){
            System.out.printf("%d : %c \n", i, i); // Printing ascii characters and their corresponding chars
        }

        // narrowing casting
        byte bt = (byte)a;
        System.out.println("Narrow casting example: integer = " + a);
        System.out.println("Narrow casted int: " + bt);
        double castDouble = a;
        System.out.println("Widening casting example: integer = " + a);
        System.out.println("Widening casted: " + castDouble + "\n");


        // Question #2
        double val; // initializing value - must be type double in order to use math.pow
        Scanner input = new Scanner(System.in); // initializing scanner for input
        System.out.print("Enter an integer: ");
        val = input.nextDouble(); 
        System.out.println("The square of " + val + " is: " + Math.pow(val,2)); // returns square
        System.out.println("The cube of " + val + " is: " + Math.pow(val,3)); // returns cube
        System.out.println("The fourth of " + val + " is: " + Math.pow(val,4) + "\n"); // returns fourth

        // Question #3.1
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("The maximum value of an integer is " + max);
        System.out.println("The minimum value of an integer is " + min);

        // Question #3.2 compare | compareUnsigned
        int x = 55;
        int y = 55;
        int z = 110;
        int j = 150;
        int k = -8;

        System.out.println("Output: " + Integer.compareUnsigned(x, y)); // Output is zero since x == y
        System.out.println("Output: " + Integer.compareUnsigned(x,z)); // Output is less than zero since x < z
        System.out.println("output: " + Integer.compare(j,z)); //Output will be greater than zero since j > z

        // Question #5
        System.out.println("Enter an integer dividend: ");
        int dividend = input.nextInt();
        System.out.println("Enter an integer divisor: ");
        int divisor = input.nextInt();
        // Operations
        int floorDiv = (dividend / divisor);
        int floorDiv2 = Math.floorDiv(dividend,divisor);
        int modDiv = (dividend % divisor);
        int modDiv2 = Math.floorMod(dividend,divisor);

        scanner.close();
        // System.out.printf("Floor division using the '/' operator: %d ", floorDiv);
        // System.out.println();
        // System.out.printf("Floor division using floorDiv(): %d ", floorDiv2);
        // System.out.println();
        // System.out.printf("Mod division using the '%' operator: %f ", modDiv);
        // System.out.printf("Mod division using modDiv() %f ", modDiv2);

        
        
        
        


    }
}