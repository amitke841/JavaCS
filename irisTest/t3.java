package irisTest;
import java.util.*;

public class t3 {
    public static Scanner reader = new Scanner(System.in);
    public static void inputGrades(int[] arr) {
        System.out.println("Enter Grades");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reader.nextInt();
        }
    }

    public static double avgGrades(int[] arr) {
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }
        avg = avg/arr.length;
        return avg;
    }

    public static int inputSeccessLandCount(int[] arr, int k) {
        int count = 0;
        System.out.println("Enter 1 for seccess, 0 otherwise");
        int seccess = reader.nextInt();
        while (seccess != -999) {
            if (seccess == 1) {
                count++;
            }
            System.out.println("Enter 1 for seccess, 0 otherwise");
            seccess = reader.nextInt();
        }
        arr[k] = count;
        return count;
    }

    public static void printLessThenAvgSeccess(int[] arr, double avg) {
        System.out.println();
        for (int i = 0; i < 50; i++) {
            if (arr[i] < avg) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void main(String[] args) {
        int countAllowed = 0;
        double countLandsAvg = 0;
        int[] grades = new int[15];
        int[] seccessLands = new int[50];
        for(int i = 0; i < 50; i++) {
            inputGrades(grades);
            double avgGrades = avgGrades(grades);
            int seccessLandCount = inputSeccessLandCount(seccessLands, i);
            countLandsAvg += seccessLandCount;
            if (avgGrades > 95 && seccessLandCount > 3) {
                countAllowed++;
            }
        }
        countLandsAvg = countLandsAvg/50;
        
        System.out.println("Solo Allowed: " + countAllowed);
        printLessThenAvgSeccess(seccessLands, countLandsAvg);
    }
}
