import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TestClass {

    public void bfsStaging() {
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(1).add(5);
        adj.get(2).add(1);
        adj.get(2).add(5);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(3).add(4);
        adj.get(3).add(5);
        adj.get(4).add(3);
        adj.get(4).add(5);
        adj.get(5).add(1);
        adj.get(5).add(2);
        adj.get(5).add(3);
        adj.get(5).add(4);

        System.out.println(bfs(adj));

    }

    private List<Integer> bfs(List<List<Integer>> adj) {
        List<Integer> a = new ArrayList<>();
        boolean[] vis = new boolean[adj.size()];
        Queue<Integer> q = new LinkedList<>();
        vis[1] = true;
        vis[0] = true;
        q.add(1);

        while(!q.isEmpty()) {
            Integer node = q.poll();
            a.add(node);

            for (Integer i: adj.get(node)) {
                if (!vis[i]) {
                    q.add(i);
                    vis[i] = true;
                }
            }
        }
        return a;
    }
}


class Bfs {
    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.bfsStaging();
    }

}