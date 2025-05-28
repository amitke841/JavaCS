
public class Kindergarten {
    private String name;
    private String kind;
    private String[] arrayNames;
    private int current;

    /* פעולות בונות */
    //ט.יציאה: הפעולה בונה ומחזירה עצם מסוג גן ילדים ריק ע"פ הערכים שנקלטו
    public Kindergarten(String name, String kind) {
        this.name = name;
        this.kind = kind;
        this.arrayNames = new String[15];
        this.current = 0;
    }

    /* פעולות מאחזרות */
    //ט.יציאה: הפעולה מחזירה את שם הגננת
    public String getName() {
        return this.name;
    }

    //ט.יציאה: הפעולה מחזירה את סוג גן הילדים
    public String getKind() {
        return this.kind;
    }

    /*פעולות קובעות */
    //ט.כניסה: הפעולה מקבלת שם של גננת
    //ט.יציאה: הפעולה קובעת את שם הגננת לשם שהתקב
    public void setName(String name) {
        this.name = name;
    }

    //ט.כניסה: הפעולה מקבלת סוג של גן ילדים
    //ט.יציאה: הפעולה קובעת את סוג גן הילדים לסוג שהתקבל
    public void setKind(String kind) {
        this.kind = kind;
    }

    /* פעולות חישוביות */
    //ט.יציאה: הפעולה מחזירה מחרוזת המתארת את גן הילדים
    public String toString() {
        String str = "גן ילדים: " + this.name + "\n" + "סוג גן ילדים: " + this.kind + "\n" + "ילדים: " + "\n";
        for (int i = 0; i < this.arrayNames.length; i++) {
            str += this.arrayNames[i] + "\n";
        }
        str += "מספר ילדים: " + this.current;
        return str;
    }

    //ט.כניסה: הפעולה מקבלת שם של ילד
    //ט.יציאה: הפעולה מוסיפה את הילד למערך השמות של הילדים
    public void addKid(String name) {
        this.arrayNames[this.current + 1] = name;
        this.current++;
    }

    //ט.כניסה: הפעולה מקבלת שם של ילד
    //ט.יציאה: הפעולה מסירה את הילד מהמערך השמות של הילדים
    public void removeKid(String name) {
        int removeI = 0;
        for (int i = 0; i < this.arrayNames.length; i++) {
            if (this.arrayNames[i].equals(name)) {
                removeI = i;
            }
       }
       for(int i = removeI; i < this.arrayNames.length - 1; i++) {
            this.arrayNames[i] = this.arrayNames[i + 1];
        }
        this.arrayNames[this.arrayNames.length - 1] = null;
        this.current--;
    }

    //ט.יציאה: הפעולה מחזירה האם הגן הנוכחי ריק
    public boolean isEmpty() {
        return this.current == 0;
    }

    //ט.יציאה: הפעולה מחזירה האם הגן הנוכחי מלא
    public boolean isFull() {
        return this.current == this.arrayNames.length;
    }

    //ט.כניסה: הפעולה מקבלת שם של ילד
    //ט.יציאה: הפעולה מחזירה האם הילד נמצא בגן הילדים
    public boolean isKidInKindergarten(String name) {
        for (int i = 0; i < this.arrayNames.length; i++) {
            if (this.arrayNames[i].equals(name)) {
                return true;
            }
        }
        return false;
    }

    //ט.כניסה: הפעולה מקבלת גן ילדים
    //ט.יציאה: הפעולה מחזירה האם מספר הילדים בגן הילדים שווה למספר הילדים בגן ילדים אחר
    public boolean equalsKids(Kindergarten k) {
        return this.current == k.current;
    }

}