package DoubleL;
import java.util.*;

public class M1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter months");
        int month = reader.nextInt();

        double years = month / 12;
        int days = month * 30;

        System.out.println("Years: " + years);
        System.out.println("Days: " + days);
    }
}
