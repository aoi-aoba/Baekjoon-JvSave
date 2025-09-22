import java.io.*;
import java.util.*;

public class Main {
    public static int N, E, v1, v2;
    public static final int INF = Integer.MAX_VALUE;
    public static List<List<int[]>> graph = new ArrayList<>();
    public static int[] dijkstra(int startNode, int targetNode1, int targetNode2) {
        int[] dist = new int[N + 1];
        Arrays.fill(dist, INF);
        dist[startNode] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[] {startNode, 0});

        while (!pq.isEmpty()) {
            int[] now = pq.poll();
            int cur = now[0], distCur = now[1];

            if (dist[cur] < distCur) continue;
            for (int[] neighbor: graph.get(cur)) {
                int v = neighbor[0], weight = neighbor[1];
                if (dist[v] > dist[cur] + weight) {
                    dist[v] = dist[cur] + weight;
                    pq.offer(new int[] {v, dist[v]});
                }
            }
        }

        return new int[] {dist[targetNode1], dist[targetNode2]};
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= N; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken()),
                    w = Integer.parseInt(st.nextToken());
            graph.get(u).add(new int[] {v, w});
            graph.get(v).add(new int[] {u, w});
        }

        st = new StringTokenizer(br.readLine());
        v1 = Integer.parseInt(st.nextToken());
        v2 = Integer.parseInt(st.nextToken());

        int[] startTo = dijkstra(1, v1, v2);
        int[] v1Start = dijkstra(v1, v2, N);
        int[] v2Start = dijkstra(v2, v1, N);

        int res = -1;
        // 1 -> v1 -> v2 -> N
        if (startTo[0] != INF && v1Start[0] != INF && v2Start[1] != INF)
            res = startTo[0] + v1Start[0] + v2Start[1];
        if (startTo[1] != INF && v1Start[1] != INF && v2Start[0] != INF) {
            int dist = startTo[1] + v1Start[1] + v2Start[0];
            if (res == -1) res = dist;
            else res = Math.min(res, dist);
        }

        System.out.println(res);
    }
}