import java.io.*;
import java.util.*;

public class Main {
    public static final List<List<Integer>> graph = new ArrayList<>();
    public static boolean[] dfsVisited;
    public static int infectedCnt = 0;

    public static void dfs(int startNode) {
        dfsVisited[startNode] = true;
        infectedCnt++;
        for (int node : graph.get(startNode))
            if (!dfsVisited[node]) dfs(node);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int node = Integer.parseInt(br.readLine()), line = Integer.parseInt(br.readLine());
        dfsVisited = new boolean[node + 1];

        for (int i = 0; i <= node; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < line; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken()), node2 = Integer.parseInt(st.nextToken());
            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }

        for (int i = 0; i <= node; i++)
            Collections.sort(graph.get(i));

        dfs(1);
        bw.write(String.valueOf(infectedCnt - 1));
        bw.flush();
    }
}