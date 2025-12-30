package Node;
import java.util.*;

public class StringNode {
    static Scanner reader = new Scanner(System.in);
    public static Node<Character> buildCharList() {
		Node<Character> current,first,last;
		System.out.println("enter nums and -1 to finish");
		char c= reader.next().charAt(0);
		if (c!=999)
		{
			last = new Node <Character> (c);
			first = last;
			c= reader.next().charAt(0);
			while(c!=-1)
			{
				current = new Node <Character> (c);
				last.setNext(current);
				last=current;
				c= reader.next().charAt(0);
			}
			return first;
		}
		return null;
		
	}
	
	public static boolean isAppear(String str, String target) {
        for(int i = 0; i < target.length(); i++) {
            if (target.charAt(i) != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static int nameAppears(Node<String> n1, String name) {
        String n;
        int count = 0;
        while(n1 != null) {
            n = n1.getValue();
            if(isAppear(n, name)) {
                count++;
            }
            n1 = n1.getNext();
        }
        return count;
    }

    public static Node<String> isSorted(Node<String> n1) {
        if (n1 != null) {
            String next, prev = n1.getValue();
            n1 = n1.getNext();
            while(n1 != null) {
                next = n1.getValue();
                if (prev.compareTo(next) > 0) {
                    return n1;
                }
                n1 = n1.getNext();
            }
        }
        return null;
        
    }
    
    public static void sharedNums(Node<Double> n1, Node<Double> n2) {
    	Node<Double> n2Save = n2;
    	while(n1!=null) {
    		while(n2!=null)
    			if(n1.getValue() == n2.getValue()) {
    				System.out.println(n1.getValue());
    			}
    		n2 = n2.getNext();
    	}
    	n1 = n1.getNext();
    	n2 = n2Save;
    }
    
    public static double smallestNum(Node<Double> n1, Node<Double> n2) {
    	while(n1!=null && n2!=null)	{
    		if(n1.getValue() == n2.getValue())	{
    			return n1.getValue();
    		} else if (n1.getValue() > n2.getValue()) {
    			n2 = n2.getNext();
    		} else {
    			n1 = n1.getNext();
    		}
    	}
    	return -999.0;
    }
    
    public static int seqChar(Node<Character> n1, char c) {
    	boolean seq = false;
    	int count = 0;
    	while(n1!=null) {
    		if(n1.getValue() == c) {
    			if (!seq)
    				count++;
    				seq = true;
    		} else seq = false;
    		n1 = n1.getNext();
    	}
    	return count;
    }
    
    public static int result(char c1, char c2, char op) {
    	int n1 = (int)c1 - (int)'0';
        int n2 = (int)c2 - (int)'0';

        if (op == '+') {
    		return (n1 + n2);
    	} else if (op == '-') {
    		return (n1 - n2);
    	} else if (op == '*') {
    		return (n1*n2);
    	} else return (n1/n2);
    }

    public static void calculateList(Node<Character> n1) {
        while (n1 != null && n1.hasNext() && n1.getNext().hasNext()) {
            char char1 = n1.getValue();
            n1 = n1.getNext();
            char op = n1.getValue();
            n1 = n1.getNext();
            char char2 = n1.getValue();
            n1 = n1.getNext();
            System.out.println(result(char1, op, char2));
        }
    }

    public static void main(String[] args) {
        Node<String> hello = new Node<String>("Amit bla", new Node<String>("Amit sha", new Node<String>("Amit za")));
        System.out.println(nameAppears(hello, "Amat"));
        System.out.println(isSorted(hello));
    }
}
