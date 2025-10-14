import java.io.*;
import java.util.*;

public class Main {
    public static final int INF = 1_000_000_000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int[][] dist = new int[v+1][v+1];

        for (int i = 1; i <= v; i++)
            for (int j = 1; j <= v; j++)
                dist[i][j] = INF;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int sr = Integer.parseInt(st.nextToken()), en = Integer.parseInt(st.nextToken()),
                    c = Integer.parseInt(st.nextToken());
            dist[sr][en] = Math.min(dist[sr][en], c);
        }

        for (int k = 1; k <= v; k++)
            for (int i = 1; i <= v; i++)
                for (int j = 1; j <= v; j++)
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);

        int ans = INF * 2;
        for (int i = 1; i <= v; i++)
            for (int j = 1; j <= v; j++) {
                if (dist[i][j] == INF || dist[j][i] == INF) continue;
                if (i == j) ans = Math.min(ans, dist[i][j]);
                else ans = Math.min(ans, dist[i][j] + dist[j][i]);
            }

        System.out.println((ans == INF * 2) ? -1 : ans);
    }
}