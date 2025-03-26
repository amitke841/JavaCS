package Date;

public class Date {
    private int day;
    private int month;
    private int year;

    //* פעולות בונות *
    //ט.יציאה: הפעולה בונה עצם מסוג תאריך לפי הפרמטרים שהתקבלו
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // * פעולות מאחזרות *
    //ט.יציאה: הפעולה מאחזרת את השנה
    public int getYear() {
        return this.year;
    }

    //ט.יציאה: הפעולה מאחזרת את החודש
    public int getMonth() {
        return this.month;
    }

    //ט.יציאה: הפעולה מאחזרת את היום
    public int getDay() {
        return this.day;
    }

    //* פעולות קובעות *
    //ט.כניסה: הפעולה מקבלת שנה
    //ט.יציאה: הפעולה קובעת את השנה של התאריך לשנה שהתקבלה
    public void setYear(int yearToSet) {
        this.year = yearToSet;
    }

    //ט.כניסה: הפעולה מקבלת חודש
    //ט.יציאה: הפעולה קובעת את החודש של התאריך לחודש שהתקבל
    public void setMonth(int monthToSet) {
        this.month = monthToSet;
    }

    //ט.כניסה: הפעולה מקבלת יום
    //ט.יציאה: הפעולה קובעת את היום של התאריך ליום שהתקבל
    public void setDay(int dayToSet) {
        this.day = dayToSet;
    }

    //* פעולות חישוביות *
    //ט.כניסה: הפעולה מקבלת תאריך
    //הפעולה מחזירה את ההפרש בין התאריך שהתקבל לתאריך הנוכחי
    public int compareTo(Date other) {
        int thisYearHelp, otherYearHelp, thisMonthHelp, otherMonthHelp;
        if(this.month < 10) {
            thisYearHelp = this.year*10;
        } else {
            thisYearHelp = this.year;
        }

        if(other.month < 10) {
            otherYearHelp = other.year*10;
        } else {
            otherYearHelp = other.year;
        }

        if(this.day < 10) {
            thisMonthHelp = this.month*10;
        } else {
            thisMonthHelp = this.month;
        }

        if(other.day < 10) {
            otherMonthHelp = other.month*10;
        } else {
            otherMonthHelp = other.month;
        }

        int thisCalc = thisYearHelp*10000 + thisMonthHelp*100 + this.day;
        int otherCalc = otherYearHelp*10000 + otherMonthHelp*100 + other.day;

        return (thisCalc - otherCalc);
    }

    //ט.יציאה: הפעולה מחזירה מחרוזת המתארת את התאריך
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
