package HalukatShlemim;
import java.util.Scanner;

public class Targil {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Number of Buttons:");
        int buttons = sc.nextInt();

        int Packs = buttons / 12;
        int buttonsLeft = buttons % 12;
        int boxes = Packs / 50;
        int packsLeft = Packs % 50;

        System.out.println("Boxes: " + boxes + " Packs: " + packsLeft + " Buttons: " + buttonsLeft);
        sc.close();
    }
}
