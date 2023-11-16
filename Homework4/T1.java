package Homework4;
import java.util.*;

public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Pkakim of 10 you have: ");
        int pkakim10 = sc.nextInt();
        System.out.print("Enter how many Pkakim of 100 you have: ");
        int pkakim100 = sc.nextInt();
        System.out.print("Enter how many Pkakim of 1000 you have: ");
        int pkakim1000 = sc.nextInt();

        pkakim10 = pkakim10 * 10;
        pkakim100 = pkakim100 * 100;
        pkakim1000 = pkakim1000 * 1000;

        int total = pkakim10 + pkakim100 + pkakim1000;
        System.out.println("You have " + total + " Points");
        sc.close();
    }
}
