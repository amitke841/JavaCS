package Rational;
import java.util.Scanner;

public class RationalPlusMinus {
    public Scanner reader = new Scanner(System.in);
    //ט.כניסה: הפעולה מקבלת שני מספרים רציונליים
    //ט.יציאה: הפעולה מחזירה מספר רציונלי חדש שהוא סכום המספרים הרציונליים
    public static Rational sum(Rational r1, Rational r2) {
        Rational sum = new Rational(r1.getX() * r2.getY() + r2.getX() * r1.getY(), r1.getY() * r2.getY());
        return sum;
    }

    //ט.כניסה: הפעולה מקבלת שני מספרים רציונליים
    //ט.יציאה: הפעולה מחזירה מספר רציונלי חדש שהוא חיסור המספרים הרציונליים
    public static Rational minus(Rational r1, Rational r2) {
        Rational minus = new Rational(r1.getX() * r2.getY() - r2.getX() * r1.getY(), r1.getY() * r2.getY());
        return minus;
    }

    //בדיקת הפעולות חיבור וחיסור
    public static void main(String[] args) {
        Rational r1 = new Rational(2, 3);
        Rational r2 = new Rational(4, 5);
        System.out.println("Rational 1: " + r1.toString());
        System.out.println("Rational 2: " + r2.toString());
        Rational sum = sum(r1, r2);
        System.out.println("Sum: " + sum.toString());
        Rational minus = minus(r1, r2);
        System.out.println("Minus: " + minus.toString());
    }
    
}
