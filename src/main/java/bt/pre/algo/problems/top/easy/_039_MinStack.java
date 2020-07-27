package bt.pre.algo.problems.top.easy;

public class _039_MinStack {
	/** initialize your data structure here. */
	private int[] stackArr;
	private int capacity;
	private int min;
	private int size;

	public _039_MinStack() {
		capacity = 32;
		stackArr = new int[capacity];
		min = Integer.MAX_VALUE;
		size = 0;
	}

	public void push(int x) {
		if (size == capacity) {
			capacity *= 2;
			int[] temp = stackArr.clone();
			stackArr = new int[capacity];
			System.arraycopy(temp, 0, stackArr, 0, capacity / 2);
		}
		stackArr[size] = x;
		if (x < min) {
			min = x;
		}
		size++;
	}

	public void pop() {
		isEmpty();
		if (stackArr[size - 1] == min) {
			findMin();
		}
		stackArr[size - 1] = 0;
		size--;
		if (capacity > 64 && size == capacity / 2) {
			capacity /= 2;
			int[] temp = stackArr.clone();
			stackArr = new int[capacity];
			System.arraycopy(temp, 0, stackArr, 0, capacity);
		}
	}

	private void findMin() {
		int newMin = Integer.MAX_VALUE;
		for (int i = 0; i < size - 1; i++) {
			if (stackArr[i] < newMin) {
				newMin = stackArr[i];
			}
		}
		min = newMin;
	}

	public int top() {
		isEmpty();
		return stackArr[size - 1];
	}

	public int getMin() {
		isEmpty();
		return min;
	}

	private void isEmpty() {
		if (size == 0)
			throw new RuntimeException("Stack is emtpy");
	}
}

class _039_MinStackSolution {

	class Node {
		int val;
		int min;
		Node next;

		Node(int val, int min) {
			this.val = val;
			this.min = min;
		}

	}

	Node head = null;

	/** initialize your data structure here. */
	public _039_MinStackSolution() {

	}

	public void push(int x) {
		int currMin = head == null ? x : head.min;
		Node n = new Node(x, Math.min(x, currMin));
		n.next = head;
		head = n;
	}

	public void pop() {
		head = head.next;
	}

	public int top() {
		return head.val;
	}

	public int getMin() {
		return head.min;
	}
}
