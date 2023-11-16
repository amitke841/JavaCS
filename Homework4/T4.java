package Homework4;
import java.util.*;

public class T4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many years you live: ");
        double years = sc.nextDouble();
        double months = years * 12;
        double days = years * 365;
        double hours = days * 24;
        double seconds = hours * 3600;
        System.out.println("You live " + months + " months");
        System.out.println("You live " + days + " days");
        System.out.println("You live " + hours + " hours");
        System.out.println("You live " + seconds + " seconds");
        sc.close();
    }
}
