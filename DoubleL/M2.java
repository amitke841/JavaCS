package DoubleL;
import java.util.*;

public class M2 {
    public static void main() {
        Scanner reader = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter A number:");
        a = reader.nextInt();
        System.out.println("Enter B number:");
        b = reader.nextInt();
        System.out.println("Enter C number:");
        c = reader.nextInt();
        
        double total = c-b;
        total = total/a;
        System.out.println("X = " + total);
        reader.close();
    }
}
