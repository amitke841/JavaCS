package noReturnActivity;
import java.util.*;
public class t2 {
    public static Scanner reader = new Scanner(System.in);
    public static void biggestDigit(int num) {
        int d,bigD;
        bigD = num%10;
        num/=10;
        while (num != 0) {
            d = num%10%10;
            bigD = Math.max(d, bigD);
            num/=10;
        }
        System.out.println(bigD);
    }
    public static void main(String[] args) {
        System.out.println("enter num");
        int num = reader.nextInt();
        while (num != 999) {
            biggestDigit(num);
            System.out.println("enter num");
            num = reader.nextInt();
        }
    }
}
