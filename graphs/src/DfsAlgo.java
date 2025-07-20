import java.util.ArrayList;

public class DfsAlgo {

    public void dfs(int node, boolean[] vis,  ArrayList<ArrayList<Integer>> adj,
                    ArrayList<Integer> ls) {
        //marking current node as visited
        vis[node] = true;
        ls.add(node);
        System.out.println(node);
        //getting neighbour nodes
        for (Integer i : adj.get(node)) {
            if(!vis[i]) {
                System.out.println(i);
                dfs(i, vis, adj, ls);
            }
        }
    }

    public ArrayList<Integer> dfsStaging(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ls = new ArrayList<>();
        boolean[] vis = new boolean[adj.size()];
        vis[0] = true;
        dfs(1, vis, adj, ls);
        return ls;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();


        for (int i = 0; i <= 8; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(2).add(1);
        adj.get(2).add(5);
        adj.get(2).add(6);
        adj.get(3).add(1);
        adj.get(3).add(4);
        adj.get(3).add(7);
        adj.get(4).add(3);
        adj.get(4).add(8);
        adj.get(5).add(2);
        adj.get(6).add(2);
        adj.get(7).add(3);
        adj.get(7).add(8);
        adj.get(8).add(4);
        adj.get(8).add(7);

        DfsAlgo c = new DfsAlgo();
        ArrayList<Integer> ans = c.dfsStaging(adj);
        System.out.println(ans);
    }

}

