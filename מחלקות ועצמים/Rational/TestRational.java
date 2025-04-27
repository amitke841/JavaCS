package Rational;

public class TestRational {
    public static void main(String[] args) {
        Rational r1 = new Rational(2, 3);
        Rational r2 = new Rational(4, 5);

        System.out.println("Rational 1: " + r1.toString());
        System.out.println("Rational 2: " + r2.toString());

        Rational kefel = r1.multiply(r2);
        System.out.println("Kefel: " + kefel.toString());

        Rational hiluk = r1.divide(r2);
        System.out.println("Hiluk: " + hiluk.toString());

        boolean isEqual = r1.isEqual(r2);
        System.out.println("equals: " + isEqual);
    }
}
