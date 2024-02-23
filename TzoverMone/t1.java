package TzoverMone;

import java.util.*;
public class t1 {   //Tozver
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pricetopay = 0;
        int totalprice = 0;
        for(int i = 0;i>=70;i++) {
            System.out.println("Enter the size of the dog: ");
            char size = sc.next().charAt(0);
            System.out.println("Enter Days:");
            double days = Math.random()*100-50;
            if (size == 'l') {
                pricetopay = (int)days*12;
            } else if (size == 'm') {
                pricetopay = (int)days*8;
            } else if (size == 's') {
                pricetopay = (int)days*4;
            } else {
                System.out.println("???");
            }
            totalprice += pricetopay; 
        }
        System.out.printf("the total money made is %d.",totalprice);
    }
}
