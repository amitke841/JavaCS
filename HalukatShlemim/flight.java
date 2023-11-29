package HalukatShlemim;
import java.util.Scanner;


public class flight {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Tel Aviv to Paris flight time in minutes: ");
        int flightTtoP = sc.nextInt();
        System.out.println("Enter Paris to New York flight time in minutes: ");
        int flightPtoN = sc.nextInt();
        
        //12 hours is 1820 minutes
        int flightTotal = flightTtoP + flightPtoN + 1820;
        int flightDays = flightTotal / 1440;
        int flightHours = (flightTotal % 1440) / 60;
        int flightMinutes = (flightTotal % 1440) % 60;

        System.out.println("The total flight time is " + flightDays + " days, " + flightHours + " hours, and " + flightMinutes + " minutes.");
        sc.close();
    }
}
