import java.io.*;
import java.util.*;

public class Main {
    public static int N, M;
    public static boolean[] visited;
    public static List<boolean[]> graph = new ArrayList<>();
    public static void dfs(int startNode) {
        for (int i = 1; i <= N; i++) {
            if (!graph.get(startNode)[i] || i == startNode) continue;
            if (!visited[i]) {
                visited[i] = true;
                dfs(i);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N + 1; i++) graph.add(new boolean[N + 1]);
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken());
            graph.get(u)[v] = true;
            graph.get(v)[u] = true;
        }

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (visited[i]) continue;
            else {
                visited[i] = true;
                cnt++;
                dfs(i);
            }
        }

        System.out.println(cnt);
    }
}
