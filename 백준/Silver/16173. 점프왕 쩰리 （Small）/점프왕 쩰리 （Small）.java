import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int[][] map;
    public static boolean[][] visited;

    public static void bfs() {
        Queue<int[]> Q = new ArrayDeque<>();
        Q.offer(new int[] {0, 0});
        visited[0][0] = true;

        while (!Q.isEmpty()) {
            int[] cur = Q.poll();
            int posX = cur[0], posY = cur[1], moveLen = map[posY][posX];

            int[] dx = {-1 * moveLen, moveLen, 0, 0};
            int[] dy = {0, 0, -1 * moveLen, moveLen};

            for (int i = 0; i < 4; i++) {
                int nx = posX + dx[i], ny = posY + dy[i];
                if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[ny][nx]) {
                    visited[ny][nx] = true;
                    if (nx == N - 1 && ny == N - 1) return;
                    Q.offer(new int[] {nx, ny});
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs();
        System.out.println(visited[N-1][N-1] ? "HaruHaru" : "Hing");
    }
}