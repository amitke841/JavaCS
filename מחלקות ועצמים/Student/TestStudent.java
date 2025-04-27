package Student;

public class TestStudent {
    //ט.כניסה: הפעולה מקבלת סטודנט
    //ט.יציאה: הפעולה מחזירה את ממוצע הציונים שלו
    public static double avgStudent(Student stu) {
        return (stu.getMath() + stu.getEnglish() + stu.getLanguage()) / 3.0;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", "123456789", 90, 85, 88);
        Student student2 = new Student();

        System.out.println(student1.toString());
        System.out.println(student2.toString());

        double avg1 = (student1.getMath() + student1.getEnglish() + student1.getLanguage()) / 3.0;
        double avg2 = (student2.getMath() + student2.getEnglish() + student2.getLanguage()) / 3.0;

        if (avg1 > avg2) {
            System.out.println("Student with the highest average: " + student1.getName());
        } else if (avg1 < avg2) {
            System.out.println("Student with the highest average: " + student2.getName());
        } else {
            System.out.println("Both students have the same average");
        }

        Student[] arr = new Student[4];

        //קולטת סטודנטים למערך
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student();
        }

        //ממוצע ציונים של כל תלמיד
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Student " + i + " avg is: " + avgStudent(arr[i]));
        }

        // ממוצע גבוה ביותר
        Student s;
        double highestAvg = avgStudent(arr[0]);
        Student MaxStu = arr[0];
        for (int i = 1; i < arr.length; i++) {
            s = arr[i];
            if(avgStudent(s) > highestAvg) {
                highestAvg = avgStudent(s);
                MaxStu = s;
            }
        }
        System.out.println("Student with highest Avg: " + MaxStu.getName());

        //ציון ממוצע באנגלית
        double avgEng = 0;
        for (int i = 0; i < arr.length; i++) {
            s = arr[i];
            avgEng += s.getEnglish();
        }
        avgEng = avgEng/arr.length;
        System.out.println("Avg english: " + avgEng);

        // תלמידים באנגלית שקיבלו מעל הממוצע
        int countAboveAvgEng = 0;
        for (int i = 0; i < arr.length; i++) {
            s = arr[i];
            if (s.getEnglish() > avgEng) {
                countAboveAvgEng++;
            }
        }
        System.out.println("num of english got above AVG: " + countAboveAvgEng);

        // בונוס של 10 אחוז בלשון
        for (int i = 0; i < arr.length; i++) {
            s = arr[i];
            s.giveBonus("english", 10);
        }
    }
}
