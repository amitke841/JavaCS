package Die;

//מימוש הטיפוס קובייה של עמית קשת
public class Die {
    private int num;

    //* פעולות בונות *
    //ט.יציאה: הפעולה מחזירה מספר רנדומלי בין 1-6 בתור הפאה העליונה
    public Die() {
        this.num = 1 + (int)(Math.random()*(6-1+1));
    }

    // * פעולות מאחזרות *
    //ט.יציאה: הפעולה מאחזרת את המספר שעל הפאה העליונה
    public int getNum() {
        return this.num;
    }

    //* פעולות קובעות *
    //ט.יציאה: הפעולה מגרילה מספר חדש שיהיה בפאה העליונה
    public void roll() {
        this.num = 1 + (int)(Math.random()*(6-1+1));
    }
}