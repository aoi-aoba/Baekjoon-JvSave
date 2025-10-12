import java.io.*;
import java.util.*;

public class Main {
    public static int n, maxH = -1, result = 0;
    public static int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};
    public static int[][] map;

    public static void bfs(int x, int y, int h, boolean[][] visited) {
        Queue<int[]> Q = new ArrayDeque<>();
        Q.offer(new int[] {x, y});
        visited[x][y] = true;

        while (!Q.isEmpty()) {
            int[] cur = Q.poll();
            int cx = cur[0], cy = cur[1];
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i], ny = cy + dy[i];
                if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                    if (map[nx][ny] > h && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        Q.offer(new int[] {nx, ny});
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                maxH = Math.max(map[i][j], maxH);
            }
        }

        for (int h = 0; h <= maxH; h++) {
            boolean[][] visited = new boolean[n][n];
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[i][j] && map[i][j] > h) {
                        bfs(i, j, h, visited);
                        cnt++;
                    }
                }
            }

            result = Math.max(result, cnt);
        }

        System.out.println(result);
    }
}
