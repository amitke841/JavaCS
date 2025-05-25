
public class Lesson {
    private int id;
    private int hh;
    private int mm;
    private int duration;

    public Lesson() {}

    public boolean isLater(Lesson other) {
        if(this.hh*100 + this.mm > other.hh*100+other.mm) {
            return true;
        }
        return false;
    }
}
