import java.io.*;
import java.util.*;

public class Main {
    public static int targetX, targetY, N;
    public static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    public static int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
    public static int[][] board;
    public static boolean[][] visited;

    public static void bfs(int posX, int posY, int depth) {
        Queue<int[]> Q = new ArrayDeque<>();
        Q.offer(new int[]{posX, posY, depth});
        visited[posY][posX] = true;

        while (!Q.isEmpty() && !visited[targetY][targetX]) {
            int[] cur = Q.poll();
            int x = cur[0], y = cur[1], d = cur[2];

            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i], ny = y + dy[i];
                if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[ny][nx]) {
                    visited[ny][nx] = true;
                    board[ny][nx] = d + 1;
                    Q.offer(new int[]{nx, ny, d + 1});
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken()), startY = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            targetX = Integer.parseInt(st.nextToken());
            targetY = Integer.parseInt(st.nextToken());

            board = new int[N][N];
            visited = new boolean[N][N];

            bfs(startX, startY, 0);
            sb.append(board[targetY][targetX]).append("\n");
        }

        System.out.print(sb);
    }
}