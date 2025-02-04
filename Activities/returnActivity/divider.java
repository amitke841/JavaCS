package returnActivity;
import java.util.*;
public class divider {
    public static Scanner reader = new Scanner(System.in);
    //ט.כניסה: הפעולה מקבלת 2 מספרים שלמים חיוביים
    //ט.יציאה: המחלק המשותף המינמלי
    public static int divider(int n1, int n2) {
        int small,big;
        small = Math.min(n1,n2);
        for (int i = 2;i<=small; i++) {
            if (n1%i==0 && n2%i ==0) {
                return i;
            }
        }
        return -1;
    }
}
