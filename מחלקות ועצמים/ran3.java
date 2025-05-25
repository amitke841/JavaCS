import java.util.*;
public class ran3 {
    public static Scanner reader = new Scanner(System.in);
    public static void trivia() {
        System.out.println("Enter Char: ");
        char digit = reader.next().charAt(0);
        int sum = 0, wrong = 0, right = 0,prev = 500;
        while (digit != 'q' && wrong < 3) {
            if (digit == 'r') {
                if (right < 3) {
                    sum += 100;
                    right++;
                } else if (right < 5) {
                    sum += 500;
                    right++;
                } else {
                    if (prev*2 <= 10000) {
                        prev = prev*2;
                    }
                    sum += prev;
                }
            } else {
                wrong++;
            }
            System.out.println("Enter Char: ");
            digit = reader.next().charAt(0);
        }
        if (wrong == 3) {
            System.out.println("Lose");
        } else {
            System.out.println("The user won: " + sum + "ils");
        }
    }
}