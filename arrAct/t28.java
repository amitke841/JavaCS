package arrAct;
import java.util.*;

public class t28 {
    public static Scanner reader = new Scanner(System.in);
    public static int longStreak(int[] nums) {
        int prev = nums[0];
        int count = 1;
        int countMax = 0;
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] == prev) {
                count++;
                if (count > countMax) {
                    countMax = count;
                }
            } else {
                countMax = Math.max(countMax, count);
                count = 1;
            }
            prev = nums[i];
        }
        return countMax;
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("enter nums:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reader.nextInt();
        }
        System.out.println("the longest nums streak: " + longStreak(arr));
    }
}
