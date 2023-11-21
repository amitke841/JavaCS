import java.util.Scanner;

public class QuadEq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter A:");
        a = sc.nextInt();
        System.out.println("Enter B:");
        b = sc.nextInt();
        System.out.println("Enter C:");
        c = sc.nextInt();

        System.out.println("The Quadratic Equation is: " + a + "x^2 + " + b + "x + " + c);

        double uppart1 = -b + Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double x1 = uppart1 / (2 * a);
        double uppart2 = -b - Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double x2 = uppart2 / (2 * a);
        System.out.println("X1 is: " + x1);
        System.out.println("X2 is: " + x2);
    }
}