package bt.pre.algo.problems.august.week1;

import bt.pre.algo.problems.top.TreeNode;

import java.util.*;

public class _7_VerticalOrderTraversalOfBT {


    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer, List<Integer>> x_nodes = new TreeMap<>();

//        traversal(root, 0, x_nodes);
        bfs(root, x_nodes);

        List<List<Integer>> result = new ArrayList<>();

        Iterator<List<Integer>> nodesIter = x_nodes.values().iterator();
        while (nodesIter.hasNext()) {
            result.add(new ArrayList<>(nodesIter.next()));
        }
        return result;
    }

    private void bfs(TreeNode root, Map<Integer, List<Integer>> x_nodes) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList();
        Queue<Integer> xQueue = new LinkedList();
        Map<Integer, SortedSet<Integer>> curLvlNodes = new HashMap<>();

        queue.add(root);
        int curCnt = 1;
        int nextLvlCnt = 0;
        xQueue.add(0);

        while (!queue.isEmpty()) {

            TreeNode node = queue.poll();
            Integer x = xQueue.poll();

//            List<Integer> nodes = x_nodes.getOrDefault(x, new ArrayList<Integer>());
            SortedSet<Integer> lvlNodes = curLvlNodes.getOrDefault(x, new TreeSet<>());

//            nodes.add(node.val);
//            x_nodes.put(x, nodes);

            lvlNodes.add(node.val);
            curLvlNodes.put(x, lvlNodes);

            if (node.left != null) {
                queue.add(node.left);
                xQueue.add(x - 1);
                nextLvlCnt++;
            }
            if (node.right != null) {
                queue.add(node.right);
                xQueue.add(x + 1);
                nextLvlCnt++;
            }

            curCnt--;
            if (curCnt == 0) {
                curCnt = nextLvlCnt;
                nextLvlCnt = 0;

                for(Map.Entry<Integer, SortedSet<Integer>> entry: curLvlNodes.entrySet()) {
                    List<Integer> values = x_nodes.getOrDefault(entry.getKey(), new ArrayList<>());
                    values.addAll(entry.getValue());
                    x_nodes.put(entry.getKey(), values);
                }
                curLvlNodes = new HashMap<>();
            }
        }

    }

    private void traversal(TreeNode root, int x, Map<Integer, List<Integer>> x_nodes) {
        if (root == null) {
            return;
        }


        List<Integer> nodes = x_nodes.getOrDefault(x, new ArrayList<Integer>());
        nodes.add(root.val);
        x_nodes.put(x, nodes);

        traversal(root.left, x - 1, x_nodes);
        traversal(root.right, x + 1, x_nodes);
    }
}
