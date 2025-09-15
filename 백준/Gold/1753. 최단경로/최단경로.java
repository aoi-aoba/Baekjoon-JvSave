import java.io.*;
import java.util.*;

public class Main {
    public static final int INF = Integer.MAX_VALUE;
    public static int v, e;
    public static void dijkstra(List<List<int[]>> graph, int startNode) {
        int[] dist = new int[v + 1];
        Arrays.fill(dist, INF);
        dist[startNode] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        // 정점 거리상 가장 짧은 것부터 나열
        pq.offer(new int[]{startNode, 0});

        while (!pq.isEmpty()) {
            int[] now = pq.poll(); // 가장 짧은 거리의 정점 꺼내기
            int cur = now[0], distD = now[1];

            if (dist[cur] < distD) continue;
            // 이미 더 짧게 방문한 적 있다면 해당 경로 무시
            for (int[] neighbor : graph.get(cur)) {
                // 연결되어 있는 모든 이웃 노드에 대하여
                int v = neighbor[0], weight = neighbor[1];
                if (dist[v] > dist[cur] + weight) { // 이웃 정점 v까지 가는 거리가 기존보다 짧다면
                    dist[v] = dist[cur] + weight; // dist를 갱신하고
                    pq.offer(new int[]{v, dist[v]}); // 갱신 거리와 v를 큐에 추가
                }
            }
        }

        print(dist);
    }
    public static void print(int[] dist) {
        for (int i = 1; i < dist.length; i++)
            System.out.println(dist[i] == INF ? "INF" : dist[i]);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        int startNode = Integer.parseInt(br.readLine());

        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= v; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken()),
                    w = Integer.parseInt(st.nextToken());
            graph.get(u).add(new int[] {v, w});
        }

        dijkstra(graph, startNode);
    }
}