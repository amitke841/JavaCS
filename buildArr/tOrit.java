package buildArr;
import java.util.*;
public class tOrit {
    static Scanner reader = new Scanner(System.in);
    
    //ט.כניסה: הפעולה מקבלת מערך ריק
    //ט.יציאה: הפעולה קולטת לתוכו מספרים ממשיים
    public static void inputArr(double[] arr) {
        System.out.println("Enter double numbers");
        for(int i = 0; i <arr.length; i++)
            arr[i] = reader.nextDouble();
    }

    //ט.כניסה: הפעולה מקבלת מערך מספרים ממשיים
    //הפעולה מצופפת את כל המספרים החיוביים ימינה ובמקום השלילים שמה 0 
    public static void updateArr(double[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > 0)
            {
                arr[k] = arr[i];
                k++;
            }
        }
        for (int i = k; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void printArr(double[] arr) {
        System.out.println("The Arr:");
        for(int i =0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        double[] nums = new double[10];
        inputArr(nums);
        updateArr(nums);
        printArr(nums);
    }
}


