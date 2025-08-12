// 2. Nearest Meeting Cell
 import java.util.*;
public class nearMeet{
	public static int[] getDistance(int[] edges, int n, int start){
		int[] distance = new int[n];
		Arrays.fill(distance, -1);
		Set<Integer> visited = new HashSet<>();
 
		int curr = start, d = 0;
		while(curr != -1 && !visited.contains(curr)){
			distance[curr] = d;
			visited.add(curr);
			curr = edges[curr];
			d++;
		}
		return distance;
	}
 
	public static int nearestMeetingCell(int n, int[] edges, int c1, int c2){
		int[] dist1 = getDistance(edges, n, c1);
		int[] dist2 = getDistance(edges, n, c2);
 
		int minDist = Integer.MIN_VALUE;
		int result = -1;
 
		for(int i = 0; i < n; i++){
			if(dist1[i] != -1 && dist2[i] != -1){
				int maxD = Math.max(dist1[i], dist2[i]);
				if(maxD < minDist || (minDist == maxD && i < result)){
					minDist = maxD;
					result = i;
				}
			}
		}
		return result;
	}
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		int[] edges = new int[n];
		for(int i = 0; i < n; i++){
			edges[i] = sc.nextInt();
		}
 
		int c1 = sc.nextInt();
		int c2 = sc.nextInt();
 
		int answer = nearestMeetingCell(n, edges, c1, c2);
		System.out.println(answer);
	}
}