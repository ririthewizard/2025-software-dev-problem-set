class MinStack {
	Node head;

	public MinStack() {
		head = null;
	}

	public void push(int val) {
		if (head == null) {
			head = new Node(val, val, head);
		} else {
			head = new Node(val, Math.min(val, head.minVal), head);
		}

	}

	public void pop() {
		head = head.next;
	}

	public int top() {
		return head.val;
	}

	public int getMin() {
		return head.minVal;
	}

}

class Node {
	public int val;
	public int minVal;
	public Node next;

	public Node(int val, int minVal, Node next) {
		this.val = val;
		this.minVal = minVal;
		this.next = next;
	}

	public Node(int val, int minVal) {
		this(val, minVal, null);
	}
}
