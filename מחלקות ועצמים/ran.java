public class ran {

    public static boolean isSumsArray(int[] arr) {
        int k = 0;
        boolean newK = true;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (newK) {
                k = arr[i];
                currentSum = 0;
                newK = false;
            } else {
                currentSum += arr[i];
                if (currentSum>k) {
                    return false;
                }
                if (currentSum == k) {
                    newK = true;
                }
            }
        }
        if (currentSum < k) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {20, 15, 5, 36, 15, 15, 6};
        System.out.println(isSumsArray(array));
    }
}
