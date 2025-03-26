package Date;

public class TestDate {
    public static void main(String[] args) {
        Date amitBirthday = new Date(21,7,2007);
        Date dadBirthday = new Date(27, 2, 1973);
        System.out.println("Amit's Birthday: " + amitBirthday.toString());
        System.out.println("Dad's Birthday: " + dadBirthday.toString());
        amitBirthday.setMonth(11);
        dadBirthday.setDay(28);
        System.out.println("Amit's Birthday: " + amitBirthday.toString());
        System.out.println("Dad's Birthday: " + dadBirthday.toString());
        System.out.println("Compare amit to dad: " + amitBirthday.compareTo(dadBirthday));
        Date otherDate = new Date(28, 2, 1973);
        if (otherDate.compareTo(dadBirthday) == 0) {
            System.out.println("Works.");
        }

    }
}
