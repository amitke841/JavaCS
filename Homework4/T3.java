package Homework4;
import java.util.*;

public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day tariff: ");
        double dayTariff = sc.nextDouble();
        System.out.print("Enter how many hours you worked on day tariff: ");
        double dayHours = sc.nextDouble();
        System.out.print("Enter how many hours you worked on night tariff: ");
        double nightHours = sc.nextDouble();
        System.out.print("Enter how many hours you worked on shabat tariff: ");
        double shabatHours = sc.nextDouble();
        double nighttariff = dayTariff *1.5;
        double shabatariff = dayTariff *2;
        dayTariff = dayTariff * dayHours;
        nighttariff = nighttariff * nightHours;
        shabatariff = shabatariff * shabatHours;
        
        double total = dayTariff + nighttariff + shabatariff;

        System.out.println("Day tariff: " + dayTariff);
        System.out.println("Night tariff: " + nighttariff);
        System.out.println("Shabat tariff: " + shabatariff);
        System.out.println("The total salary is: " + total);
        sc.close();
    }
}
