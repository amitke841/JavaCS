package Book;

import java.util.*;
public class Book {
    public static Scanner reader = new Scanner(System.in);
    private String bookName;
    private int year;
    private int numReaders;
    public Book(String bookName, int year, int numReaders) {
        this.bookName = bookName;
        this.year = year;
        this.numReaders = numReaders;
    }

    public int getYear() {
        return this.year;
    }

    public int getNumReaders() {
        return this.numReaders;
    }

    public String getBookName() {
        return this.bookName;
    }
}