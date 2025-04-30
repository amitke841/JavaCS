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
    public static int howMany(Movie mov, Movie[] movies) {
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

    //ט.כניסה: הפעולה מקבלת מערך סרטים
    //ט.יציאה: הפעולה מחזירה אמת אם יש לפחות שני סרטים עם אותו שפה אחרת מחזירה שקר
    public static boolean sameLanguageInArray(Movie[] movies) {
        for (int i = 0; i < movies.length; i++) {
            Movie m1 = movies[i];
            for (int k = 0; k < movies.length; k++) {
                Movie m2 = movies[k];
                if (m1.getLanguage().equals(m2.getLanguage()) && m1 != m2) {
                    return true;
                }
            }
        }
        return false;
    }

    //ט.כניסה: הפעולה מקבלת מערך סרטים
    //ט.יציאה: הפעולה מעבירה את הסרטים באנגלית לתחילת המערך
    public static void sortEnglishFirst(Movie[] movies) {
        Movie m;
        int k = 0;
        Movie[] help = new Movie[movies.length];
        for (int i = 0; i < movies.length; i++) {
            m = movies[i];
            if (m.getLanguage().equals("english")) {
                help[k] = m;
                k++;
            }
        }
        for (int i = 0; i < movies.length; i++) {
            m = movies[i];
            if (!m.getLanguage().equals("english")) {
                help[k] = m;
                k++;
            }
        }
        for (int i = 0; i < movies.length; i++) {
            movies[i] = help[i];
        }
    }

    public static void main(String[] args) {
        Movie[] arr = new Movie[4];
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
        int count = howMany(testMovie, arr);
        System.out.println("Number of movies with the same duration as '" + testMovie.getName() + "': " + count);

        //בדיקת סרטים עם אותו שפה
        System.out.println("Is there at least two movies with the same language? : " + sameLanguageInArray(arr));

        //בדיקת הסרט הקצר ביותר
        Movie shortest = arr[0];
        int minShort = arr[0].getMinutes();
        for (int i = 0; i < arr.length; i++) {
            m = arr[i];
            if (m.getMinutes() < minShort) {
                minShort = m.getMinutes();
                shortest = m;
            }
        }
        System.out.println("The shortest movie is: " + shortest.getName() + " with duration of " + minShort + " minutes.");

        //סידור הסרטים באנגלית
        for (int i = 0; i < arr.length; i++) {
            m = arr[i];
            System.out.println(m.toString());
        }
    }
}
