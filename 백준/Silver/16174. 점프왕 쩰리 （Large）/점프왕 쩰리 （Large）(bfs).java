import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int[][] map;
    public static boolean[][] visited;

    public static void bfs(int posX, int posY) {
        int moveLen = map[posY][posX];
        int[] dx = {moveLen, 0};
        int[] dy = {0, moveLen};

        for (int i = 0; i < 2; i++) {
            int nx = posX + dx[i], ny = posY + dy[i];
            if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[ny][nx]) {
                visited[ny][nx] = true;
                if (nx == N - 1 && ny == N - 1) return;
                bfs(nx, ny);
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

        bfs(0, 0);
        System.out.println(visited[N-1][N-1] ? "HaruHaru" : "Hing");
    }

}
