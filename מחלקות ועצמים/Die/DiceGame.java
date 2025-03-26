package Die;

public class DiceGame {
    public static void main(String[] args) {
        Die die1 = new Die();
        Die die2 = new Die();
        System.out.println("die1: " + die1.getNum() + " ,die2: " + die2.getNum());
        System.out.println();
        int count = 1;

        while (die1.getNum() + die2.getNum() != 12) {
            die1.roll();
            die2.roll();
            System.out.println("die1: " + die1.getNum() + " ,die2: " + die2.getNum());
            System.out.println();
            count++;
        }
        System.out.println("The num of turs: " + count);
    }

}
