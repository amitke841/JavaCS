import java.util.*;
public class random {
    public static void main(String[] args) {
        Random rnd = new Random();
        int num = rnd.nextInt(10000-1000)+1000;
        System.out.println(num);
    }
    
}