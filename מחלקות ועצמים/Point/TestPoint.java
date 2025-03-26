
public class TestPoint {
    public static void main(String[] args) {
        Point a = new Point(43, 7);
        Point b = new Point(5, 5);

        System.out.println("Point A: " + a.toString());
        System.out.println("Point B: " + b.toString());
        System.out.println("The distance between a and b: " + a.distance(b));

        double temp = a.getX();
        a.setX(b.getX());
        b.setX(temp);

        System.out.println("Point A: " + a.toString());
        System.out.println("Point B: " + b.toString());
        Point middle = a.middle(b);
        System.out.println("Point mid is: " + middle.toString());
    }
    
}
