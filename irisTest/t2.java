package irisTest;
import java.util.*;

public class t2 {
    public static Scanner reader = new Scanner(System.in);
    public static boolean isSeqArr(int[] arr) {
        int min = arr[0];
        for (int i = 1; i<arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        } 
        boolean seqArr = false;
        for (int k = 0; k < arr.length-1; k++){
            seqArr = false;
            for (int i = arr.length-1; i>0; i--) {
                if (min+1 == arr[i]) {
                    seqArr = true;
                    min++;
                }
            }
            if (seqArr == false) 
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = reader.nextInt();
        }
        System.out.println(isSeqArr(nums));
    }
}
