import java.io.*;
import java.util.*;

public class Main {
    public static int n;
    public static final int INF = 100_000_000;
    public static List<Edge> edgeList = new ArrayList<>();
    public static class Edge {
        int from, to, cost;
        public Edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }
    public static long[] bellmanFord(int startNode) {
        long[] dist = new long[n + 1];
        Arrays.fill(dist, INF);
        dist[startNode] = 0;

        for (int i = 0; i < n - 1; i++)
            for (Edge e : edgeList)
                if (dist[e.from] != INF && dist[e.to] > dist[e.from] + e.cost)
                    dist[e.to] = dist[e.from] + e.cost;

        for (Edge e : edgeList)
            if (dist[e.from] != INF && dist[e.to] > dist[e.from] + e.cost)
                return null;

        return dist;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(st.nextToken());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()),
                    w = Integer.parseInt(st.nextToken());
            edgeList.add(new Edge(a, b, w));
        }

        long[] dist = bellmanFord(1);
        if (dist == null) System.out.println(-1);
        else {
            StringBuilder sb = new StringBuilder();
            for (int i = 2; i <= n; i++)
                sb.append((dist[i] == INF) ? -1 : dist[i]).append("\n");
            System.out.print(sb);
        }
    }
}