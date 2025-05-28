import java.util.*;

public class testKindergarten {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        Kindergarten k = new testKindergarten("Orange","city");
        System.out.println("enter 1 for kid Kelet, 2 for kid Remove, 0 for stop");
        int num = reader.nextInt();
        while(num!=0) {
            if(num==1) {
                System.out.println("enter kid name to add");
                String name = reader.next();
                k.addKid(name);
            } else if(num==2) {
                System.out.println("enter kid name to remove");
                String name = reader.next();
                k.removeKid(name);
            }
            System.out.println(k);
            System.out.println("enter 1 for kid Kelet, 2 for kid Remove, 0 for stop");
            num = reader.nextInt();
        }
        System.out.println("Current kids in kindergarten: " + k.current);
        System.out.println("Enter kid name to check if hes in kindergarten");
        String nameToCheck = reader.next();
        if(k.isKidInKindergarten(nameToCheck)) {
            System.out.println(nameToCheck + " is in the kindergarten.");
        } else {
            System.out.println(nameToCheck + " is not in the kindergarten.");
        }
    }
}
