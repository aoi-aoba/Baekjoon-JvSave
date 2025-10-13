import java.io.*;
import java.util.*;

public class Main {
    public static int n, m;
    public static int[][] dist;
    public static final int INF = 98764321;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        dist = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                int temp = Integer.parseInt(st.nextToken());
                dist[i][j] = (temp == 0) ? INF : 1;
            }
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
                sb.append(dist[i][j] == INF ? 0 : 1).append(" ");
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}