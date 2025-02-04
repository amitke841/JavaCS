package noReturnActivity;
import java.util.*;
public class t1 {
    public static Scanner reader = new Scanner(System.in);
    public static void printBetween(int num1, int num2) {
        //ט.כניסה: הפעולה מקבלת 2 מספרים בטווח 1-100
        //ט.יציאה: הפעולה מדפיסה את כל המספרים בטווח בין 2 המספרים
        int max,min;
        min = Math.min(num1,num2);
        max = Math.max(num1,num2);
        for(int i = min; i<=max; i++) {
            System.out.println(i + " ");
        }
    }
    public static void main(String[] args) {
        int n1,n2;
        for (int i = 1; i<= 20; i++) {
            n1 = (int)(Math.random()*100-1+1)+1;
            n2 = (int)(Math.random()*100-1+1)+1;
            printBetween(n1,n2);
        }
    }
}
