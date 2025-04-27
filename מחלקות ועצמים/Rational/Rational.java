package Rational;
//מימוש הטיפוס רציונלי של עמית קשת
public class Rational {
    
    private int x;
    private int y;

    /*פעולות בונות */
    //ט.כניסה: הפעולה מקבלת מספר שלם איקס ומספר שלם וואי(וואי שונה מאפס)
    //ט.יציאה: הפעולה בונה ומחזירה עצם רציונלי עפ"י הערכים שהתקבלו
    public Rational(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /* פעולות מאחזרות */
    //ט.יציאה: הפעולה מאחזרת את המספר שלם איקס
    public int getX() {
        return this.x;
    }
    //ט.יציאה: הפעולה מאחזרת את המספר שלם וואי
    public int getY() {
        return this.y;
    }

    /* פעולות חישוביות */
    //ט.כניסה: הפעולה מקבלת מספר רציונלי נוסף
    //ט.יציאה: הפעולה מחזירה האם המספר הרציונלי הנוסף שווה למספר הנוכחי
    public boolean isEqual(Rational num) {
        if (this.x * num.getY() == this.y * num.getX()) {
            return true;
        } else {
            return false;
        }
    }

    //ט.כניסה: הפעולה מקבלת מספר רציונלי נוסף
    //ט.יציאה: הפעולה מחזירה מספר רציונלי חדש שהוא מכפלת המספרים הרציונליים
    public Rational multiply(Rational num) {
        Rational multi = new Rational(this.x * num.getX(), this.y * num.getY());
        return multi; 
    }

    //ט.כניסה: הפעולה מקבלת מספר רציונלי נוסף
    //ט.יציאה: הפעולה מחזירה מספר רציונלי חדש שהוא חילוק המספרים הרציונליים
    public Rational divide(Rational num) {
        if (num.x == 0) {
            return null;
        } else {
            Rational div = new Rational(this.x * num.getY(), this.y * num.getX());
            return div;
        }
    }

    public String toString() {
        return this.x + " / " + this.y;
    }
}
