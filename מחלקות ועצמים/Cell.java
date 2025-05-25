import java.util.*;
public class Cell {
    public static Scanner reader = new Scanner(System.in);
    private int num;
    private int times;

    public Cell() {
        this.num = reader.nextInt();
        this.times = reader.nextInt();
    }

    public int getTimes() {
        return this.times;
    }

    public int getNum() {
        return this.num;
    }

    public boolean moreTimes(Cell other) {
        if (this.num == other.num) {
            if (this.times > other.times) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
