import java.util.Scanner;
public class t3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();
        int big, mid, small;

        if (num1>num2) {
            if (num2>num3) {
                big = num1;
                mid = num2;
                small = num3;
            } else { //num3>num2
                if (num1>num3) {
                    big = num1;
                    mid = num3;
                    small = num2;
                } else { //num3>num1
                    big = num3;
                    mid = num1;
                    small = num2;
                }
            }
        } else { //num2>num1
            if (num1>num3) {
                big = num2;
                mid = num1;
                small = num3;
            } else { //num3>num1
                if (num2>num3) {
                    big = num2;
                    mid = num3;
                    small = num1;
                } else { //num3>num2
                    big = num3;
                    mid = num2;
                    small = num1;
                }
            }
        }

        System.out.println("Biggest number is: " + big);
        System.out.println("Middle number is: " + mid);
        System.out.println("Smallest number is: " + small);
    }
}
