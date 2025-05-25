public class b2 {
    public static boolean getPass(int[] arr, int password) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == password) {
                return false;
            }
        }

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = password;
        return true;
    }
}
