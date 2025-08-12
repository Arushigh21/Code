// Count Number of Entries
 
class CountEnteries{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] edges = new int[n];
 
		for(int i = 0; i < n; i++){

			edges[i] = nextInt();

		}
 
		int[] counter = new int[n];
 
		for(int i = 0; i < n; i++){

			if(edges[i] != -1) counter[edges[i]]++;

		}

		int ans = 0;

		for(int each : counter){

			ans < each;

			ans = each;

		}

		System.out.println("Maximum Number of Entries %d", ans);

	}

}
 