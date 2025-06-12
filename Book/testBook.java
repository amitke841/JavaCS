package Book;
import java.util.*;
public class testBook {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        Book[] arrayBooks = new Book[20];

        arrayBooks[0] = new Book("To Kill a Mockingbird", 1960, 500);
        arrayBooks[1] = new Book("1984", 1960, 600);
        arrayBooks[2] = new Book("The Great Gatsby", 1960, 500);
        arrayBooks[3] = new Book("Pride and Prejudice", 1960, 700);
        arrayBooks[4] = new Book("The Catcher in the Rye", 1951, 550);
        arrayBooks[5] = new Book("The Hobbit", 1937, 800);
        arrayBooks[6] = new Book("Fahrenheit 451", 1953, 400);
        arrayBooks[7] = new Book("Jane Eyre", 1847, 350);
        arrayBooks[8] = new Book("Animal Farm", 1945, 500);
        arrayBooks[9] = new Book("Moby-Dick", 1851, 300);
        arrayBooks[10] = new Book("War and Peace", 1869, 250);
        arrayBooks[11] = new Book("The Odyssey", -800, 200);
        arrayBooks[12] = new Book("Crime and Punishment", 1866, 320);
        arrayBooks[13] = new Book("The Lord of the Rings", 1954, 900);
        arrayBooks[14] = new Book("Brave New World", 1932, 410);
        arrayBooks[15] = new Book("Wuthering Heights", 1847, 330);
        arrayBooks[16] = new Book("The Divine Comedy", 1320, 180);
        arrayBooks[17] = new Book("The Brothers Karamazov", 1880, 270);
        arrayBooks[18] = new Book("Don Quixote", 1605, 220);
        arrayBooks[19] = new Book("Great Expectations", 1861, 370);

        //-----------------------------------------------------------------------------

        System.out.println("הקלד שנה לבדיקה");
        int checkYear = reader.nextInt();
        Book b;
        int minReaders = arrayBooks[0].getNumReaders();
        for (int i = 1; i < arrayBooks.length; i++) {
            b = arrayBooks[i];
            if (b.getYear() == checkYear && b.getNumReaders() < minReaders) {
                minReaders = b.getNumReaders();
            }
        }

        System.out.println("ספרים שקראו הכי פחות בשנה שהתקבלה:");
        for (int i = 0; i < arrayBooks.length; i++) {
            b = arrayBooks[i];
            if (b.getNumReaders() == minReaders && b.getYear() == checkYear) {
                System.out.println(b.getBookName());
            }
        }
    }
}
