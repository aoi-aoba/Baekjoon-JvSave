import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static char[][] grid;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        grid = new char[N][M];
        for (int i = 0; i < N; i++) {
            grid[i] = br.readLine().toCharArray();
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == 'X') {
                    for (int d = 0; d < 4; d++) {
                        int ni = i + dx[d];
                        int nj = j + dy[d];
                        if (0 <= ni && ni < N && 0 <= nj && nj < M) {
                            if (grid[ni][nj] == 'Y') ans++;
                        }
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
