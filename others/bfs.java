import edu.princeton.cs.algs4.Queue;
import java.util.Stack;

public class BreathFirstSearch {

    private boolean[] marked;
    private int[] edgeTo;
    private int s;

    public BreathFirstSearch(Digraph G, int s) {
        this.s = s;
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        bfs(G, s);
    }

    private void bfs(Digraph G, int s) {
        Queue<Integer> q = new Queue<Integer>();
        q.enqueue(s);
        marked[s] = true;
        while (!q.isEmpty()) {
            int v = q.dequeue();
            for (int w : G.adj(v)) {
                if (!marked[w]) {
                    marked[w] = true;
                    q.enqueue(w);
                    edgeTo[w] = v;
                }
            }
        }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v) {
        if (!marked[v]) return null;
        Stack<Integer> st = new Stack<>();
        for (int w = v; w != s; w = edgeTo[w])
            st.push(w);
        st.push(s);
        return st;
    }
}
