import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder out = new StringBuilder();
    public static ArrayList<ArrayList<Integer>> graph;
    public static int[] indegree;
    public static int n, m;

    public static void topologySort() {
        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.naturalOrder());

        for (int i = 1; i <= n; i++)
            if (indegree[i] == 0)
                queue.add(i);

        while (!queue.isEmpty()) {
            int now = queue.poll();
            result.add(now);

            for (int v : graph.get(now)) {
                indegree[v]--;
                if (indegree[v] == 0)
                    queue.offer(v);
            }
        }

        for (int v : result)
            out.append(v).append(" ");
        out.append("\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());

        indegree = new int[n + 1];
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