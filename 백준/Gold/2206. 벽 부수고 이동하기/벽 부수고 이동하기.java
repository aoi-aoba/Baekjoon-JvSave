import java.io.*;
import java.util.*;

public class Main {
    public static int N, M;
    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};
    public static int[][] map;
    public static int[][][] visited;

    public static int bfs() {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {0, 0, 0}); // (posX, posY, brokenWalls)
        visited[0][0][0] = 1;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int isBroken = cur[0], nowY = cur[1], nowX = cur[2];

            for (int i = 0; i < 4; i++) {
                int nx = nowX + dx[i], ny = nowY + dy[i];

                if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
                    if (map[ny][nx] == 0) {
                        if (visited[isBroken][ny][nx] == 0) {
                            visited[isBroken][ny][nx] = visited[isBroken][nowY][nowX] + 1;
                            queue.offer(new int[]{isBroken, ny, nx});
                            if (ny == N - 1 && nx == M - 1)
                                return visited[isBroken][ny][nx];
                        }
                    } else if (isBroken == 0){
                        if (visited[1][ny][nx] == 0) {
                            visited[1][ny][nx] = visited[isBroken][nowY][nowX] + 1;
                            queue.offer(new int[]{1, ny, nx});
                            if (ny == N - 1 && nx == M - 1)
                                return visited[1][ny][nx];
                        }
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new int[2][N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        
        if (N == 1 && M == 1) {
            System.out.println(1);
            return;
        }

        System.out.println(bfs());
    }
}