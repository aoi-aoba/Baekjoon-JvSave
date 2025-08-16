import java.io.*;
import java.util.*;

public class Main {
    public static List<List<Integer>> graph;
    public static int[] nodeArr;
    public static boolean result;

    public static void dfs(int node, int color) {
        if (nodeArr[node] != 0 && nodeArr[node] != color) {
            result = false;
            return;
        }

        nodeArr[node] = color;

        for (int toNode : graph.get(node)) {
            if (nodeArr[toNode] == 0) {
                if (color == 1) dfs(toNode, 2);
                else dfs(toNode, 1);
            } else if (nodeArr[toNode] == nodeArr[node]) {
                result = false;
                return;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int K = Integer.parseInt(br.readLine());

        while (K-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());

            graph = new ArrayList<>();
            nodeArr = new int[v + 1];
            result = true;

            for (int i = 0; i <= v; i++) graph.add(new ArrayList<>());
            for (int i = 0; i < e; i++) {
                st = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(st.nextToken()), to = Integer.parseInt(st.nextToken());
                graph.get(from).add(to);
                graph.get(to).add(from);
            }

            dfs(1, 1);
            for (int i = 1; i <= v; i++) {
                if (nodeArr[i] != 0) continue;
                else dfs(i, 1);
            }

            sb.append(result ? "YES" : "NO").append("\n");
        }

        System.out.print(sb);
    }
}