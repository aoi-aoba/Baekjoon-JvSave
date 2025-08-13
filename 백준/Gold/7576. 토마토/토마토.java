import java.io.*;
import java.util.*;

public class Main {
    public static int M, N, checked = 0, result = 0;
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static int[][] board, check;
    public static List<int[]> startPoint;

    public static void bfs() {
        Queue<int[]> Q = new ArrayDeque<>();
        for (int i = 0; i < startPoint.size(); i++) {
            Q.offer(new int[] {startPoint.get(i)[0], startPoint.get(i)[1], 0});
            check[startPoint.get(i)[1]][startPoint.get(i)[0]] = -1;
            checked++;
        }

        while (!Q.isEmpty() && checked < M * N) {
            int[] cur = Q.poll();
            int x = cur[0], y = cur[1], d = cur[2];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i], ny = y + dy[i];
                if (nx >= 0 && nx < M && ny >= 0 && ny < N && board[ny][nx] == 0 && check[ny][nx] == 0) {
                    Q.offer(new int[] {nx, ny, d + 1});
                    check[ny][nx] = d + 1;
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

        board = new int[N][M];
        check = new int[N][M];
        startPoint = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == -1) {
                    check[i][j] = -1;
                    checked++;
                }
                else if (board[i][j] == 1) startPoint.add(new int[]{j, i});
            }
        }

        bfs();
        System.out.println(checked == M * N ? result : -1);
     }
}