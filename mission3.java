import java.util.*;

public class mission3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number A");
        int a = sc.nextInt();
        System.out.println("Enter Number C");
        int c = sc.nextInt();
        System.out.println("Enter solve of 4AC-7 is: " + (4 * a * c - 7));
        sc.close();
    }
}
