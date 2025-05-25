package Student;

public class mainStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        int[] grades = {85, 90, 78, 88, 92, 76, 80};
        Student student2 = new Student("John Doe", "123456789", grades);

        System.out.println(student1.toString());
        System.out.println(student2.toString());

        student1.giveBonus(1, 20);
        System.out.println(student1.comment());


    }
}
