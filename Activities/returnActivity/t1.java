package returnActivity;
import java.util.*;
public class t1 {
    public static Scanner reader = new Scanner(System.in);
    public static int appearDigit(int num,int digit) {
        // ט.כניסה: מספר טבעי וסיפרה
        // ט.יציאה: מספר ההופעות של הסיפרה במספר
        int d,count = 0;
        while (num!=0) {
            d = num%10;
            if (digit == d) {
                count++;
            }
            num = num/10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("הקלד מספר:");
        int num = reader.nextInt();
        for (int i = 0; i<=9; i++) {
            System.out.println("הספרה: " + i + " מופיעה: " + appearDigit(num, i) + " פעמים.");
        }
    }
}
