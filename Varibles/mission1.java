package Varibles;
import java.util.*;

public class mission1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        System.out.println("Number bigger in 5: " + (num + 5));
        System.out.println("Number Smaller in 19: " + (num - 19));
        System.out.println("Number Multiplied by 7: " + (num * 7));
        System.out.println("Number Smaller by 1/2: " + (num / 0.5));
        sc.close();
    }
}
