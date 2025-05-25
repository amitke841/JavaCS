public class b3 {
    public static void shuffle(int[] arr) {
        int n1,n2,temp;
        for(int i = 0; i <= 30; i++) {
            n1 = (int)(Math.random()*(30-0+1));
            n2 = (int)(Math.random()*(30-0+1));
            while (n1 == n2) {
                n1 = (int)(Math.random()*(30-0+1));
                n2 = (int)(Math.random()*(30-0+1));
            }
            temp = arr[n2];
            arr[n2] = arr[n1];
            arr[n1] = temp;
        }
    }
}
