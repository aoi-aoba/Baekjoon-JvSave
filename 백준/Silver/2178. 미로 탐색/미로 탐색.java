import java.io.*;
import java.util.*;

public class Main {
    public static boolean[][] map;
    public static int[][] visited;
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static int n, m;

    public static void bfs(int posX, int posY, int dist) {
        Queue<int[]> Q = new ArrayDeque<>();
        Q.offer(new int[]{posX, posY, dist});
        visited[posY][posX] = 1;

        while (!Q.isEmpty()) {
            int[] pos = Q.poll();
            int x = pos[0], y = pos[1], d = pos[2];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i], ny = y + dy[i];
                if (nx >= 0 && nx < m && ny >= 0 && ny < n && map[ny][nx] && visited[ny][nx] == 0) {
                    visited[ny][nx] = d + 1;
                    Q.offer(new int[]{nx, ny, d + 1});
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new boolean[n][m];
        visited = new int[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j) == '1';
            }
        }

        bfs(0, 0, 1);
        System.out.println(visited[n-1][m-1]);
    }
}