import java.util.*;
import java.io.*;

public class Main {
    public static int N, M, K, max = Integer.MIN_VALUE;
    public static boolean[][] visited;
    public static int[][] board;
    public static boolean canVisit(int r, int c) {
        if (visited[r][c]) return false;
        else if (r != 0 && visited[r-1][c]) return false;
        else if (r != N-1 && visited[r+1][c]) return false;
        else if (c != 0 && visited[r][c-1]) return false;
        else if (c != M-1 && visited[r][c+1]) return false;
        else return true;
    }
    public static void tracker(int row, int cellNum, int sum) {
        if (cellNum > K) return;
        else if (cellNum == K) max = Math.max(max, sum);
        else for (int i = row; i < N; i++)
            for (int j = 0; j < M; j++)
                if (canVisit(i, j)) {
                    visited[i][j] = true;
                    sum += board[i][j];
                    tracker(i, cellNum+1, sum);
                    visited[i][j] = false;
                    sum -= board[i][j];
                }
    }
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        visited = new boolean[N][M];
        board = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++)
                board[i][j] = Integer.parseInt(st.nextToken());
        }

        tracker(0,  0, 0);
        System.out.print(max);
        br.close();
    }
}