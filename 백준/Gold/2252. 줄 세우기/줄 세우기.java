import java.io.*;
import java.util.*;

public class Main {
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();	
    public static int[] indegree;
	public static int n, m;
	public static StringBuilder out = new StringBuilder();

	public static void topologySort() {
		ArrayList<Integer> result = new ArrayList<>();
		ArrayDeque<Integer> Q = new ArrayDeque<>();

		for (int i = 1; i <= n; i++)
			if (indegree[i] == 0)
				Q.offerLast(i);

		while (!Q.isEmpty()) {
			int now = Q.pollFirst();
			result.add(now);

			for (int v : graph.get(now)) {
				indegree[v]--;
				if (indegree[v] == 0)
					Q.offerLast(v);
			}
		}

		for (int v : result)
			out.append(v).append(" ");
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		indegree = new int[n + 1];
        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<Integer>());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken());
            graph.get(start).add(end);
            indegree[end]++;
        }
        topologySort();
        System.out.println(out);
	}
}