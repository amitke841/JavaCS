package Node;
public class buildNode {
    	public static Node<Integer> buildUniqueList(Node<Integer> n) {
		Node<Integer> newN = null,last = null, current;
		while(n!=null) {
			if(isAppear(last,n.getValue())) {
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
        while(nextNum <= num) {
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
}
