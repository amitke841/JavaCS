package Car;
import java.util.*;

public class Car {
    public static Scanner reader = new Scanner(System.in);

    private double price;
    private int seats;
    private boolean isElectric;
    private int[] kmMonthly = new int[13]; // לא אשתמש בתא 0

    /*פעולות בונות */
    //ט.יציאה: הפעולה בונה ומחזירה עצם מסוג רכב ע"פ הערכים שהתקבלו
    public Car(double price, int seats, boolean isElectric, int[] kmMonthly) {
        this.price = price;
        this.seats = seats;
        this.isElectric = isElectric;
        this.kmMonthly = kmMonthly;
    }

    //ט.יציאה: הפעולה בונה ומחזירה עצם מסוג רכב ע"פ קלט 
    public Car() {
        System.out.println("הקלד מחיר");
        this.price = reader.nextDouble();
        System.out.println("הקלד מספר מקומות");
        this.seats = reader.nextInt();
        System.out.println("האם רכב חשמלי? (true/false)");
        this.isElectric = reader.nextBoolean();
        System.out.println("הקלד קילומטרים לחודש (12 חודשים):");
        for (int i = 1; i < this.kmMonthly.length; i++) {
            System.out.print("חודש " + (i) + ": ");
            this.kmMonthly[i] = reader.nextInt();
        }
    }

    /*פעולות מאחזרות */
    //ט.יציאה: הפעולה מחזירה את מחיר הרכב
    public double getPrice() {
        return price;
    }

    //ט.יציאה: הפעולה מחזירה את מספר המקומות ברכב
    public int getSeats() {
        return seats;
    }

    //ט.יציאה: הפעולה מחזירה האם הרכב חשמלי או לא
    public boolean getIsElectric() {
        return isElectric;
    }

    //ט.יציאה: הפעולה מחזירה את הקילומטרים החודשיים של הרכב
    public int[] getKmMonthly() {
        return kmMonthly;
    }

    //ט.יציאה: הפעולה מחזירה את הקילומטרים החודשיים של הרכב לחודש מסוים
    public int getSpecificMonthKm(int month) {
        return kmMonthly[month];
    }

    /*פעולות קובעות */
    //ט.כניסה: הפעולה מקבלת מחיר
    //ט.יציאה: הפעולה קובעת את מחיר הרכב למחיר שהתקבל
    public void setPrice(double price) {
        this.price = price;
    }

    //ט.כניסה: הפעולה מקבלת מספר מקומות
    //ט.יציאה: הפעולה קובעת את מספר המקומות ברכב למספר המקומות שהתקבל
    public void setSeats(int seats) {
        this.seats = seats;
    }

    //ט.כניסה: הפעולה מקבלת האם הרכב חשמלי או לא
    //ט.יציאה: הפעולה קובעת האם הרכב חשמלי או לא
    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    //ט.כניסה: הפעולה מקבלת קילומטרים לחודש
    //ט.יציאה: הפעולה קובעת את הקילומטרים החודשיים של הרכב לקילומטרים שהתקבלו
    public void setKmMonthly(int[] kmMonthly) {
        this.kmMonthly = kmMonthly;
    }

    //ט.כניסה: הפעולה מקבלת חודש מסויים ומספר קילומטר לאותו חודש
    //ט.יציאה: הפעולה קובעת את הקילומטרים החודשיים של הרכב לחודש שהתקבל לקילומטרים שהתקבלו
    public void setSpecificMonthKm(int month, int km) {
        this.kmMonthly[month] = km;
    }

    /*פעולות חישוביות */
    //ט.יציאה: הפעולה מחזירה מחרוזת המתארת את הרכב
    public String toString() {
        String str = "מחיר: " + price + "מספר מקומות: " + seats + "רכב חשמלי: " + isElectric + ":קילומטרים לחודש" + "\n";
        for (int i = 1; i < this.kmMonthly.length; i++) {
            str += "חודש: " + i + ": " + kmMonthly[i];
        }
        return str;
    }

    //ט.כניסה: הפעולה מקבלת עצם רכב
    //ט.יציאה: הפעולה מחזירה את המחיר הזול יותר מבין שני הרכבים
    public double chepest(Car c1) {
    if (this.price < c1.getPrice()) {
            return this.price;
        } else {
            return c1.getPrice();
        }
    }

    //ט.יציאה: הפעולה מחזירה את מספר הקילומטרים הכולל של הרכב לשנה
    public int total() {
        int total = 0;
        for (int i = 1; i < this.kmMonthly.length; i++) {
            total += kmMonthly[i];
        }
        return total;
    }
}
