package Varibles;

import java.util.*;

public class degrees {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Press 0 if you want to convert from Celsius to Fahrenheit, Press 1 if you want to convert from Fahrenheit to Celsius");
        int choice = reader.nextInt();
        if (choice == 0) {
            System.out.println("Enter the temperature in Celsius");
            double celsius = reader.nextDouble();
            double fahrenheit = (celsius * 9.0 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + fahrenheit);           

        } else if (choice == 1) {
            System.out.println("Enter the temperature in Fahrenheit");
            double fahrenheit = reader.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9.0;
            System.out.println("The temperature in Celsius is " + celsius);

        } else {
            System.out.println("Invalid choice");
        }
        reader.close();
    }
}
