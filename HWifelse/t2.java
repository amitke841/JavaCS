package HWifelse;
import java.util.*;
public class t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M for male and F for female:");
        char mf = sc.next().charAt(0);
        System.out.print("Enter your age(12 - 30):");
        int age = sc.nextInt();
        System.out.print("Enter your height(CM):");
        int height = sc.nextInt();
        if (mf == 'M' && age >= 17 && age <= 19 && height >= 175) {
            System.out.println("You are accepted");
        } else {
            System.out.println("You are not accepted");
        }

    }
}
