package Homework4;
import java.util.*;

public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how much the trip cost in dollars: ");
        double cost = sc.nextDouble();
        System.out.print("Enter the gate of dollar currently: ");
        double gate = sc.nextDouble();

        double total = cost + 400 * gate;
        System.out.println("The total cost of the trip is " + total + " shekel.");
        sc.close();
    }    
}
