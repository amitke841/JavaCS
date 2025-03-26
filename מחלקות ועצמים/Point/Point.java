//מימוש הטיפוס נקודה של עמית קשת
public class Point {

    private double x;
    private double y;
    
    //* פעולות בונות *
    //ט.כניסה: הפעולה מקבלת מיקום איקס ווי
    //ט.יציאה: הפעולה בונה ומחזירה עצם נקודה על פי הערכים שהתקבלו
    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // * פעולות מאחזרות *
    //ט.יציאה: הפעולה מאחזרת את איקס
    public double getX() {
        return this.x;
    }
    
    //ט.יציאה: הפעולה מאחזרת את ווי
    public double getY() {
        return this.y;
    }
    
    //* פעולות קובעות *
    //ט.כניסה: הפעולה מקבלת נקודה איקס
    //ט.יציאה: הפעולה קובעת את איקס שהתקבל לאיקס של העצם
    public void setX(double x) {
        this.x = x;
    }
    
    //ט.כניסה: הפעולה מקבלת נקודה ווי
    //ט.יציאה: הפעולה קובעת את ווי שהתקבל לווי של העצם
    public void setY(double y) {
        this.y = y;
    }
    
    //* פעולות חישוביות *
    //ט.יציאה: הפעולה מחזירה מחרוזת המתארת את הנקודה
    public String toString() {
        return "( " + this.x + " , " + this.y + " )";
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

    public Point middle (Point p) {
        double xMid = (this.x + p.x)/2;
        double yMid = (this.y + p.y)/2;
        Point mid = new Point(xMid, yMid);
        return mid;
    }
}