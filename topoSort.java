//cd Onedrive/Desktop/FDP/TopoSortJusPay.java
import java.util.*;
 
public class topoSort{
	static class Solution{
		private void dfs(int node, Stack<Integer> st, boolean[] vis, ArrayList<Integer>[] adj){
			vis[node] = true;
 
			for(int each : adj[node]){
				if(!vis[each]) dfs(each, st, vis, adj);
			}
			st.push(node);
		}
 
		public List<Integer> topoSort(int V, ArrayList<Integer>[] adj){
			boolean[] vis = new boolean[V];
			Stack<Integer> st = new Stack<>();
			for(int i = 0; i < V; i++){
				if(!vis[i]) dfs(i, st, vis, adj);
			}
			List<Integer> ans = new ArrayList<>();
			while(!st.isEmpty()) ans.add(st.pop());
			return ans;
		}
	}
 
	public static void main(String[] args){
		// Vertice, Edges, adj, boolean[] vis (V), stack
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of V");
		int V = sc.nextInt();
		System.out.println("Enter no. of E");
		int E = sc.nextInt();
 
		ArrayList<Integer>[] adj = new ArrayList[V];
		for(int i = 0; i < V; i++) adj[i] = new ArrayList<>();
 
		for(int i = 0; i < E; i++){
			int src  = sc.nextInt();
			int dest = sc.nextInt();
			adj[src].add(dest);
		}
 
		Solution sol = new Solution();
		List<Integer> topoOrder = sol.topoSort(V, adj);
 
		System.out.println("TopoSort Answer: ");
		for(int node : topoOrder){
			System.out.print(node + " ");
		}
	}
}
 