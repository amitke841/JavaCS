public class b6 {
    public static int deepSum(int num1) {
        while (num1 > 9) {
            num1 = digitSum(num1);
        }
        return num1;
    }

    public static boolean isCorrect() {
        int oddCount = 0;
        int evenCount = 0;
        int num;
        for (int i = 1; i <= 999999; i++) {
            num = deepSum(i);
            if (num%2==0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        if (evenCount>oddCount) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean inBoth(int num1, int num2) {
        if (digitExits(num1, deepSum(num2)) && digitExits(num2, deepSum(num1))) {
            return true;
        } else {
            return false;
        }
    }
}
