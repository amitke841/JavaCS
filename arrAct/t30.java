package arrAct;
import java.util.*;

public class t30 {
    public static Scanner reader = new Scanner(System.in);
    public static boolean halfArr(int[] arr) {
        int count = 1;
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]) {
                count ++;
            } else if(i<=arr.length/2) {
                count = 1;
            } else {
                return false;
            }
            if (count == arr.length/2) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = new int[10];
        System.out.println("enter nums: ");
        for(int i = 0; i <nums.length;i++) {
            nums[i] = reader.nextInt();
        }

        System.out.println(halfArr(nums));
    }
}
