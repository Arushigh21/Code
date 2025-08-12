/*
kruskal's algorithm
shouldn't form a cycle,visit all nodes,minimum cost
adjacency list=traverse easily(list-source and destination),undirected graph
if its a cycle then remove the connecting edge and continue the traversal
no. of edges=no. of vertices-1
DSU(Disjoint set unit)
-techniques to find the cycles in the graph
*/
// Krushkal's Algorithm
 import java.util.*;
class KrushkalMST{
// Edge Class
static class Edge implements Comparable<Edge>{
int src, dest, weight;
 
Edge(int s, int d, int w){
src = s;
dest = d;
weight = w;
}
// This will sort according to Weight
public int compareTo(Edges other){
return this.weight - other.weight
}
}
 
static class UnionFind{
int[] parent, rank;
 
UnionFind(int n){
parent = new int[n];
rank = new int[n];
 
for(int i = 0; i < n; i++){
parent[i] = i;
}
}
int find(int u){
  if(parent[u] != u){
  parent[u] = find(parent[u])
  }
  return parent[u];
}
 
boolean union(int u, int v){
int rootU = find(u);
int rootV = find(v);
 
if(rootU == rootV) return false;// Already in the set, forming cycle
// Union by rank
if(rank[rootU] < rank[rootV]) parent[rootU] = rootV;
else if(rank[rootV] < rank[rootU]) parent[rootV] = rootU;
else{
parent[rootV] = rootU;
rank[rootU]++;
}
}
return true;
}
 
staic void krushkalMST(int V, List<Edge> edges){
Collections.sort(edges);
UnionFind uf = new UnionFind();
List<Edge> mst = new ArrayList<>();
int totalWeight = 0;
 
for(Edge each : edges){
if(uf.union(each.src, each.dest)){
mst.add(each);
totalWeight += each.weight;
}
if(mst.size() == V-1) break;
}
// Output
System.out.println("Edges in MST: ");
for(Edge each : mst){
System.out.println(each.src + "--" + each.dest + " = " + each.weight);
}
System.out.println("Total Weight: " + totalWeight);
}
 
public static void main(String[] args){
int V = 4;
List<Edge> edges = new ArrayList<>();
 
edges.add(new Edge(0, 1, 10));
edges.add(new Edge(0, 2, 6));
edges.add(new Edge(0, 3, 5));
edges.add(new Edge(1, 3, 15));
edges.add(new Edge(2, 3, 14);
 
krushkalMST(V, edges);
}
}
 
 