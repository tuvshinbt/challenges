package bt.pre.algo.problems.top.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class _13_PopulatingNextRightPointersEachNodeTest {

	private final _13_PopulatingNextRightPointersEachNode solution = new _13_PopulatingNextRightPointersEachNode();

	@Test
	public void example1() {
		Node root = new Node(1, new Node(2, new Node(4), new Node(5), null),
				new Node(3, new Node(6), new Node(7), null), null);

		this.solution.connect(root);

		assertNull(root.next);
		assertEquals(3, root.left.next.val);
		assertNull(root.left.next.next);
		assertEquals(5, root.left.left.next.val);
		assertEquals(6, root.left.left.next.next.val);
		assertEquals(7, root.left.left.next.next.next.val);
		assertNull(root.left.left.next.next.next.next);
	}
}
