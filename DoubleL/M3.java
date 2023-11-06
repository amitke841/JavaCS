package DoubleL;
import java.util.*;

public class M3 {
    public static void main() {
        Scanner reader = new Scanner(System.in);
        double heigth, width;
        System.out.println("Enter heigth:");
        heigth = reader.nextDouble();
        System.out.println("Enter width:");
        width = reader.nextDouble();

        double area = (heigth * width)/2;
        double Hikef = width*3;

        System.out.println("Area of the trinangle: " + area);
        System.out.println("Hikef of the trinangle: " + Hikef);
        reader.close();
    }
}
