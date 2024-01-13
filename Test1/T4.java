//INPUT: tickets sold, price of each ticket
//OUTPUT: 1. money earned, money lost because of free seats, 2. ratio between money earned and money lost.
//PURPOSE: gets the number of tickets and the price of them, and prints the money earned and lost.


import java.util.*;

public class T4 {
    public static void main(String[] args)  {
        // 120 seats in cinema
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Tickets Sold: ");
        int tickets = sc.nextInt();
        System.out.println("Enter Price of each Ticket: ");
        int price = sc.nextInt();

        int earned = tickets*price;
        int lost = (120 - tickets)*price;

        System.out.println("Money earned: "+ earned);
        System.out.println("Money lost: "+ lost);
        
        if (earned > lost) {
            System.out.println("More money is earned then lost.");
        } else if (earned < lost) {
            System.out.println("More money is lost then earned.");
        } else {
            System.out.println("Money earned and lost is equal.");
        }
        sc.close();
    }
}
