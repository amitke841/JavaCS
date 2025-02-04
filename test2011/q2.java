package test2011;
import java.util.*;
public class q2 {
    public static Scanner reader = new Scanner(System.in);
    public static void fibo(int n) {
        int n1 = 0,n2 = 1, temp;
        if (n == 1) {
            System.out.print(0);
        }else if (n>1) {
            System.out.print(0 + " " + 1);
            for (int i = 3; i <= n; i++) {
                temp = n2;
                n2 = n1+n2;
                n1 = temp;
                System.out.print(" " + n2);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        for(int i = 1; i<=20; i++) {
            System.out.println("Enter fibo length: ");
            fibo(reader.nextInt());
        }
    }
}