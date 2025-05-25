import java.util.*;
public class Guest {
    public static Scanner reader = new Scanner(System.in);
    private int roomNum;
    private int nights;
    private char pool;

    public Guest() {
        this.nights = reader.nextInt();
        this.roomNum = reader.nextInt();
        this.pool = reader.next().charAt(0);
    }

    public int getRoomNum() {
        return this.roomNum;
    }

    public int getNights() {
        return this.nights;
    }

    public char getPool() {
        return this.pool;
    }
}
