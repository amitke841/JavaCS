package gamaa;

@FunctionalInterface
interface Ipow {
    public int pow(int x);
}

public class fi {
    public static void main(String[] args) {
        Ipow func = (x) -> (x*x);
        System.out.println(func.pow(152));
    }    
}
