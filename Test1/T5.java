import java.util.*;

public class T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //train has 12 carriages.
        System.out.println("Enter train carriage length:");
        int length = sc.nextInt();
        System.out.println("Enter train carriage capacity:");
        int capacity = sc.nextInt();

        int trainCapacity =  12*(length*capacity)+(capacity/2)-1;
        
        System.out.println("The train length is "+ length + " Carriages.");
        System.out.println("The Train capacity is "+ trainCapacity);
        sc.close();
    }
}
