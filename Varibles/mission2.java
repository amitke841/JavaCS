package Varibles;
import java.util.*;

public class mission2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one number");
        int num1 = sc.nextInt();
        System.out.println("Enter another number");
        int num2 = sc.nextInt();
        System.out.println("Sum of the numbers: " + (num1 + num2));
        System.out.println("Hefresh of the numbers: " + (num1 - num2));
        System.out.println("Kefel of the numbers: " + (num1 * num2));
        System.out.println("Hiluk of the numbers: " + (num1 / num2));
        sc.close();
    }
    
}
