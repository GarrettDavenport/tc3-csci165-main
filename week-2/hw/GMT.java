import java.util.Scanner;

public class GMT{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input the time zone offset to GMT: "); // Ask for offset of GMT
        int offset = input.nextInt();
        long totalMilli = System.currentTimeMillis();
        long totalSecs = totalMilli / 1000; // Total seconds
        long currentSec = totalSecs % 60;  // Compute current second in the min in the hour
        long totalMins = totalSecs / 60; // Total mins
        long currentMin = totalMins % 60; // Current minute in the hour
        long totalHours = totalMins / 60; // Total hours
        long currentHour = ((totalHours + offset) % 24);

        System.out.println("The current time is " + currentHour + ":" + currentMin + ":" + currentSec);
        scanner.close();
        
    }// end of main
}// end of class