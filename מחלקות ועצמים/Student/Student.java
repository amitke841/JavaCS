package Student;
import java.util.*;

//מימוש הטיפוס תלמיד
public class Student
{

    public static Scanner reader = new Scanner(System.in);
	
	private String name;// שם תלמיד
	private String idNum;// מספר ת.ז
	private int math;//ציון במתמטיקה
	private int english;//ציון באנגלית
	private int language;//ציון בלשון
	

	//פעולות בונות
	// -------------------------------------------------------------------

	public Student(String name, String idnum, int math, 
                             int english, int language)
    {
		this.name=name;
        this.idNum= idnum;
        this.math=math;
        this.english=english;
        this.language=language;
    }
	
	//ט.יציאה: הפעולה קולטת תכונות של סטודנט ובונה עצם
    public Student() {
        System.out.println("הקש שם");
        this.name = reader.next();
        System.out.println("הקש תז");
        this.idNum = reader.next();
        System.out.println("הקש ציון במתמטיקה");
        this.math = reader.nextInt();
        System.out.println("הקש ציון באנגלית");
        this.english = reader.nextInt();
        System.out.println("הקש ציון בלשון");
        this.language = reader.nextInt();
    }

	//פעולות מאחזרות
	//ט.יציאה:הפעולה מחזירה את שם התלמיד 
	public String getName()
	{
		return this.name;
	}

	//ט.יציאה:הפעולה מחזירה את מספר ת.ז של התלמיד
	public String getIdNum()
	{
		return this.idNum;
	}

	// ט.יציאה:הפעולה מחזירה את הציון במתמטיקה של התלמיד
	public int getMath()
	{
		return this.math;
	}

	// ט.יציאה:הפעולה מחזירה את הציון באנגלית של התלמיד
	public int getEnglish()
	{
		return this.english;
	}

	// ט.יציאה:הפעולה מחזירה את הציון בלשון של התלמיד
	public int getLanguage()
	{
		return this.language;
	}

	//פעולות קובעות
	// -------------------------------------------------------------------
	// ט.כניסה:הפעולה מקבלת שם תלמיד
	// ט.יציאה:הפעולה קובעת את שם התלמיד להיות השם שהתקבל
	public void setName(String name)
	{
		this.name = name;
	}

	// ט.כניסה:הפעולה מקבלת מספר ת.ז
	// ט.יציאה:הפעולה קובעת את מספר ת.ז להיות ת.ז. שהתקבלה
	public void setIdNum(String idNum)
	{
		this.idNum = idNum;
	}

	// ט.כניסה:הפעולה מקבלת ציון במתמטיקה
	// ט.יציאה:הפעולה קובעת את הציון במתמטיקה להיות הציון שהתקבל
	public void setMath(int math)
	{
		this.math = math;
	}

	// ט.כניסה:הפעולה מקבלת ציון באנגלית
	// ט.יציאה:הפעולה קובעת את הציון באנגלית להיות הציון שהתקבל
	public void setEnglish(int english)
	{
		this.english = english;
	}

	// ט.כניסה:הפעולה מקבלת ציון בלשון
	// ט.יציאה:הפעולה קובעת את הציון בלשון להיות הציון שהתקבל
	public void setLanguage(int language)
	{
		this.language = language;
	}

	//פעולות חישוביות
	// -------------------------------------------------------------------
	// ט.יציאה:הפעולה מחזירה מחרוזת המתארת את התלמיד
	public String toString()
	{
		return "name: " + this.name + " ID:" + this.idNum + " English grade: " + this.english + "Language grade:"
				+ this.language + " Math grade: " + this.math;
	}

    //ט.כניסה: הפעולה מקבלת שם מקצוע ואחוז
    //ט.יציאה: הפעולה מעלה את הציון במקצוע שהתקבל באחוז שהתקבל 
    public void giveBonus(String subject, double precent) {
        if (subject.equals("math")) {
            this.math = this.math * (int)((precent+100)/100);
        }
        if (subject.equals("english")) {
            this.english = this.english * (int)((precent+100)/100);
        }
        if (subject.equals("language")) {
            this.language = this.language * (int)((precent+100)/100);
        }
    }

    //ט.יציאה: הפעולה מחזירה מחרוזת המתארת את ממוצע הציונים של התלמיד
    public String comment() {
        int avg = this.math + this.english + this.language;
        avg = (int)(avg/3.0);
        if (avg >= 90) {
            return "מצטיין";
        } else if (avg >= 75) {
            return "טוב";
        } else if (avg >= 55) {
            return "עובר";
        } else {
            return "נכשל";
        }
    }
}

