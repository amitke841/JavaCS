import java.util.*;

public class T6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 digit number without zeros:");
        int num = sc.nextInt();

        int temp = num/10;
        int newNum1 = temp + (num%10)*100;

        int digit1 = 10 - (num%10);
        int digit100 = 10 - (num/100);
        int digit10 = 10 - ((num/10)%10);
        int newNum2 = (digit100*100) + (digit10*10) + digit1;

        System.out.println("The first number is: "+ newNum1);
        System.out.println("The second number is: "+ newNum2);
        sc.close();
    }
}
