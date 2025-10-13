import java.io.*;
import java.util.*;

public class Main {
    public static final int INF = 101010101;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), m = Integer.parseInt(br.readLine());
        int[][] dist = new int[n+1][n+1];
        
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                dist[i][j] = (i == j) ? 0 : INF;

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken()),
                    c = Integer.parseInt(st.nextToken());
            dist[s][e] = Math.min(dist[s][e], c);
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                sb.append(dist[i][j] == INF ? 0 : dist[i][j]).append(" ");
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}