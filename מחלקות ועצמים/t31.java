import java.util.*;
public class t31 {
    public static Scanner reader = new Scanner(System.in);
    public static int nearestSeat(int seat, boolean[] arr) {
        int goodSeat = -1;
        if(!arr[seat]) {
            arr[seat] = true;
            return seat;
        }
        for (int i = 1; i < arr.length/2 && goodSeat == -1; i++) {
            if (!arr[seat + i] && (seat + i) < arr.length) {
                arr[seat + i] = true;
                goodSeat = seat + i;
            } else if (!arr[seat-i] && (seat + i) > 0) {
                arr[seat - i] = true;
                goodSeat = seat - i;
            }
        }
        return goodSeat;
    }
    public static void main(String[] args) {
        boolean[] seats = new boolean[200];
        for (int i = 0; i < seats.length; i++) {
            seats[i] = false;
        }

        int kelet = reader.nextInt();
        System.out.println("Seat is: " + nearestSeat(kelet, seats));
        while(kelet != -1) {
            kelet = reader.nextInt();
            System.out.println("Seat is: " + nearestSeat(kelet, seats));
        }
    }
}
