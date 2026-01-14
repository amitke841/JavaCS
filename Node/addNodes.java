package Node;

public class addNodes {
    public static int maxDigit(int num) {
        int max = 0;
        int d;
        while(num!=0) {
            d = num%10;
            if(d>max) {
                max = d;
            }
            num/=10;
        }
        return max;
    }

    public static int minDigit(int num) {
        int min = 10;
        int d;
        while(num!=0) {
            d = num%10;
            if(d<min) {
                min = d;
            }
            num/=10;
        }
        return min;
    }

    public static void MaxMinNode(Node<Integer> n) {
        int min,max;
        while(n!=null) {
            if (n.getValue() > 9){
                min = minDigit(n.getValue());
                max = maxDigit(n.getValue());
            } else {
                min = n.getValue();
                max = n.getValue();
            }

            Node<Integer> minNode = new Node<Integer>(min);
            Node<Integer> maxNode = new Node<Integer>(max);

            minNode.setNext(maxNode);
            maxNode.setNext(n.getNext());
            n.setNext(minNode);
            n = maxNode.getNext();
        }
    }

    public static void main(String[] args) {
        Node<Integer> test = new Node<Integer>(123, new Node<Integer>(961));
        System.out.println(test.toString());
        MaxMinNode(test);
        System.out.println(test.toString());
    }
}
