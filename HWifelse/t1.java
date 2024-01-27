package HWifelse;
import java.util.*;
public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Tav Between A - ~ :");
        char tav = sc.next().charAt(0);
        if (tav >= '0' && tav <= '9') {
            System.out.println("Number");
        } else if (tav >= 'A' && tav <= 'Z') {
            System.out.println("Upper Case");
        } else if (tav >= 'a' && tav <= 'z') {
            System.out.println("Lower Case");
        } else {
            System.out.println("Other Char");
        }
    }
}
