package arrCounter;
import java.util.Scanner;

public class t3 {
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
        // ט.יציאה: הפעולה קולטת לתוכו כמה פעמים הופיע כל מספר בטווח 1-10
        int temp;
        for (int i = 1; i <= 10; i++) {
            System.out.println("enter num: ");
            temp = reader.nextInt();
            for (int k = 1; k < arr.length; k++) {
                if (temp == k) {
                    arr[k] ++;
                }
            }
        }
    }
    public static void printArr(int[] arr) {
        // ט.כניסה: הפעולה מקבלת מערך
        // ט.יציאה: הפעולה מדפיסה כמה פעמים הופיע כל מספר בטווח 1-10
        for (int i = 1; i < arr.length; i++) {
            System.out.println("the num: " + i + " appears - " + arr[i] + " times.");
        }
    }
    public static void main(String[] args) {
        int[] numCounter = new int[11];
        ipusArr(numCounter);
        inputArr(numCounter);
        printArr(numCounter);
    }
}
