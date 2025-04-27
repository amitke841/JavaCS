package Movie;
import java.util.*;

//מימוש הטיפוס סרט
public class Movie {

    public static Scanner reader = new Scanner(System.in);

    private String name;
    private int minutes;
    private String language;
    private int prizes;

    /*פעולות בונות */
    //ט.כניסה: הפעולה מקבלת שם, דקות, שפה וכמות פרסים
    //ט.יציאה: הפעולה בונה ומחזירה עצם סרט לפי הערכים שהתקבלו
    public Movie(String name, int minutes, String language, int prizes) {
        this.name = name;
        this.minutes = minutes;
        this.language = language;
        this.prizes = prizes;
    }

    // ט.יציאה: הפעולה בונה ומחזירה עצם סרט לפי קלט
    public Movie() {
        System.out.println("Enter name: ");
        this.name = reader.nextLine();
        System.out.println("Enter length in Minutes: ");
        this.minutes = reader.nextInt();
        System.out.println("Enter movie language: ");
        this.language = reader.nextLine();
        System.out.println("Enter count of prizes: ");
        this.prizes = reader.nextInt();
    }

    /*פעולות מאחזרות */
    //ט.יציאה: הפעולה מחזירה את שם הסרט
    public String getName() {
        return this.name;
    }

    //ט.יציאה: הפעולה מחזירה את משך הסרט בדקות
    public int getMinutes() {
        return this.minutes;
    }

    //ט.יציאה: הפעולה מחזירה את שפת הסרט
    public String getLanguage() {
        return this.language;
    }

    //ט.יציאה: הפעולה מחזירה את כמות הפרסים של הסרט
    public int getPrizes() {
        return this.prizes;
    }

    /*פעולות קובעות */
    //ט.כניסה: הפעולה מקבלת שם סרט
    //ט.יציאה: הפעולה קובעת את שם הסרט לשם שהתקבל
    public void setName(String name) {
        this.name = name;
    }

    //ט.כניסה: הפעולה מקבלת משך סרט בדקות
    //ט.יציאה: הפעולה קובעת את משך הסרט לזמן שהתקבל
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    //ט.כניסה: הפעולה מקבלת שפת סרט
    //ט.יציאה: הפעולה קובעת את שפת הסרט לשפה שהתקבלה
    public void setLanguage(String language) {
        this.language = language;
    }

    //ט.כניסה: הפעולה מקבלת כמות פרסים
    //ט.יציאה: הפעולה קובעת את כמות הפרסים של הסרט לכמות שהתקבלה
    public void setPrizes(int prizes) {
        this.prizes = prizes;
    }

    /*פעולות חישוביות */
    //ט.יציאה: הפעולה מחזירה מחרוזת המתארת את הסרט
    public String toString() {
        return "name: " + this.name + "minutes: " + this.minutes + "language: " + this.language + "prizes: " + this.prizes;
    }

    //ט.כניסה: הפעולה מקבלת סרט
    //ט.יציאה: הפעולה מחזירה נכון אם 2 הסרטים באותו אורך, אחרת מחזירה לא נכון
    public boolean isTheSameLength(Movie m) {
        if (this.minutes == m.minutes) {
            return true;
        }
        return false;
    }
}
