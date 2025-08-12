import java.io.*;
import java.util.*;

public class Main {
    public static final List<List<Integer>> graph = new ArrayList<>();
    public static boolean[] dfsVisited, bfsVisited;
    public static StringBuilder result = new StringBuilder();

    public static void dfs(int startNode) {
        if (dfsVisited[startNode]) return;
        dfsVisited[startNode] = true;
        result.append(startNode).append(" ");

        List<Integer> nodeGraph = graph.get(startNode);
        for (int node : nodeGraph) {
            if (dfsVisited[node]) continue;
            dfs(node);
        }
    }

    public static void bfs(int startNode) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(startNode);
        bfsVisited[startNode] = true;

        while(!queue.isEmpty()) {
            int current = queue.poll();
            result.append(current).append(" ");

            for (int node : graph.get(current)) {
                if (!bfsVisited[node]) {
                    bfsVisited[node] = true;
                    queue.add(node);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken()), line = Integer.parseInt(st.nextToken());
        int startNode = Integer.parseInt(st.nextToken());

        dfsVisited = new boolean[node + 1];
        bfsVisited = new boolean[node + 1];

        for (int i = 0; i <= node; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken()), node2 = Integer.parseInt(st.nextToken());
            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }

        for (int i = 0; i <= node; i++)
            Collections.sort(graph.get(i));

        dfs(startNode);
        result.append("\n");
        bfs(startNode);

        bw.write(result.toString());
        bw.flush();
    }
}