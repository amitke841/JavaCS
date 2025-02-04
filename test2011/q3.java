package test2011;
import java.util.*;

public class q3 {
    public static Scanner reader = new Scanner(System.in);
    public static int length(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num/=10;
        }
        return count;
    }
    public static int cancel(int num, int place) {
        int newNum = num;
        for (int i = 1; i<=place; i++) {
            newNum = newNum/10;
        }
        newNum = newNum*(int)Math.pow(10, place-1);
        
        for (int i = 0; i<=place - 2; i++) {
            num = num/(int)Math.pow(10,i);
            newNum += num%10*(int)Math.pow(10,i);
        }
        return newNum;
    }
    public static void main(String[] args) {
        System.out.println(cancel(4256152,3));
    }
}
