class MinStack {

	private Node head;

	public MinStack() {
		head = null;
	}

	public void push(int val) {
		if (head == null) {
			head = new Node(val, val);
		} else {
			head = new Node(val, Math.min(val, head.minValue), head);
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

public class Node {
	int val;
	int minVal;
	Node next;

	public Node(int val, int minVal, Node next) {
		this.val = val;
		this.minVal = minVal;
		this.next = next;
	}

	public Node(int val, int minVal) {
		this(val, minVal, null);
	}
}
