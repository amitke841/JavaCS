package HomeworkDouble;
import java.util.*;

public class truncfruc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Double number: ");
        double num = sc.nextDouble();
        int trunc = (int) num;
        double fruc = num - trunc;
        System.out.println("The number without the fractional part is: " + trunc + " The Fractional part is: " + fruc);
        sc.close();
    }
}
