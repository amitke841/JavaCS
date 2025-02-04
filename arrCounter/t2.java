package arrCounter;
import java.util.*;

public class t2 {
    public static Scanner reader = new Scanner(System.in);
    public static void ipusArr(int[] arr) {
        //ט.כניסה: הפעולה מקבלת מערך
        //ט.יציאה: הפעולה מאפסת אותו
        for (int i = 1; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
    public static void inputArr(int[] arr) {
        // ט.כניסה: הפעולה מקבלת מערך
        // ט.יציאה: הפעולה קולטת לתוכו מיצים מועדפים של בני נוער שונים
        int temp;
        for (int i = 1; i <= 3; i++) {
            for (int k = 1; k < arr.length; k++) {
                System.out.println("do you like juice num " + k + "?(1/0)");
                temp = reader.nextInt();
                if (temp == 1) {
                    arr[k]++;
                }
            }
        }
    }
    public static int calcFavJuice(int[] arr) {
        // ט.כניסה: הפעולה מקבלת מערך
        // ט.יציאה: הפעולה מחזירה את המיץ המועדף ביותר
        int favJuiceCount = arr[1];
        int favJuice = 1;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > favJuiceCount) {
                favJuice = i;
            }
        }
        return favJuice;
    }
    public static void main(String[] args) {
        int[] favJuiceCounter = new int[4]; // לא אשתמש ב0.
        ipusArr(favJuiceCounter);
        inputArr(favJuiceCounter);
        System.out.println("the favorite day is: " + calcFavJuice(favJuiceCounter));
    }
}
