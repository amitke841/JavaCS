package Varibles;
import java.util.Scanner;

public class mission4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Yard: ");
        int length = sc.nextInt();
        System.out.println("Enter Width of Yard: ");
        int width = sc.nextInt();
        System.out.println("The Area of the Yard is: " + (length * width) + "Sq. M.");
        length = length - 1;
        width = width - 1;
        System.out.println("The Area of the Yard for Grass is: " + (length * width) + "Sq. M.");
        sc.close();
    }
}
