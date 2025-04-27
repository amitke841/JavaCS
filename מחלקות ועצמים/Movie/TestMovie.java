package Movie;
import java.util.*;

public class TestMovie {
    public static Scanner reader = new Scanner(System.in);

    //ט.כניסה: הפעולה מקבלת שם ומערך סרטים
    //ט.יציאה: הפעולה מחזירה אמת אם הסרט מופיע במערך סרטים אחרת מחזירה שקר
    public static boolean isAppear(String name, Movie[] movies) {
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if (m.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    //ט.כניסה: הפעולה מקבלת עצם סרט ומערך סרטים
    //ט.יציאה: הפעולה מחזירה את מספר הסרטים במערך סרטים עם אותו משך זמן כמו הסרט
    public static int howMant(Movie mov, Movie[] movies) {
        int minutesToCheck = mov.getMinutes();
        int count = 0;
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if (m.getMinutes() == minutesToCheck) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Movie[] arr = new Movie[7];
        Movie m;

        //קולט פרטי סרטים למערך סרטים
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Movie();
        }

        //הדפסת פרטי סרטים
        for (int i = 0; i < arr.length; i++) {
            m = arr[i];
            System.out.println("movie + " + (i + 1) + ": " + m.toString());
        }

        //סך הפרסים בהם זכו כל הפרסים
        int sumPrizes = 0;
        for (int i = 0; i < arr.length; i++) {
            m = arr[i];
            sumPrizes += m.getPrizes();
        }
        System.out.println("sum of all prizes: " + sumPrizes);

        //בדיקת סרטים עם שם מסוים
        System.out.println("The movie 'Titanic' appears in array? : " + isAppear("Titanic", arr));

        // בדיקת מספר הסרטים עם אותו משך זמן
        Movie testMovie = arr[0]; // בודקים לפי הסרט הראשון במערך
        int count = howMant(testMovie, arr);
        System.out.println("Number of movies with the same duration as '" + testMovie.getName() + "': " + count);

    }
}
