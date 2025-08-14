import java.io.*;
import java.util.*;

public class Main {
    public static int M, N, H, checked = 0, result = 0;
    public static int[] dx = {-1, 1, 0, 0, 0, 0};
    public static int[] dy = {0, 0, -1, 1, 0, 0};
    public static int[] dz = {0, 0, 0, 0, -1, 1};
    public static int[][][] board;
    public static Queue<int[]> Q = new ArrayDeque<>();

    public static void bfs() {
        while (!Q.isEmpty() && checked < M * N * H) {
            int[] cur = Q.poll();
            int x = cur[0], y = cur[1], z = cur[2], d = cur[3];

            for (int i = 0; i < 6; i++) {
                int nx = x + dx[i], ny = y + dy[i], nz = z + dz[i];
                if (nx >= 0 && nx < M && ny >= 0 && ny < N && nz >= 0 && nz < H && board[nz][ny][nx] == 0) {
                    Q.offer(new int[] {nx, ny, nz, d + 1});
                    board[nz][ny][nx] = d + 1;
                    result = Math.max(result, d + 1);
                    checked++;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        board = new int[H][N][M]; // z-y-x

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    board[i][j][k] = Integer.parseInt(st.nextToken());
                    if (board[i][j][k] == -1) checked++;
                    else if (board[i][j][k] == 1) {
                        Q.offer(new int[]{k, j, i, 0});
                        checked++;
                    }
                }
            }
        }

        bfs();
        System.out.println(checked == M * N * H ? result : -1);
    }
}