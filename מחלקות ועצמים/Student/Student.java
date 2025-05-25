package Student;
import java.util.*;

//מימוש הטיפוס תלמיד
public class Student
{

    public static Scanner reader = new Scanner(System.in);
	
	private String name;// שם תלמיד
	private String idNum;// מספר ת.ז
	private int[] grades = new int[7];//מערך ציונים
	

	//פעולות בונות
	//ט.יציאה: הפעולה בונה ומחזירה עצם סטודנט לפי ערכים
	public Student(String name, String idnum, int[] grades)
    {
		this.name=name;
        this.idNum= idnum;
        this.grades = grades;
    }
	
	//ט.יציאה: הפעולה בונה ומחזירה עצם סטודנט לפי קלט
    public Student() {
        System.out.println("הקש שם");
        this.name = reader.next();
        System.out.println("הקש תז");
        this.idNum = reader.next();
		System.out.println("הקש 7 ציונים:");
		for (int i = 0; i < this.grades.length; i++) {
			this.grades[i] = reader.nextInt();
		}
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

	// ט.יציאה:הפעולה מחזירה את מערך הציונים של התלמיד
	public int[] getGrades() {
		return this.grades;
	}

	//ט.כניסה: הפעולה מקבלת מספר מקצוע
	//ט.יציאה: הפעולה מחזירה את הציון של התלמיד במספר המקצוע שהתקבל
	public int getSpecificGrade(int num) {
		return this.grades[num];
	}

	//פעולות קובעות
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

	// ט.כניסה:הפעולה מקבלת מערך ציונים חדש
	// ט.יציאה:הפעולה קובעת את מערך הציונים הקיים למערך שהתקבל
	public void setGradesArr(int[] newGrades) {
		this.grades = newGrades;
	}

	//ט.כניסה: הפעולה מקבלת מספר מקצוע וציון
	//ט.יציאה: הפעולה קובעת את הציון במספר המקצוע שהתקבל לציון שהתקבל
	public void setSpecificGrade(int num, int grade) {
		this.grades[num] = grade;
	}

	//פעולות חישוביות
	// -------------------------------------------------------------------
	// ט.יציאה:הפעולה מחזירה מחרוזת המתארת את התלמיד
	public String toString()
	{
		String str = "name: " + this.name + " ID:" + this.idNum + "\n" + "the grades are: " + "\n";
		for (int i = 0; i < this.grades.length; i++) {
			str += i+ ": " + this.grades[i] + " ";
		}
		
		return str;
	}

    //ט.כניסה: הפעולה מקבלת מספר מקצוע ואחוז
    //ט.יציאה: הפעולה מעלה את הציון במקצוע שהתקבל באחוז שהתקבל 
    public void giveBonus(int subject, double precent) {
		this.grades[subject] = this.grades[subject] * (int)((precent+100)/100);
    }

    //ט.יציאה: הפעולה מחזירה מחרוזת המתארת את ממוצע הציונים של התלמיד
    public String comment() {
        double avg = 0;
		for (int i = 0; i < this.grades.length; i++) {
			avg += this.grades[i];
		}
		avg = avg/this.grades.length;

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

