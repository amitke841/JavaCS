import java.util.Scanner;
public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter Third number: ");
        int num3 = sc.nextInt();
        
        if (num1 >= num2) {
            if (num2>= num3) {
                System.out.println("The middle number is: " + num2);
            } else if (num1 >= num3) {
                System.out.println("The middle number is: " + num3);
            } else {
                System.out.println("The middle number is: " + num1);
            }
        }
    }
}
