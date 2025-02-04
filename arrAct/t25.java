package arrAct;
import java.util.*;

public class t25 {
    public static Scanner reader = new Scanner(System.in);
    public static void evenPrint(int[] nums,int n) {
        System.out.println();
        if (n%2 == 0) {
            for (int i = 0; i < nums.length; i = i+2) {
                System.out.print(nums[i]+ ", ");
            }
        } else {
            for (int i = 1; i < nums.length; i = i+2) {
                System.out.print(nums[i]+ ", ");
            }
        }
    }
    public static void main(String[] args) {
        int[] numbers = new int[30];
        System.out.println("Enter nums:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = reader.nextInt();
        }
        int special = (int)(Math.random()*(10-1+1))+1;
        evenPrint(numbers, special);
        evenPrint(numbers, special+1);
    }
}
