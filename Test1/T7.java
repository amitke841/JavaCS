import java.util.*;

public class T7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Days: ");
        int days = sc.nextInt();
        
        int weeks = days/7;
        int dayleft = days%7;
        double water = (double)days * 3.8;

        System.out.println("The number of weeks is: " + weeks + ", and days left: " + dayleft);
        System.out.println("The number of liters needed is: " + water);
        sc.close();
    }
}
