package HomeworkDouble;
import java.util.*;

public class Excersice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter monthly money: ");
        double money = sc.nextDouble();
        money = money - (double)((money/100)*15);
        money = (double)(money/3)*2;
        money = (double)(money/30);
        System.out.println("The daily money is: " + money);
        sc.close();
    }
}
