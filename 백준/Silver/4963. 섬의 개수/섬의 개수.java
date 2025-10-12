import java.io.*;
import java.util.*;

public class Main {
    public static int w, h;
    public static int[] dx = {-1, 0, 1, 1, 1, 0, -1, -1};
    public static int[] dy = {-1, -1, -1, 0, 1, 1, 1, 0};
    public static int[][] map;

    public static void bfs(int x, int y, boolean[][] visited) {
        Queue<int[]> Q = new ArrayDeque<>();
        Q.offer(new int[] {x, y});
        visited[x][y] = true;

        while (!Q.isEmpty()) {
            int[] cur = Q.poll();
            int cx = cur[0], cy = cur[1];
            for (int i = 0; i < 8; i++) {
                int nx = cx + dx[i], ny = cy + dy[i];
                if (nx >= 0 && ny >= 0 && nx < h && ny < w) {
                    if (map[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        Q.offer(new int[] {nx, ny});
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if (w == h && w == 0) break;

            map = new int[h][w];
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int cnt = 0;
            boolean[][] visited = new boolean[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!visited[i][j] && map[i][j] == 1) {
                        bfs(i, j, visited);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }
    }
}
