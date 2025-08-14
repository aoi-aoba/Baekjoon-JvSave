import java.io.*;
import java.util.*;

public class Main {
    public static int[] dx = {1, 2, 3, 4, 5, 6};
    public static int[] board = new int[101];
    public static boolean[] visited = new boolean[101];
    public static Queue<int[]> Q = new ArrayDeque<>();

    public static void bfs() {
        while (!Q.isEmpty() && !visited[100]) {
            int[] cur = Q.poll();
            int x = cur[0], d = cur[1];

            for (int i = 0; i < 6; i++) {
                int nx = x + dx[i];
                if (nx >= 0 && nx < 101 && !visited[nx]) {
                    if (board[nx] == 0) {
                        Q.offer(new int[]{nx, d + 1});
                        visited[nx] = true;
                        board[nx] = d + 1;
                    } else {
                        Q.offer(new int[]{board[nx], d + 1});
                        visited[nx] = true;
                        board[board[nx]] = d + 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ladder = Integer.parseInt(st.nextToken()), snake = Integer.parseInt(st.nextToken());

        for (int i = 0; i < ladder; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken());
            board[start] = end;
        }

        for (int i = 0; i < snake; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken());
            board[start] = end;
        }

        visited[1] = true;
        Q.offer(new int[] {1, 0});
        bfs();
        System.out.println(board[100]);
    }
}