package arrAct;
import java.util.*;

public class t26 {
    public static Scanner reader = new Scanner(System.in);
    public static void bonus10(double[] g) {
        for (int i = 0; i < g.length; i++) {
            g[i] = g[i]*1.1;
            if (g[i] > 100.0) {
                g[i] = 100;
            }
        }
    }
    public static double[] inputGrades(int stu) {
        double[] g = new double[stu];
        System.out.println("enter grades:");
        for (int i = 0; i < g.length; i++) {
            g[i] = reader.nextInt();
        }
        return g;
    }
    public static void outputGrades(double[] g) {
        System.out.println();
        for (int i = 0; i < g.length; i++) {
            System.out.print(g[i] + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("enter num of students: ");
        int students = reader.nextInt();
        double[] grades = inputGrades(students);
        bonus10(grades);
        outputGrades(grades);
    }
}
