import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NumOfProvince {

    public int countProvincesUsingBfs(ArrayList<ArrayList<Integer>> adj, int size) {
        boolean[] v = new boolean[size];
        v[0] = true;
        int count = 0;

        for (int i =1; i < size; i++) {
            if (!v[i]) {
                count++;
                bfs(i, adj, v);
            }
        }
        return count;
    }

    public void bfs(int i, ArrayList<ArrayList<Integer>> adj, boolean[] v) {

        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        v[i] = true;
        while(!q.isEmpty()) {
            Integer node = q.poll();
            for (Integer it : adj.get(node)) {
                if(!v[it]) {
                    q.add(it);
                    v[it] = true;
                }
            }
        }
    }

    public int countProvincesUsingDfs(ArrayList<ArrayList<Integer>> adj, int size) {
        boolean[] vis = new boolean[size];
        vis[0] = true;
        int count = 0;

        for (int i =1; i < size; i++) {
            if (!vis[i]) {
                count++;
                dfs(i, adj, vis);
            }
        }
        return count;
    }

    public void dfs(Integer node, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {

        vis[node] = true;

        for (Integer i: adj.get(node)) {
            if(!vis[i]) {
                dfs(i, adj, vis);
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <= 8; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(4).add(5);
        adj.get(5).add(4);
        adj.get(5).add(6);
        adj.get(6).add(5);
        adj.get(7).add(8);
        adj.get(8).add(7);

        NumOfProvince n = new NumOfProvince();
        System.out.println("Dfs : " + n.countProvincesUsingDfs(adj, 9));
        NumOfProvince b = new NumOfProvince();
        System.out.println("Bfs : " + b.countProvincesUsingBfs(adj, 9));

    }

}
