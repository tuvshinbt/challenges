package bt.pre.algo.problems.others;

import java.util.*;

public class Graph {

    private int v; // No. of vertices

    // Array of lists for Adjacency List Representation
    private LinkedList<Integer> adj[];

    // Constructor
    Graph(int v) {
        this.v = v;
        adj = new LinkedList[this.v];
        for (int i = 0; i < this.v; ++i)
            adj[i] = new LinkedList<Integer>();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w); // Add w to v's list.
    }

    // A function used by DFS
    void DFSUtil(int v, boolean visited[]) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    void DFS(int v) {
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[this.v];

        // Call the recursive helper function to print DFS traversal
        DFSUtil(v, visited);
    }

    // prints all not yet visited vertices reachable from s
    void DFSWithStack(int s) {
        // Initially mark all vertices as not visited
        Vector<Boolean> visited = new Vector<Boolean>(this.v);
        for (int i = 0; i < this.v; i++)
            visited.add(false);

        // Create a stack for DFS
        Stack<Integer> stack = new Stack<>();

        // Push the current source node
        stack.push(s);

        while (stack.empty() == false) {
            // Pop a vertex from stack and print it
            s = stack.peek();
            stack.pop();

            // Stack may contain same vertex twice. So
            // we need to print the popped item only
            // if it is not visited.
            if (visited.get(s) == false) {
                System.out.print(s + " ");
                visited.set(s, true);
            }

            // Get all adjacent vertices of the popped vertex s
            // If a adjacent has not been visited, then puah it
            // to the stack.
            Iterator<Integer> itr = adj[s].iterator();

            while (itr.hasNext()) {
                int v = itr.next();
                if (!visited.get(v))
                    stack.push(v);
            }

        }
    }

    // prints BFS traversal from a given source s
    void BFS(int s) {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[this.v];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s + " ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");
        g.DFS(2);

        System.out.println("\nDepth First Traversal via Stack");
        g.DFSWithStack(2);

        System.out.println("\nBreath First Traversal");
        g.BFS(2);
    }
}
