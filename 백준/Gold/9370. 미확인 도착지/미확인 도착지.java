import java.io.*;
import java.util.*;

public class Main {
    public static final int INF = 100_000_000;
    public static int n, m, t, s, g, h;
    public static List<List<int[]>> map;
    public static List<Integer> dest;
    public static int[] dijkstra(int startNode) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, INF);
        dist[startNode] = 0;

        Queue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{startNode, 0});

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int node = cur[0], d = cur[1];
            if (d > dist[node]) continue;

            for (int[] neighbor : map.get(node)) {
                int nNodeNum = neighbor[0], nDist = neighbor[1];
                int newDist = d + nDist;
                if (newDist < dist[nNodeNum]) {
                    dist[nNodeNum] = newDist;
                    pq.add(new int[]{nNodeNum, newDist});
                }
            }
        }

        return dist;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            t = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            s = Integer.parseInt(st.nextToken());
            g = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            map = new ArrayList<>();
            for (int i = 0; i <= n; i++) map.add(new ArrayList<>());
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()),
                        d = Integer.parseInt(st.nextToken());
                map.get(a).add(new int[]{b, d});
                map.get(b).add(new int[]{a, d});
            }

            dest = new ArrayList<>();
            for (int i = 0; i < t; i++) dest.add(Integer.parseInt(br.readLine()));
            Collections.sort(dest);

            for (int destNode : dest) {
                int[] distStartS = dijkstra(s), distStartG = dijkstra(g), distStartH = dijkstra(h);
                int fastDist = distStartS[destNode];
                int path1 = distStartS[g] + distStartG[h] + distStartH[destNode];
                int path2 = distStartS[h] + distStartH[g] + distStartG[destNode];
                if (fastDist == path1 || fastDist == path2) res.append(destNode).append(" ");
            }
            res.append("\n");
        }

        System.out.print(res);
    }
}