package HWifelse;
import java.util.*;

public class t3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age in years:");
        int age = sc.nextInt();
        System.out.println("Enter Toahr(First or Second):");
        String toahr = sc.next();
        System.out.println("Enter Experience in years:");
        int exp = sc.nextInt();

        if (age >= 25 && toahr.equals("First") && exp >= 5) {
            System.out.println("You are accepted to Factory A!");
        } else if (toahr.equals("Second") && exp >= 2) {
            System.out.println("You are accepted to Factory B!");
        } else if (toahr.equals("First") && exp >= 5) {
            System.out.println("You are accepted to Factory B!");
        } else {
            System.out.println("You are not accepted to any factory!");
        }
    }
}
