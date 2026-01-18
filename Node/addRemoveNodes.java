package Node;

public class addRemoveNodes {
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

    public static Node<Integer> evenOddSort(Node<Integer> n) {
        Node<Integer> delete, oddsSave, nSave;
        Node<Integer> odds = new Node<Integer>(1);
        Node<Integer> demi = new Node<Integer>(2,n);
        Node<Integer> lastEven = n;
        n = demi;
        oddsSave = odds;
        nSave = n;
        
        while(n != null && n.hasNext()) {
            if(n.getNext().getValue()%2 == 1) {
                odds.setNext(new Node<Integer>(n.getNext().getValue()));
                odds = odds.getNext();
                delete = n.getNext();
                n.setNext(delete.getNext());
                delete.setNext(null);
            } else lastEven = n.getNext();
            n = n.getNext();
        }

        if(n == null) {
            lastEven.setNext(oddsSave.getNext());
        } else n.setNext(oddsSave.getNext());

        return nSave.getNext();
    }

	public static Node<Integer> evenOddSortBetter(Node<Integer> n) { //moving even to start instead if odd to end
		Node<Integer> nAfter, demi;
		demi = new Node<Integer>(1,n);
		n = demi;
		while(n != null && n.hasNext()) {
			nAfter = n.getNext();
			if(nAfter.getValue()%2 == 0) {
				n.setNext(nAfter.getNext());
				nAfter.setNext(null); //Classic Delete
				nAfter.setNext(demi.getNext());
				demi.setNext(nAfter);// Connectin
			} else n.getNext();
		}
		return demi.getNext();
	}

	public static void shortSeq(Node<Integer> n) {
		Node<Integer> nAfter;
		while (n != null && n.hasNext()) {
			nAfter = n.getNext();
			if(n.getValue() == n.getValue()) {
				n.setNext(nAfter.getNext());
				nAfter.setNext(null);
			} else n = n.getNext();
		}
	}

    public static void main(String[] args) {
        Node<Integer> test = new Node<Integer>(123, new Node<Integer>(960, new Node<Integer>(4, new Node<Integer>(5))));
        test = evenOddSort(test);
        System.out.println(test.toString());
    }
}
