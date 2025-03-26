public class TestBucket {
    public static void main(String[] args) {
        Bucket b1 = new Bucket(5);
        Bucket b2 = new Bucket(8);
        b1.fill(7);
        b2.fill(1);
        b2.empty();
        System.out.println("b1: " + b1.toString());
        System.out.println("b2: " + b2.toString());
        b1.pourInto(b2);
        System.out.println("b1: " + b1.toString());
        System.out.println("b2: " + b2.toString());

    }
}
