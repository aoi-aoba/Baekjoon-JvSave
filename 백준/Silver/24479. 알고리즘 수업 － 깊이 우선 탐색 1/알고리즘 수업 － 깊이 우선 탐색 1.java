import java.io.*;
import java.util.*;

public class Main {
    public static List<List<Integer>> graph = new ArrayList<>();
    public static boolean[] visited;
    public static int[] visitNumArr;
    public static int depth = 0;

    public static void dfs(int startNode) {
        visited[startNode] = true;
        depth++;
        visitNumArr[startNode] = depth;

        for (int node : graph.get(startNode))
            if (!visited[node]) dfs(node);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken());
        int line = Integer.parseInt(st.nextToken());
        int startNode = Integer.parseInt(st.nextToken());

        visited = new boolean[node + 1];
        visitNumArr = new int[node + 1];

        for (int i = 0; i <= node; i++)
            graph.add(new ArrayList<Integer>());

        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken()), node2 = Integer.parseInt(st.nextToken());
            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }

        for (int i = 0; i <= node; i++)
            Collections.sort(graph.get(i));

        dfs(startNode);
        for (int i = 1; i <= node; i++)
            sb.append(visitNumArr[i]).append("\n");
        bw.write(sb.toString());
        bw.flush();
    }
}