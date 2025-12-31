package Node;
public class buildNode {
    	public static Node<Integer> buildUniqueList(Node<Integer> n) {
		Node<Integer> newN = null,last = null, current;
		while(n!=null) {
			if(testNode.isAppear(last,n.getValue())) {
				if (newN == null) {
					newN = new Node<Integer>(n.getValue());
					last = newN;
				} else {
					current = new Node<Integer>(n.getValue());
					last.setNext(current);
					last = current;
				}
			}
			n = n.getNext();
		}
		return newN;
	}

    public static Node<Integer> buildFollowingNums(int beginner, int num) {
        Node<Integer> newN = null,last = null, current;
        int nextNum = beginner;
        while(nextNum <= beginner+num) {
				if (newN == null) {
					newN = new Node<Integer>(beginner);
					last = newN;
                    nextNum++;
				} else {
					current = new Node<Integer>(nextNum);
					last.setNext(current);
					last = current;
                    nextNum++;
				}
		}
		return newN;
    }

	public static Node<Integer> buildReverseNode(Node<Integer> n) {
		Node<Integer> newN = null,last = null, current;
		int i = testNode.length(n);
		Node<Integer> nSave = n;
		while (i > 0) {
			n = nSave;
			for (int j = i; j > 1; j--) {
				n = n.getNext();
			}
			if (newN == null) {
			newN = new Node<Integer>(n.getValue());
			last = newN;
            i--;
			} else {
				current = new Node<Integer>(n.getValue());
				last.setNext(current);
				last = current;
            	i--;
			}
		}
		return newN;
	}

	public static void main(String[] args) {
		Node<Integer> list = new Node<Integer>(1,new Node<Integer>(2,new Node<Integer>(3,new Node<Integer>(4))));
		System.out.println(buildReverseNode(list));
	}
}
