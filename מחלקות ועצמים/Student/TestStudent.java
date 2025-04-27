package Student;

public class TestStudent {
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
    }
}
