package arrAct;
import java.util.*;

public class t27 {
    public static Scanner reader = new Scanner(System.in);
    //ט.כניסה: מקבלת מספר
    //ט.יציאה: המספר השמאלי ביותר
    public static int importent(int num) {
        int d = 0;
        while(num!=0) {
            d = num%10;
            num = num/10;
        }
        return d;
    }
    //ט.כניסה: מקבלת מערך חד ממדי
    //ט.יציאה: מחזירה אם המערך מיוחד או לא
    public static boolean isSpecial(int[] arr) {
        int d = arr[0]%10;
        for (int i = 1; i < arr.length; i++) {
            if (importent(arr[i]) != d) {
                return false;
            }
            d = arr[i]%10;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reader.nextInt();
        }
        System.out.println(isSpecial(arr));
        
    }
}
