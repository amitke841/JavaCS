package HomeworkDouble;
import java.util.*;

public class Excersice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Weight of Rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter Height of Rectangle: ");
        double height = sc.nextDouble();
        double rec1 = length * height;
        System.out.println("The current area of the rectangle is: " + rec1);
        length = length *2;
        height = height -1;
        double rec2 = length * height;
        System.out.println("The new area of the rectangle is: " + rec2);
        double recSum = rec2 - rec1;
        System.out.println("The difference between the two areas is: " + recSum);
        sc.close();
    }
}
