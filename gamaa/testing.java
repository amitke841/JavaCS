package gamaa;
import java.util.*;

class Animal {
    public int num;

    public void say() {
        System.out.println("saying animal");
    }
}

class Dog extends Animal{
    
    @Override
    public void say() {
        System.out.println("saying dog");
    }
}

public class testing {
    public static void main(String[] args) {
        PriorityQueue s = new PriorityQueue<>()

    }
}
