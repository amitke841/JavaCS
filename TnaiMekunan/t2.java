import java.util.Scanner;
public class t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first char: ");
        char c1 = sc.next().charAt(0);
        System.out.println("Enter second char: ");
        char c2 = sc.next().charAt(0);
        System.out.println("Enter third char: ");
        char c3 = sc.next().charAt(0);
        System.out.println("Enter fourth char: ");
        char c4 = sc.next().charAt(0);

        char big;
        if (c3>c4) {
            if (c3>c2) { 
                if (c3>c1) {
                    big = c3;
                } else {
                    big = c1;
                }
            } else { // c2>c3
                if (c2 > c1) {
                    big = c2;
                } else { //c1>c2
                    big = c1;
                }
            }
        } else { //c4>c3
            if () {
                
            }
        }
    }
}
