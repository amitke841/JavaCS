public class check {
    public static void shiftRight(int[] arr, int n) {
        int len = arr.length;
        n = n % len;
        if (n == 0) return;
    
        int[] temp = new int[len];
    
        for (int i = 0; i < len; i++) {
            temp[(i + n) % len] = arr[i];
        }
    
        // העתק חזרה
        for (int i = 0; i < len; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] bdik = {1,2,3,4,5};
        shiftRight(bdik, 2);
        for (int i = 0; i < bdik.length; i++) {
            System.out.print(bdik[i] + " ");
        }
    }
}

public static void shiftLeft(int[] arr, int n) {
    int len = arr.length;
    n = n % len;
    if (n == 0) return;

    int[] temp = new int[len];

    for (int i = 0; i < len; i++) {
        temp[i] = arr[(i + n) % len];
    }

    // העתק חזרה
    for (int i = 0; i < len; i++) {
        arr[i] = temp[i];
    }
}




